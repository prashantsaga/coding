package com.example.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("adharNo")
public class AdharController {
	@Autowired
	private AdharRepository adharNoRepository;
	
	@PostMapping
	public AdharCard save(@RequestBody AdharCard adhar)
	{
		return adharNoRepository.save(adhar);
	}

}
/*
   {
       "houseNo": "koderma/123",
	 "streetName": "phulwaria",
	 "adharNo": 809561259561, 
	  "student":{
	  "id":101
   }
   }
 */
