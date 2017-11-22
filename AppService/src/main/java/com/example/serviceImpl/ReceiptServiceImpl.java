package com.example.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.entity.Receipt;
import com.example.service.ReceiptService;

@Service
public class ReceiptServiceImpl implements ReceiptService {

	@Override
	public Receipt getReceipt(String valor, int id) {
		Receipt receipt = new Receipt();

		receipt.setId(id);
		if (valor.equals("") || valor == null) {
			receipt.setNameClient("Juan2");
		} else {
			receipt.setNameClient(valor);
		}
		receipt.setPrice(51.2);

		return receipt;
	}

}
