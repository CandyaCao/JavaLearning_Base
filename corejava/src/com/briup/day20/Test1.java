package com.briup.day20;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		
			File file = new File("E:\\����");
			list(file);
		}

		/**
		 * ��ĳһ���ļ��еı���
		 * 
		 * @param file
		 */
		public static void list(File file) {

			File[] files = file.listFiles();
			for (File f : files) {
				System.out.println(f.getAbsolutePath());
				if (f.isDirectory()) {
					System.err.println();
					list(f);
				}
			}

		}
	}

