public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code
        String []newSentences= new String [sentences.length];
        String []newKey= new String [keywords.length];
        for(int i=0;i< sentences.length; i++){
            newSentences[i]=lowerCase(sentences[i]);
        }
        for(int i=0;i< sentences.length; i++){
            newKey[i]=lowerCase(keywords[i]);
        }
        for(int i=0;i< sentences.length; i++){
            for(int j=0;j< keywords.length; j++){
             if(contains(newSentences[i],newKey[j])){
                System.out.println(sentences[i]);
             }
            }
        }
    }
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
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if(str1.length()<str2.length())
           return false;
        int len=str2.length();
        int count1=0;  int count2=0; 
            while(len!=0){
                if(str1.charAt(count1)==str2.charAt(count2)){
                    count2++; count1++;
                    len--;
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

