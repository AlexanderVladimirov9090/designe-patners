package com.gmail.alexander.vladimirov1902.adapterpattern;

import java.io.IOException;

/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *         Applied Addapter pattern
 */
public class Adapter implements MyInputStream {

    public int read(byte[] buffer, int offset, int length) throws IOException {
        return new RealInputStream().read(buffer,offset,length);
    }
}
