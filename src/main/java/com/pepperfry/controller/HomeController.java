package com.pepperfry.controller;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.annotations.JsonAdapter;
import com.pepperfry.model.Product;
import com.pepperfry.service.ProductService;
import com.pepperfry.service.SupplierService;

@Controller
public class HomeController {

	@Autowired
	public SupplierService supplierService;
	
	@Autowired
	public ProductService productService;
	
	
	@RequestMapping("/")
	public ModelAndView index(){
		return new ModelAndView("index");
	}
 
	
	@RequestMapping("adminHome")
	public ModelAndView adminHome(){
		return new ModelAndView("adminHome");
	}
	

	@RequestMapping("listAllProducts")
	public ModelAndView listAllProducts(){
		Map<String, Object> model = new HashMap<String, Object>();
	
	 
        Gson gson = new Gson();
        String products = gson.toJson(this.productService.getproduct());
    	model.put("product", products);
		return new ModelAndView("listAllProducts", model);
	}
	
	
}
