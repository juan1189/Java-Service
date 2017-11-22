package com.example.serviceController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Receipt;
import com.example.entity.ResultBean;
import com.example.service.ReceiptService;
import com.example.util.Enum.ESTATUS_REQUEST;

@RestController
@RequestMapping(value="receipt")
public class ReceiptServiceController {

	@Autowired
	private ReceiptService receiptService;
	
	@GetMapping("/hola")
	public String returnHola(){
		return "hola";
	}
	
	@GetMapping("/get")
	public ResultBean getReceipt(){
		Receipt receipt = null;
		 ResultBean result = new ResultBean();
		try {
			
			receipt = new  Receipt();
			receipt.setId(1);
			receipt.setNameClient("Juan");
			receipt.setPrice(51.2);
			
			result.setEstatus(ESTATUS_REQUEST.EXITO.getState());
			result.setMessage(ESTATUS_REQUEST.EXITO.getMessage());
			result.setBody(receipt);
			
		} catch (Exception e) {
			result = new ResultBean();
			System.err.println(e.getMessage());			
			result.setEstatus(ESTATUS_REQUEST.ERROR.getState());
			result.setMessage(ESTATUS_REQUEST.ERROR.getMessage());
		}
		
		return result;
	}
	
	@GetMapping("/get/{id}")
	public ResultBean getReceiptById(@RequestParam("valor")String otro, @PathVariable("id")int idReceipt){
		
		 ResultBean result = new ResultBean();
		try {
			
			Receipt receipt = receiptService.getReceipt(otro, idReceipt);
			
			result.setEstatus(ESTATUS_REQUEST.EXITO.getState());
			result.setMessage(ESTATUS_REQUEST.EXITO.getMessage());
			result.setBody(receipt);
			
		} catch (Exception e) {
			result = new ResultBean();
			System.err.println(e.getMessage());			
			result.setEstatus(ESTATUS_REQUEST.ERROR.getState());
			result.setMessage(ESTATUS_REQUEST.ERROR.getMessage());
		}
		
		return result;
	}
}
