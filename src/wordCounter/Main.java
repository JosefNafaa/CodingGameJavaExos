package wordCounter;

public class Main {

	public static void main(String[] args) {
		ProgramTester ps = new ProgramTester();
		System.out.println(WordCounter.count("Hala Madrid"));
		ps.init();
		ps.testCounterWord();
	}

}
