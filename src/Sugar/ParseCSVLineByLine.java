package Sugar;

import java.io.FileReader;
import java.util.Arrays;

import au.com.bytecode.opencsv.CSVReader;

public class ParseCSVLineByLine
{
   public static void main(String[] args) throws Exception
   {
	      CSVReader reader = new CSVReader(new FileReader("practice.csv"), ',' , '"' , 0);
	       
	      //Read CSV line by line and use the string array as you want
	      String[] nextLine;
	      while ((nextLine = reader.readNext()) != null) {
	         if (nextLine != null) {
	            //Verifying the read data here
	            System.out.println(Arrays.toString(nextLine));
	         }
	       }
	   
   }
}
