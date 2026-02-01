package com.nit;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.sbeans.SeasonFinder;

@SpringBootApplication
public class BootPro01DependencyInjectionApplication {
	@Bean(name="id")
	public LocalDate createDate() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		System.out.println("BootPro01DependencyInjectionApplication.main()(start)");
	  try(ConfigurableApplicationContext ctx=SpringApplication.run(BootPro01DependencyInjectionApplication.class,args);){
	   SeasonFinder finder=ctx.getBean("sf",SeasonFinder.class);
	   
	   System.out.println("ctx obj name::"+ctx.getClass());
	   
	   String seasonName=finder.findSeason();
	   System.out.println("season Name::"+seasonName);
	  }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	  System.out.println("BootPro01DependencyInjectionApplication.main()(end)");
	  
	}

}
