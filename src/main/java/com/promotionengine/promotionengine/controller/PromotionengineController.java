package com.promotionengine.promotionengine.controller;

import java.io.IOException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.promotionengine.promotionengine.DTO.PromotionengineDTO;
import com.promotionengine.promotionengine.VM.PromotionengineVM;
import com.promotionengine.promotionengine.service.Promotionengineservice;

@RestController
public class PromotionengineController {
	@Autowired
	Promotionengineservice promotionengineservice;

	@RequestMapping(name = "/getAmount" , method =RequestMethod.POST )
	public ResponseEntity<PromotionengineVM> getAmount(@Valid @RequestBody PromotionengineDTO promotionengineDTO)
			throws IOException {
		PromotionengineVM promotionengineVM = promotionengineservice.getAmount(promotionengineDTO);
		System.out.println("Total Amount" +promotionengineVM.getTotalAmount());
		return new ResponseEntity<PromotionengineVM>(promotionengineVM, HttpStatus.CREATED);
	}
}
