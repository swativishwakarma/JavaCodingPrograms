public class WayOfCreatingStrings{
    public static void main(String[] args) {
     //Using String Literal (String Pool)
     String s1="Hello";
     String s2="Swati";
     String s3="Hello";
     System.out.println(s1==s2);  // false, because both refer to the diff object in the pool
     System.out.println(s1==s3);  // true, because both refer to the same object in the pool

     //Using new Keyword
     String str1=new String("Hello");
     String str2=new String("Hello");
     System.out.println(str1==str2);//false, because both refer to the diff object in the heap

     /*Using String Constructor
     1.You can create a string using the constructor of the String class. 
     You can initialize it with a character array or int array.

      From a character array:*/
      char[] arr1={'H', 'e', 'l', 'l', 'o'};
      String str = new String(arr1);
      System.out.println("From a character array: "+str);  // Output: Hello

      //From int array:
      byte[] arr2={72, 101, 108, 108, 111}; //ASCII values for "Hello"
      String str3=new String(arr2);
      System.out.println("From a Byte array: "+str3);

      //Using StringBuilder or StringBuffer
      StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World!");
        String st = sb.toString();
        System.out.println("using StringBuilder or StringBuffer: "+st); 

      //Using String.join() (Java 8 and later) 
      //String.join() is used to join multiple strings together 
       String st1 = String.join( ", ","Apple", "Banana", "Cherry");
        System.out.println(st1); 

      //Using concat() Method
        String string1 = "Hello";
        String string2= " World!";
        String string3 = string1.concat(string2);
        System.out.println("Using concat() Method: "+string3);   

    } 
}


        

