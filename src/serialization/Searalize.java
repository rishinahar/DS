package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Searalize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		e.name = "test";
		e.address = "test1";

		Employee e2 = null;
		try {
			FileOutputStream file = new FileOutputStream("/home/rishinahar/Desktop/Test1.txt");

			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(e);

			FileInputStream fileIn = new FileInputStream("/home/rishinahar/Desktop/Test1.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);

			e2 = (Employee) in.readObject();

			System.out.println(e.name + " " + e.address);
			System.out.println(e2.name + " " + e2.address);
			System.out.println(e.hashCode() + " " + e2.hashCode());

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
