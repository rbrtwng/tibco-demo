package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger=LoggerFactory.getLogger(Main3.class);
		
		TLogger tlogger=new TLogger(logger);
		tlogger.log();

	}

}
