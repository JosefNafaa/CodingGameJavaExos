import wordCounter.ProgramTester;
import wordCounter.WordCounter;

public class Main {
    public static void main(String ar[])
    {
        String text ="a sxc";
        System.out.println(WordCounter.count(text));
        ProgramTester tester =new ProgramTester();
        tester.init();
       tester.testCountWords();
    }
}
