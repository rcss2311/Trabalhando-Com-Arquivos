package application;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Program {
	public static void main(String[] args) {
		String path = "C:\\WS-Eclipse\\in.txt";
		BufferedReader br = null;
		FileReader fr = null;
		try {
				fr = new FileReader(path);
				br = new BufferedReader(fr);
				String line = br.readLine();// .read line lê apenas uma linha do codigo
					while (line != null) {// usando while para ler o arquivo texto, vai ler até line ter valor null
						System.out.println(line); //printa a linha
						line = br.readLine();// passa pra proxima linha do arquivo
					}
		} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
		} finally {
		try {
				if (br != null)
					br.close();
				if (fr != null)
						fr.close();
		} catch (IOException e) {
				e.printStackTrace();
				}
			}
	}
}