package serialization;

//import serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class TestMain {
	public static void main(String[] args) {
		try {
			StudentInfo si = new StudentInfo("Ajay",104,"928938398");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Desktop\\student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(si);
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
