package com.java8.lambdaexpressions;

import java.util.function.Consumer;

public class TestLambda1 {
	
	String param = "bonjour REFCLI";

	public static void main(String[] args) {
	    Consumer<String> afficher = (String param) -> System.out.println(param);
	  }
}
