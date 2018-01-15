package Csv;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSVWithScanner {

	public static void main(String[] args) throws IOException
	{
		BufferedReader reader =new BufferedReader(new FileReader("practice.csv"));
		String line =null;
		Scanner scanner =null;
		int index =0;
		List<Employee> emplist=new ArrayList<>();
		while ((line=reader.readLine())!=null)
		{
			Employee emp =new Employee();
			scanner =new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext()){
				String data =scanner.next();
				if (index==0)
				{
					emp.setId(Integer.parseInt(data));
				}
				else if (index==1)
						{
					emp.setName(data);
						}	
				else if (index==2)
				{emp.setRole(data);
				}
				else if (index==3)
				{
					emp.setSalary(data);
				}	
				else {
					System.out.println("Invalid Data ::" +data);
					
				}
				index++;
				
			
			}
			index=0;
			emplist.add(emp);
		System.out.println(emp.toString());	
		}
		
		reader.close();
		
		System.out.println(emplist);
		
	}
	
}
