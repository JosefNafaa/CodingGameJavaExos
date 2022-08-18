public class WordCounter {



     public static int  count(String text){
         int count =0;
         boolean incrementCounter = false;
         for (int i=0; i<text.length(); i++){
             if (isValidWordCharacter(text.charAt(i))){
                 incrementCounter = true;
             }else if (incrementCounter){
                 count++;
                 incrementCounter = false;
             }
         }
         if (incrementCounter) count ++;//if string ends with a valid word
         return count;
     }
    private static boolean isValidWordCharacter(char c){
        //any logic that will help you identify a valid character in a word
        // you could also have a method which identifies word separators instead of this
        return (c >= 'A' && c<='Z') || (c >= 'a' && c<='z');
    }

}
