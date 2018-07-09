package com.anthony.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
//try to change message to not get exception
public class RedeliveryProcessor implements Processor {
	public void process(Exchange exchange) throws Exception {     
        exchange.getIn().setBody("test1");
    }
}
