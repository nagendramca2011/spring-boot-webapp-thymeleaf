package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.example.dao.ProductDAO;

@Controller
@RequestMapping("demo")
public class DemoController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String index(){
		return "demo/index";
	}
	
	@RequestMapping(value="productinfo", method=RequestMethod.GET)
	public String productInfo(ModelMap modelMap)
	{
		ProductDAO productDAO=new ProductDAO();
		modelMap.put("product", productDAO.find());
		return "demo/productinfo";
	}

	@RequestMapping(value="productlist", method=RequestMethod.GET)
	public String productlist(ModelMap modelMap)
	{
		ProductDAO productDAO=new ProductDAO();
		modelMap.put("productlist", productDAO.findAll());
		return "demo/productlist";
	}
}
