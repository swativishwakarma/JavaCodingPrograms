public class ReverseString{
    public static String getReverseOfString(String s){
        int n=s.length();
        String res=" ";

        for(int i=n-1;i>=0;i--){
            res=res+s.charAt(i);

        }
        return res;
        

    }

    public static void main(String[] args) {
        String s1="Geeks";
        String res1=getReverseOfString(s1);
        System.out.println("Reversed String: " + res1);
        
        s1="For";
        res1=getReverseOfString(s1);
        System.out.println("Reversed String: " + res1);

         s1="a";
        res1=getReverseOfString(s1);
        System.out.println("Reversed String: " + res1);
    }
}