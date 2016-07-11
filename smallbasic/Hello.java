package com.coducation.smallbasic;

import java.io.FileReader;
import java.io.IOException;

public class Hello
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("testris.sb");
		Lexer Lexing = new Lexer(fr);
		
		Lexing.Lexing();
	}
}
