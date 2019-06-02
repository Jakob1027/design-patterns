package com.jakob.designpatterns.decorator.IO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Jakob
 */
public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? -1 : Character.toLowerCase((char) c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (byte b1 : b) {
            b1 = (byte) Character.toLowerCase((char) b1);
        }
        return result;
    }
}
