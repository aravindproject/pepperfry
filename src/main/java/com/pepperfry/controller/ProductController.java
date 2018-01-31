
package com.pepperfry.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.pepperfry.model.Category;
import com.pepperfry.model.Product;
import com.pepperfry.model.Supplier;
import com.pepperfry.service.CategoryService;
import com.pepperfry.service.ProductService;
import com.pepperfry.service.SupplierService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@Autowired
	private SupplierService supplierService;

	@Autowired
	private CategoryService categoryService;

	String path = "C:\\Users\\divi\\Documents\\GitHub\\pepperfry\\src\\main\\webapp\\resources\\images\\";

	@RequestMapping("productcrud")
	public ModelAndView producthome(@ModelAttribute("command") Product product) {
		return new ModelAndView("productcrud");
	}

	@RequestMapping("product")
	public ModelAndView listProduct(@ModelAttribute("command") Product product) 
	{
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("product", new Product());
		model.put("supplier", new Supplier());
		model.put("category", new Category());
		model.put("productList", this.productService.getproduct());
		model.put("categoryList", this.categoryService.getcategory());
		model.put("supplierList", this.supplierService.getAllSuppliers());

		return new ModelAndView("productcrud", model);
	}

	@RequestMapping("saveProduct")
	public ModelAndView savecategory(Product product) 
	{
		productService.createorupdate(product);
		MultipartFile image = product.getImage();
		FileUtil.upload (path, image, product.getPid() + ".jpg");
		return new ModelAndView("redirect:/homeadmin");
	}

	@RequestMapping(value = "/deleteProduct", method = RequestMethod.GET)
	public ModelAndView deleteproduct(@ModelAttribute("command") Product product,
			@RequestParam("productPid") Integer pid, BindingResult result) 
	{
		productService.delete(pid);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("productList", productService.getproduct());
		return new ModelAndView("productcrud", model);
	}

	@RequestMapping(value = "/editProduct", method = RequestMethod.GET)
	public ModelAndView editproduct(@ModelAttribute("command") Product product, @RequestParam("productPid") Integer pid,
			BindingResult result)
	{
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("supplier", new Supplier());
		model.put("category", new Category());
		model.put("categoryList", this.categoryService.getcategory());
		model.put("supplierList", this.supplierService.getsupplier());
		model.put("product", productService.getproduct(pid));
		model.put("productList", productService.getproduct());
		return new ModelAndView("productcrud", model);
	}

	@RequestMapping(value = ("/viewproduct"),method = RequestMethod.GET)
	public ModelAndView viewProduct(ModelMap model, Principal principal) 
	{
		String name = principal.getName();
		  model.addAttribute("user", name);
		Map<String, Object> modell = new HashMap<String, Object>();
		Gson gson = new Gson();
		String temp = gson.toJson(productService.getproduct());
		model.put("productList", temp);
		return new ModelAndView("viewproduct", modell);
	}
}
