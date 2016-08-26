package com.yxph.testproject1;

import java.io.IOException;

public class RuleExector {
	
	public static void main(String[] args){
		try {
			new test().test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
