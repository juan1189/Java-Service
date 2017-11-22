package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Receipt;

@Controller
@RequestMapping("receipt")
public class ReceiptController {

	@GetMapping("get")
	public Receipt getReceipt(){
		Receipt receipt = new Receipt();
		
		return receipt;
	}
}
