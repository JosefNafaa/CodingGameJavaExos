package wordCounter;

import java.util.ArrayList;

public class CommadsHolder {

	static ArrayList<String> commands = new ArrayList<>();

	public CommadsHolder() {
		this.commands.add("CountWord");
		this.commands.add("command1");
		this.commands.add("command2");
		this.commands.add("CountWord");
		this.commands.add("command4");
	}

	public static ArrayList<String> addCommand(String command) {

		commands.add(command);
		return commands;
	}
}
