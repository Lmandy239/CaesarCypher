package com.skilldistillery.caesarcipher;

import java.util.ArrayList;

public class CaesarCipher {

	
	
	public CaesarCipher() {}
	
	
	public String encrypt(String text, int shift) {  
	ArrayList<Character> abc = new ArrayList<>();
	char[] temporary = text.toCharArray();
	ArrayList<Character> stringText = new ArrayList<>();
	for(char i = 'a'; i <= 'z'; i++) {
		abc.add(i);
	}
	for(char c: temporary) {
		stringText.add(c);
	}
	
	for(int i = 0; i < stringText.size(); i++) {
		char currentChar = stringText.get(i);
		
		if(abc.contains(currentChar)) {
			int originalIndex = abc.indexOf(currentChar);
			int newIndex = (originalIndex + shift) % abc.size();
			stringText.set(i, abc.get(newIndex));
		}
	}
	
	StringBuilder sb = new StringBuilder();
	for(char c: stringText) {
	sb.append(c);}
	
    return sb.toString();
  }

	public String decrypt(String text, int shift) {
		String result = null;
		// Decryption logic here
		return result;
	}

	private char encryptChar(char toEncrypt, int shift) {
		char encrypted = '\u0000';
		return encrypted;
	}

	private char decryptChar(char toDecrypt, int shift) {
		char decrypted = '\u0000';
		return decrypted;
	}

}
