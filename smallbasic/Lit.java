package com.coducation.smallbasic;

public class Lit extends Expr
{
	public Lit(String lit)
	{
		super();
		this.lit = lit;
	} // Builder
	
	/* Notice 
	 * 123  
	 * 3.14
	 * 'a', '��' // �� ... �� �������� ����ؾ� ��
	 * Unicode.
	 */
	
	private String lit;
}
