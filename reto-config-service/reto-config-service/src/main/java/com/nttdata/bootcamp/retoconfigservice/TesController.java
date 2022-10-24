package com.nttdata.bootcamp.retoconfigservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesController {

	
	@Value("${product.product-name}")
	private String myProduct;
	
	
	@GetMapping(path="/getProductname")
	public String myProduct() {
		return this.myProduct;
	}
}
