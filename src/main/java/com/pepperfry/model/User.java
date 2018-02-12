package com.pepperfry.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
		@Id
		private String username;
		private String password;
		private String name;
		private String email;
		private String phn;
		private String roll="ROLE_USER";
		private boolean enabled;
		
		@OneToOne
	    @JoinColumn(name = "cartid")
	    private Cart cart;
		
		public Cart getCart() {
			return cart;
		}
		public void setCart(Cart cart) {
			this.cart = cart;
		}
		
		
		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhn() {
			return phn;
		}
		public void setPhn(String phn) {
			this.phn = phn;
		}
		public String getRoll() {
			return roll;
		}
		public void setRoll(String roll) {
			this.roll = roll;
		}
		public boolean isEnabled() {
			return enabled;
		}
		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}
	}