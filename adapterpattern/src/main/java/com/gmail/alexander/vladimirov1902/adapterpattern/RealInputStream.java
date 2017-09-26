package com.gmail.alexander.vladimirov1902.adapterpattern;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class RealInputStream extends InputStream {
    public int read() throws IOException {
        return -1;
    }
}
