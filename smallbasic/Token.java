package com.coducation.smallbasic;

public enum Token
{
	// (), {}
	// .
	// ���� -
	// ����, ������
	// ���� ����	
	// �������� > < >= <= = <>
	// �Ҵ翬���� =
	
	BINARY_PLUS, // O + O
	BINARY_MINUS, // O - O
	BINARY_MULTIFLICATION, // O * O
	BINARY_DIVISION, // O / O
	UNARY_MINUS, // -O
	
	
	LESS, // O < O
	LESS_EQUAL, // O <= O
	BIGGER, // O > O
	BIGGER_EQUAL, // O >= O
	EQUAL, // O = O
	NOT_EQUAL, // O <> O
	
	ASSIGN, // Var or Property = expr
	DOT, // Object.Propertyname of Object.MethodName
	COMMA, // Mathod1(Param1, Param2, ... , Paramn)
	COLON,// Label
}
