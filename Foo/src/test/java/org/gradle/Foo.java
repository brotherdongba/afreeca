package org.gradle;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class Foo {
	@Test
	public void foo() throws IOException {
		File fromFile = new File("d:/a.txt");
		byte[] bytes = FileUtils.readFileToByteArray(fromFile);
		File toFile = new File("e:/temp/a.txt");
		FileUtils.writeByteArrayToFile(toFile, bytes);
	}

}
