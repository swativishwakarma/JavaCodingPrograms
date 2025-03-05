public class FindEvenLengthOfString{
  public static void main(String[] args) {
       String s = "i am Geeks for Geeks and a Geek";
       String[] words = s.split(" ");
       
        for (int i = 0; i < words.length; i++) {
            
            if (words[i].length() % 2 == 0) {
                System.out.println(words[i]);
            }
        }
  }  
    
} 

