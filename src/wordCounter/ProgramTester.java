package wordCounter;

public class ProgramTester {

	Program p;
	CommadsHolder ch;

	void init() {
		p = new Program();
		ch = new CommadsHolder();
	}

	void testCounterWord() {
		for (String command : ch.commands){

			String r = p.exec(command, "raja club athlétic");
			System.out.println("count " + r);
			assert (r.equals("3"));

			}
		
	}
}
