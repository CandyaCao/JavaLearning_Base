package com.candyacao.javademo.io;

import java.io.IOException;
import java.io.StringBufferInputStream;

public class StringBufferInputStreamTester {
	public static void main(String[] args) {
		StringBufferInputStream sbis = new StringBufferInputStream("abcd123好");
		boolean data;
		while((data=sbis.read()!=-1)) {
			System.out.println(data);
		}
		try {
			sbis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
