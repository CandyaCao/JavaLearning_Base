package com.briup.day21;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {

	public static void main(String[] args) throws Exception {

		File file = new File("briup.txt");
		Writer writer = new FileWriter(file);
		writer.write("��������������һ�������������������������ز�");
		writer.close();

	}

}
