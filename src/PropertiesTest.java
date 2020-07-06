import java.util.*;  
import java.io.*;  
public class PropertiesTest {  
	public static void main(String[] args)throws Exception{  
	    FileReader reader=new FileReader("db.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	   String UN=p.getProperty("user");
	    
	   String PWD=p.getProperty("password");
	   
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password"));  
	}  
}  