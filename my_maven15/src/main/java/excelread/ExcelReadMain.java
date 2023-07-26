package excelread;

import java.io.IOException;

public class ExcelReadMain {

	public static void main(String[] args) throws IOException {
		ExcelFiIeRead obj=new ExcelFiIeRead();
		obj.readFile();
		String value;
		value=obj.readData(3,1);
		System.out.println("data : "+value);

	}

}
