package com.anthony.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.anthony.exception.CamelCustomException;

public class MyProcessor implements Processor {

  
    	public void process(Exchange exchange) throws Exception {
            String a = exchange.getIn().getBody(String.class);
            System.out.println("hello " + a);
            if (a.equalsIgnoreCase("test"))
                throw new CamelCustomException();
  
    }

}

