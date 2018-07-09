package com.anthony.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.anthony.exception.CamelCustomException;

public class MyProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
       // System.out.println("hello");
    	System.out.println("Exception Thrown");
        throw new CamelCustomException();
    }

}

