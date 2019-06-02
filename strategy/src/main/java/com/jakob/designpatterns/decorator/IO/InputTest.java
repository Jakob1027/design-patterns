package com.jakob.designpatterns.decorator.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Jakob
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        try {
            int c;
            is = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("d:/temp.txt")));
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null)
                is.close();
        }
    }
}
