package org.example;

import java.util.Date;

import org.apache.log4j.xml.DOMConfigurator;
import org.slf4j.Logger;

public class TLogger {
	
	Logger logger;
	Date date= new java.util.Date();
	
	public TLogger(Logger logger){
		this.logger=logger;
	}
	
	public void log(){
		DOMConfigurator.configure("./src/org/example/log4j.xml");
		while (true){
			logger.info("logging time:"+date.getTime());
			try {
				Thread.currentThread().sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
