package _183_file_writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program183 {

	public static void main(String[] args) {
	
		String[] lines = new String[] {"-------------", "Bom dia", "Boa tarde", "Boa noite"};
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)))
		{
			for(String line: lines)//Para cada String line contido no vetor lines;
			{
				bw.write(line);// irei escrever a linha no arquivo;
				bw.newLine();//criação de uma nova linha
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
