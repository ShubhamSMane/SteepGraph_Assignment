import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

public class Assignment1 {

	public static void main(String[] args)  {
		
		
		//making new  text files using file using file 
				File myFile=new File("comment.txt");
				File myFile2=new File("code.txt");
				try {
					
				if(myFile.createNewFile()) {
					System.out.println("Comment file created successfully");
					
				}else {
					System.out.println("Comment file creation error");
				}//Above code for Comment file 
				
				//below code fro code fiel creation
				if(myFile2.createNewFile()) {
					System.out.println("Code file created successfully");
					
				}else {
					System.out.println("Code file creation error");
				}
				}catch(IOException e) {
					System.out.println("file Creating error is"+e);
				}//I use try and catch for checking error for file creating method
		
		
		// TODO Auto-generated method stub
		//then read our text file 
		
		File file=new File("C:\\\\Users\\\\Ultimate\\\\Desktop\\\\Steepgraph\\\\1_Program.txt");
		try {
		//for reading file we use BufferedReader by importing BufferREader class
		try(BufferedReader br=new BufferedReader(new FileReader(file))){
			String line;
			
			//first I stort comment file in a f1 name 
		
			File f1=new File("C:\\Users\\Ultimate\\Desktop\\Steepgraph\\Steepgraph_Assignment\\comment.txt"); //I use my file path you can change file name
			//I use while loop for read line one by one and check
	
			//Also I Store code file in ft name
	
			File ft=new File("C:\\Users\\Ultimate\\Desktop\\Steepgraph\\Steepgraph_Assignment\\code.txt");
	
			//we use while condition for read all file
			while((line=br.readLine()) !=null) {
//					I use if condition for seprate comment line and add in comment file
				if(line.contains("//")||line.contains("*")||line.contains("...") ){
					System.out.println(line);
					
//					FileWriter output= new FileWriter("");
					FileWriter fileWriter =new FileWriter(f1.getName(),true);
					BufferedWriter bw=new BufferedWriter(fileWriter);
					bw.write(line+"\n");
					bw.close();
					System.out.println("Done");
					
				}else //In else part I put only code line in code fiel
				{
					FileWriter fileWriter =new FileWriter(ft.getName(),true);
					BufferedWriter bw=new BufferedWriter(fileWriter);
					bw.write(line+"\n");
					bw.close();
					System.out.println("Done code");
					
				}
			}
		}
		
		//I use full path of file becaues file is in another path and program in another path

		}catch(IOException e) {
			System.out.println("File reading error"+e);
		}//we try and catch for showing file reading error
		
		
		
		
		
		
		
	

	}

}
