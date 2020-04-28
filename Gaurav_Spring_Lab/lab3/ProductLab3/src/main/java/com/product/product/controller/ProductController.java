package com.product.product.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.product.product.entity.Product;

@Controller
public class ProductController {

	static ArrayList<Product> product_list = new ArrayList<Product>();
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView displayProducts(Model m){
		
		
		ModelAndView map = new ModelAndView("Products");  
		
		map.addObject("lists", product_list);
		    
		return map;
	}
	
	@RequestMapping(value = { "/showAddProduct" }, method = RequestMethod.GET)
	public String displayFormToAddProduct(){
		return "ProductForm";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct(HttpServletRequest request){
		int pId       = Integer.parseInt(request.getParameter("id"));
		String pName  = request.getParameter("name");
		double pPrice = Double.parseDouble(request.getParameter("price"));
		Product prod  = new Product(pId, pName, pPrice);
		product_list.add(prod);
		return "redirect:/";
	}
}
