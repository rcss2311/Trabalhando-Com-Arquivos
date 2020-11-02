package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory); // criaa um vetor com a lista de todas as pastas
															//isDirectory pega o caminho de cada pasta e coloca dentro do vetor' 
		System.out.println("FOLDERS:");
		
		for (File folder : folders) {
			System.out.println(folder);
		}//até aqui, imprime uma lista de pastas contidas no caminho
		
		File[] files = path.listFiles(File::isFile);//imprime apenas arquivos com o metodo isFile
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		boolean success = new File(strPath + "\\subdir").mkdir();//cria uma sub pasta a partir do strPath 
		System.out.println("Directory created successfully: " + success);
		sc.close();
	}
}