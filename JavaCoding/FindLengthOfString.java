public class FindLengthOfString{
    public static int getLengthOfString(String s){
        return s.length();
       
    }
    public static void main(String[] args) {
        String s1="Geeks";
        int length=getLengthOfString(s1);
        System.out.println("Length Of String: " + length);
        
        s1="For";
        length=getLengthOfString(s1);
        System.out.println("Length Of String: "+ length);

         s1="a";
        length=getLengthOfString(s1);
        System.out.println("Length Of String: "+ length);
    }

}