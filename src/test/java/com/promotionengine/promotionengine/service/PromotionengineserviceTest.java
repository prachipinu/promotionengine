package com.promotionengine.promotionengine.service;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.promotionengine.promotionengine.DTO.PromotionengineDTO;
import com.promotionengine.promotionengine.VM.PromotionengineVM;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PromotionengineserviceTest {

	@Mock
	Promotionengineservice promotionengineservice;
	
	@Test
	public void testgetBasicAmount() {
		PromotionengineDTO promotionengineDTO = new PromotionengineDTO();
		PromotionengineVM promotiFonengineVM = new PromotionengineVM();
		when(promotionengineservice.getAmount(promotionengineDTO)).thenReturn(promotiFonengineVM);
		
	}
	

}
