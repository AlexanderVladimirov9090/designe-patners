package com.gmail.alexander.vladimirov1902.adapterpattern;

import java.io.IOException;

/**
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *         Custom interface to practice adatter pattern.
 */
public interface MyInputStream {

    int read(byte[] buffer, int offset, int length) throws IOException;
}
