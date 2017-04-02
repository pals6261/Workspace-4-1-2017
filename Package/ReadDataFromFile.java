package Package;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadDataFromFile {

	public void readdata() throws Exception {

		String inputFilePath = "C:\\Users\\ramya\\workspace\\SeleniumProgramm\\src\\Package\\read";
		FileReader Fr = new FileReader(inputFilePath);
		BufferedReader br= new BufferedReader(Fr);
		String inputData;
		
		while((inputData =br.readLine())!=null)
		{
			System.out.println(inputData);		
		}
		Fr.close();
	}

	public void writeDataToTextFile() throws Exception
	{
		String outputFilePath = "C:\\Users\\ramya\\workspace\\SeleniumProgramm\\src\\Package\\read";
		FileWriter fw = new FileWriter(outputFilePath);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello Hi");
		bw.close();
		fw.close();
	}
	
	public void readWriteTextFileData() throws Exception
	{
		String inputFilePath = "C:\\Users\\ramya\\workspace\\SeleniumProgramm\\src\\Package\\read";
		FileReader fr = new FileReader(inputFilePath); 
		BufferedReader br = new BufferedReader(fr);
		String outputFilePath = "C:\\Users\\ramya\\workspace\\SeleniumProgramm\\src\\Package\\read";
		FileWriter fw = new FileWriter(outputFilePath);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String inputData;
		
		while((inputData =br.readLine())!=null) 
		{
			bw.write(inputData+"\r\n");
		}
		
		fr.close();
		bw.close();
		fw.close();
	}
	
	
	

	public static void main(String[] args) throws Exception {
		
		ReadDataFromFile text = new ReadDataFromFile();
		text.readWriteTextFileData();


	}	}


