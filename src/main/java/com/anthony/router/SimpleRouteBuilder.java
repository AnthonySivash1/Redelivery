package com.anthony.router;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

import com.anthony.exception.CamelCustomException;
import com.anthony.processor.MyProcessor;
import com.anthony.processor.RedeliveryProcessor;


public class SimpleRouteBuilder extends RouteBuilder {
	 @Override
	    public void configure() throws Exception {
		 onException(CamelCustomException.class).process(new Processor() {

	            public void process(Exchange exchange) throws Exception {
	                System.out.println("handling ex");
	            }
	            //redilievery attempts to redileiever a file if an exception was thrown
	        }).onRedelivery(new RedeliveryProcessor()).redeliveryPolicyRef("testRedeliveryPolicyProfile").log("Received body ").handled(true);
	        from("file:C:/inputFolder?noop=true").process(new MyProcessor()).to("file:C:/outputFolder");
	            

	       
	    }
	 
}
	 
