package com.example.demo.service;

import com.example.demo.interfaces.Strategy;

public class OperationMinus implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		return num1-num2;
	}

}
