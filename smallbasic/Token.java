package com.coducation.smallbasic;

public enum Token
{
	// (), {}
	// .
	// ´ÜÇ× -
	// °ö¼À, ³ª´°¼À
	// µ¡¼À »¬¼À	
	// ³í¸®¿¬»êÀÚ > < >= <= = <>
	// ÇÒ´ç¿¬»êÀÚ =
	
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
