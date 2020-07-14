package org.springernature.draw;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CanvasTest {

    /*
    ___
    | |
    ___
     */
    @Test
    public void shouldCreateCanvas() {
        Canvas canvas = new Canvas(1, 1);
        assertEquals("_", canvas.get(0, 0));
    }


}
