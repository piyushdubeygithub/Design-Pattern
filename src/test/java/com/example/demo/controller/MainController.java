package com.example.demo.controller;

import com.example.demo.service.Context;
import com.example.demo.service.OperationAdd;
import com.example.demo.service.OperationMinus;
import com.example.demo.service.OperationMultiply;

public class MainController {

	public static void main(String args[]) {
		 Context context = new Context(new OperationAdd());		
	      System.out.println("10 + 5 = " + context.executeOperation(10, 5));

	      context = new Context(new OperationMinus());		
	      System.out.println("10 - 5 = " + context.executeOperation(10, 5));

	      context = new Context(new OperationMultiply());		
	      System.out.println("10 * 5 = " + context.executeOperation(10, 5));
	}
}
