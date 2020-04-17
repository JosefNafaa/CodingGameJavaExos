package fileTinder;

import java.io.File;
import java.util.Arrays;
import java.util.Stack;

public class FileSearch {

	static String localUniverseFormula() {
		Stack<File> filesToExplore = new Stack<File>();
		filesToExplore.add(new File("/tmp/documents"));
		while (!filesToExplore.empty()) {
			File file = filesToExplore.pop();
			if (!file.isDirectory()) {
				if ("universe-formula".equals(file.getName()))
					return file.getAbsolutePath();

			} else {
				filesToExplore.addAll(Arrays.asList(file.listFiles()));
			}

		}
		return null;
	}
}
