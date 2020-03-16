import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTextFile {
	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\Akash\\Desktop\\Hi.txt"));
			String currentLine = reader.readLine();
			while (currentLine != null) {
				System.out.println(currentLine);
				currentLine = reader.readLine();
			}
			reader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
