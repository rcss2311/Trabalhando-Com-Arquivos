package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		String path = "C:\\WS-Eclipse\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) { //instanciação ocorre dentro do bloco Tri-Catch with resouces 
			String line = br.readLine();									 //eliminando a necessidade de de instanciar fora e enxugando o codigo
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}