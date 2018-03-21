/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.String.join;

/**
 *
 * @author Nehemias Miranda
 */
public class myMethods {

    myMethods(){
        //Empty Default Constructor
        //Utilized to create objects
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Test for join 
        System.out.println("Testing join()");
        String a = "1st"; String b = "2nd";
        String c = "3rd"; String d = "4th"; String e = "@";
        myMethods tst= new myMethods();
        tst.join(a, b, c, d, e);
        System.out.println("###################################");
        //Test for orderAscending 
        System.out.println("Testing orderAscending()");
        String x= "AValue"; String y = "anotherValue"; String z= "!!!";
        myMethods tst2 = new myMethods();
        String ordered = tst2.orderAscending(x,y);
        System.out.println(ordered);
        //Test for orderAscending 3 parameters
        myMethods tst3 = new myMethods();
        String ordered2 = tst3.orderAscending(x, y, z);
        System.out.println(ordered2);
        System.out.println("###################################");
        //Test for orderAscending ignoring case 2 param
        System.out.println("Testing orderAscIgnoreCase()");
        myMethods tst4 = new myMethods();
        String ordered3 = tst4.orderAscendingIgnoreCase(x, y);
        System.out.println(ordered3);
        myMethods tst5 = new myMethods();
        String ordered4 = tst5.orderAscendingIgnoreCase(x, y, z);
        System.out.println(ordered4);
        System.out.println("###################################");
        //Test for orderAscending ignoring case 3 param
        String word= "123456AbCdEfGhIj";
        System.out.println("Reversing: "+ word);
        myMethods tst6 = new myMethods();
        //Test for reverse string
        String reversed= tst6.reverse(word);
        System.out.println(reversed);
        System.out.println("###################################");
        //Test for is palindrome
        String pal= "racecar"; String pal2 = "WxY"; String pal3 = "abcdecba";
        myMethods tst7 = new myMethods();
        if(tst7.isPalindrome(pal))
            System.out.println("The string: "+pal + " is palindrome");
        else System.out.println("The string: "+pal + " is not a palindrome");
        if(tst7.isPalindrome(pal2))
            System.out.println("The string: "+pal2 + " is palindrome");
        else System.out.println("The string: "+pal2 + " is not a palindrome");
        if(tst7.isPalindrome(pal3))
            System.out.println("The string: "+pal3 + " is palindrome");
        else System.out.println("The string: "+pal3 + " is not a palindrome");
        System.out.println("###################################");
        
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        myMethods tst8 = new myMethods();
        
        try {
			if (tst8.fileCompare(file1, file1)){
				System.out.println("Testing fileCompare (file1.txt, file1.txt): Files are the same");
			}
			else System.out.println("Testing fileCompare (file1.txt, file2.txt): Files are different");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
		
		try {
			if (tst8.fileCompare(file1, file2)){
				System.out.println("Testing fileCompare (" + file1+","+ file1+"): Files are the same");
			}
			else System.out.println("Testing fileCompare (" + file1+", "+ file2+"): Files are different");
		} catch (FileNotFoundException e11) {
			// TODO Auto-generated catch block
			e11.printStackTrace();
		} catch (IOException e11) {
			// TODO Auto-generated catch block
			e11.printStackTrace();
		}
		try {
			if (tst8.fileCompare(file2, file1)){
				System.out.println("Testing fileCompare (" + file1+","+ file1+"): Files are the same");
			}
			else System.out.println("Testing fileCompare (" + file2+", "+ file1+"): Files are different");
		} catch (FileNotFoundException e11) {
			// TODO Auto-generated catch block
			e11.printStackTrace();
		} catch (IOException e11) {
			// TODO Auto-generated catch block
			e11.printStackTrace();
		}
		//End of test Class 
		}
     //Order Ascending class : Accepts two parameters of type String
    //and returns the parameters in ascending order – case sensitive. 
    //The returned value will be the concatenation of the parameters separated by a comma.
    private String orderAscending(String a, String b) {
        
       String valA =a.toString();
           String valB =b.toString();
           String temp;
           
           if(valA.compareTo(valB)>0){
           temp=valA;
           valA=valB;
           valB=temp;}
          StringBuilder buffer = new StringBuilder().append(valA).append(",").append(valB);
          String ordered = buffer.toString(); 
          //System.out.println(buffer.toString());
          return ordered;
    }
    //Order Ascending Method : Accepts three parameters of type String
    //and returns the parameters in ascending order – case sensitive. 
    //The returned value will be the concatenation of the parameters separated by a comma.
    private String orderAscending(String a, String b, String c) {
        
           String valA =a.toString();
           String valB =b.toString();
           String valC= c.toString();
           String temp;
           
           
           if(valB.compareTo(valC)>0){
           temp=valB;
           valB=valC;
           valC=temp;
           }
           if(valA.compareTo(valB)>0){
           temp=valA;
           valA=valB;
           valB=temp;}
          StringBuilder buffer = new StringBuilder().append(valA)
                                                    .append(",").append(valB)
                                                    .append(",").append(valC);
          String ordered = buffer.toString(); 
          //System.out.println(buffer.toString());
          return ordered;
    }
    //Join Method : accepts five parameters of type String 
    //and concatenates them with the specified separator in between.
    private void join(String a, String b, String c, String d, String s) {
        StringBuilder buffer = new StringBuilder()
        .append(a).append(s).append(b).append(s)
        .append(c).append(s).append(d).append("");
        System.out.println(buffer.toString()); // or simply System.out.println(buffer)
     }
    //Order AscendingIgnoreCase class : Accepts two parameters of type String
    //and returns the parameters in ascending order – non case sensitive. 
    //The returned value will be the concatenation of the parameters separated by a comma.
    private String orderAscendingIgnoreCase(String a, String b) {
           String valA =a.toString();
           String valB =b.toString();
           String temp;
           if(valA.compareToIgnoreCase(valB)>0){
           temp=valA;
           valA=valB;
           valB=temp;}
           StringBuilder buffer = new StringBuilder().append(valA).append(",").append(valB);
           String ordered = buffer.toString(); 
           return ordered;
    }
    //Order AscendingIgnoreCase Method : Accepts three parameters of type String
    //and returns the parameters in ascending order – not case sensitive. 
    //The returned value will be the concatenation of the parameters separated by a comma.
    private String orderAscendingIgnoreCase(String a, String b, String c) {
           String valA =a.toString();
           String valB =b.toString();
           String valC= c.toString();
           String temp;
           if(valA.compareToIgnoreCase(valC)>0){
           temp=valA;
           valA=valC;
           valC=temp;
           }
           if(valB.compareToIgnoreCase(valC)>0){
           temp=valB;
           valB=valC;
           valC=temp;
           }
           if(valA.compareToIgnoreCase(valB)>0){
           temp=valA;
           valA=valB;
           valB=temp;
           }
           StringBuilder buffer = new StringBuilder().append(valA).append(",").append(valB)
                                                    .append(",").append(valC);
          String ordered = buffer.toString(); 
          return ordered;
    }
    // Reverse: Accepts on parameter of type String 
    //and returns the reverse of that string.
    private String reverse(String word){
    String original = word;
    String reversed = new StringBuffer(original).reverse().toString();
    return reversed;
    }
    // isPalindrome: Accepts one parameter of type string
    //and returns true if the string can be 
    //read the same forwards or backwards.
    private boolean isPalindrome(String word){
    String original = word;
    String reversed = new StringBuffer(original).reverse().toString();
    if(original.compareTo(reversed)==0)
    {return true; }
    else    
    return false;
    }
    //fileCompare: Accepts two parameters of type String. 
    //These parameters are the file names of two files. 
    //The function will compare the contents of both files 
    //and return true if both files are the same. 
    private boolean fileCompare(String text1, String text2) throws FileNotFoundException, IOException{
    String file1 = text1;
    String file2 = text2;
    Scanner reader1 = new Scanner(new File(file1));
    Scanner reader2 = new Scanner(new File(file2));
        String line1 = reader1.nextLine();
        String line2 = reader2.nextLine();
        if(line1.equals(line2)){
        while(reader1.hasNextLine()&& reader2.hasNextLine()) {
            String nLine = reader1.nextLine();
            String nLine2 = reader2.nextLine();
            if(nLine.equals(nLine2)) 
                return true;
	    }
        //return true;
        }
        reader1.close();
        reader2.close();
        return false;
    }
  }
    
    

