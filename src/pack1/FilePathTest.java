package pack1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathTest {
	public static void main(String[] args) {
		Path p = Paths.get("C:\\Users\\nilesh\\eclipse-workspace\\SimpliLeanAssignments\\file1");
		System.out.println("Get File: "+p.getFileName());
		System.out.println("Parent: "+p.getParent());
		System.out.println("Count: "+p.getNameCount());
		System.out.println("Get root: "+p.getRoot());
		System.out.println("Is Absolute: "+p.isAbsolute());
		System.out.println("Absolute Path: "+p.toAbsolutePath());
		System.out.println("URI: "+p.toUri());
	}
}
