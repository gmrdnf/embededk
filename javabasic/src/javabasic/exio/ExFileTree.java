package javabasic.exio;

import java.io.File;

public class ExFileTree {
	public static void main(String[] args) {
		printFileTree(new File("C:\\"));
		
	} 
	private static void printFileTree(File file) {
		File[] files = file.listFiles();
		if(files!=null) {
			for(File f : files) {
				if(f.isDirectory()) {
					System.out.println("["+f.getName()+"]");
					printFileTree(f);//재귀/recursive
				}else if (f.isFile()) {
					System.out.println("\t"+f.getName()+"("+f.length()+")") ;
				}
			}
		}
	}
	
	
	
	
}
