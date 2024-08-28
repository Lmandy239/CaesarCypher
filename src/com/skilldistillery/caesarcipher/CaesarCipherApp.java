package com.skilldistillery.caesarcipher;

public class CaesarCipherApp{

	public static void main(String[] args) {
	
		CaesarCipher Cc = new CaesarCipher();
		
		String result = Cc.encrypt("dog", 3);
		
		
		System.out.println(result);
		
	}

}
