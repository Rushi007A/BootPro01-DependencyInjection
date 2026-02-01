package com.nit.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {

	//bean property
	@Autowired
	
	private LocalDate ldt;
	
	//b method
	public String findSeason() {
		//get current month
		int month=ldt.getMonthValue();
		
		if(month>=3 && month <=6)
			return "summer Seation";
		else if(month >=7 && month <=9)
			return "Rainy Season";
		
		else
			return "Winter Season";
				
	}
	
}
