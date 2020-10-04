package com.promotionengine.promotionengine.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;


import org.springframework.stereotype.Service;

import com.promotionengine.promotionengine.DTO.PromotionengineDTO;
import com.promotionengine.promotionengine.VM.PromotionengineVM;

@Service
public class Promotionengineservice {

	public PromotionengineVM getAmount(@Valid PromotionengineDTO promotionengineDTO) {
		PromotionengineVM promotionengineVM = new PromotionengineVM();
        int priceA = 50;
        int priceB = 30;
        int priceC = 20;
        int priceD = 15;
		HashMap<String, Integer> countMap= new HashMap<String, Integer>();
		for(String s:promotionengineDTO.getOrdersList()) {
			countMap.putIfAbsent(s, 0);
			countMap.put(s, countMap.get(s)+1);
		}	
		int totalpriceA = (countMap.get("A") / 3) * 130 + ((countMap.get("A")) % 3 * priceA);
        int totalpriceB = (countMap.get("B") / 2) * 45 + ((countMap.get("B")) % 2 * priceB);
        int totalpriceC = (countMap.get("C") * priceC);
        int totalpriceD = (countMap.get("D") * priceD);
        promotionengineVM.setTotalAmount(totalpriceA+totalpriceB+totalpriceC+totalpriceD);
        return promotionengineVM;
	}

}
