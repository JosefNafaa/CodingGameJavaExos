public class Program {
   String exec(String command, String text){
        if(!"CountWords".equals(command)){
        throw new IllegalArgumentException(command);
        }
    return  String.valueOf(WordCounter.count(text));
    }
}
