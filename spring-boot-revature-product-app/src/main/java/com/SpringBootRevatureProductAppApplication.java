package com;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.revature.training.pms.model.Customer;
import com.revature.training.repository.CustomerRepository;

@SpringBootApplication
public class SpringBootRevatureProductAppApplication {

	Logger logger = LoggerFactory.getLogger(SpringBootRevatureProductAppApplication.class);
	public static void main(String[] args) {
		 SpringApplication application = new SpringApplication(SpringBootRevatureProductAppApplication.class);
		//application.setAdditionalProfiles("native");
	    application.run(args);
	}
	
	  @Autowired 
	    private CustomerRepository repository; 
	  
	    @EventListener(ApplicationReadyEvent.class)
	    public void runAfterStartup() {
	        List allCustomers = this.repository.findAll(); 
	        logger.info("Number of customers: " + allCustomers.size());
	 
	        Customer newCustomer = new Customer(); 
	        newCustomer.setFirstName("John"); 
	        newCustomer.setLastName("Doe"); 
	        logger.info("Saving new customer..."); 
	        this.repository.save(newCustomer); 
	 
	        allCustomers = this.repository.findAll(); 
	        logger.info("Number of customers: " + allCustomers.size());
	    }
}
