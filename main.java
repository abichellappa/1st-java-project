package abi1;
import java.io.File;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
import java.util.regex.Pattern;
import java.io.IOException;
import java.io.FileWriter;
public class main {

	public static void main(String[] args) 
	{
        try 
        {
            File Obj = new File("myfile.txt");
            if (Obj.createNewFile()) 
            {
                System.out.println("File created: "
                                   + Obj.getName());
            }
            else 
            {
            	
            	Scanner Reader = new Scanner(Obj);
                while (Reader.hasNextLine()) 
                {
                	String name=Reader.next();
                    String data = Reader.next();
                   // System.out.println(data);
                    if(Pattern.matches("[7-9]{1}[0-9]{9}", data))
                    {
                    	File Obj1 = new File(name+".txt");
                        if (Obj1.createNewFile()) 
                        {
                           // System.out.println("File created: "
                                             //  + Obj.getName());
                        }
                        else
                        {
                        	Calendar cal=Calendar.getInstance();
                        	String time=cal.getTime().toString();
                        	FileWriter Writer =new FileWriter(name+".txt");
                        	Writer.write(time);
                        	Writer.close();
                        }

                    }
                }
                Reader.close();
            }
        }
        catch (IOException e) 
        {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }


	}

}
