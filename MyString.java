public class MyString {
    public static void main(String[] args) {
       // System.out.println("Testing lowercase:");
       // System.out.println("UnHappy : " + lowerCase("UnHappy"));
       // System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
       // System.out.println("TLV : " + lowerCase("TLV"));
       // System.out.println("lowercase : " + lowerCase("lowercase"));
        
       boolean test1 =contains("baba yaga", "baba");
       boolean test2 = contains("baba yaga", "");
       boolean test3 = contains("baba yaga", "John Wick is the baba yaga");
       boolean test4 = contains("baba yaga", "Yaga");
       boolean test5 = contains("baba yaga", "babayaga");
       System.out.println(test1 + " "+ test2+" "+test3+" "+test4+" "+test5);

       // System.out.println("Testing contains:");
       // System.out.println(contains("unhappy", "happy")); // true
       // System.out.println(contains("happy", "unhappy")); // false
      //  System.out.println(contains("historical", "story")); // false
      //  System.out.println(contains("psychology", "psycho")); // true
      //  System.out.println(contains("personality", "son")); // true
       // System.out.println(contains("personality", "dad")); // false
       // System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String low= "";
        for(int i=0;i<str.length();i++){
            char b=str.charAt(i);
           if(b>='A'&&b<='Z')
             b=(char)(b-32);
            low+=b;  
        }
        
        return low;
    }
//for(int j=0;j<str2.length();j++)
    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if(str1.length()<str2.length())
           return false;
        int len=str2.length();
        int count1=0;  int count2=0; 
            while(count2 < len && count1 < str1.length()){
                if(str1.charAt(count1)==str2.charAt(count2)){
                    count2++; count1++;
                }
                else {
                    count1++;
                    count2=0;
                }
            }
        if(count2==str2.length())
           return true;
        else
           return false;
    }
}
