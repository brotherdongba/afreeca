package org.gradle;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class Foo {
	@Test
	public void foo() throws IOException {
		File fromFile = new File("d:/temp");
		for (File file : fromFile.listFiles()) {
			if (file.getName().indexOf("txt") < 0) {
				continue;
			}
			
			if (file.getName().indexOf("a") >= 0) {
				byte[] bytes = FileUtils.readFileToByteArray(file);
				File toFile = new File("e:/temp/" + file.getName());
				FileUtils.writeByteArrayToFile(toFile, bytes);
			}
		}
	}

}
