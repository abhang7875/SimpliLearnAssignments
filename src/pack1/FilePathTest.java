package pack1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;

import java.util.Set;

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
		System.out.println("Is Readable: "+Files.isReadable(p));
		System.out.println("Is Executable: "+Files.isExecutable(p));
		System.out.println("Is Writable: "+Files.isWritable(p));
		System.out.format("Path %s exists: %b%n",p,Files.exists(p, LinkOption.NOFOLLOW_LINKS));
		
		Path newFile = Paths.get("C:\\Users\\nilesh\\eclipse-workspace\\SimpliLeanAssignments\\file3");
		Path fileWithAttributes = Paths.get("C:\\Users\\nilesh\\eclipse-workspace\\SimpliLeanAssignments\\file4");
		try {
			Files.createFile(newFile);
			FileAttribute<Set<PosixFilePermission>> rwx = PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rwxr-----"));
			Files.createFile(fileWithAttributes, rwx);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
