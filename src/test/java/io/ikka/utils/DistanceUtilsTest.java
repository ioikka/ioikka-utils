package io.ikka.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistanceUtilsTest {

    @Test
    void distance() {
        assertEquals(
                2093712.378151415,
                DistanceUtils.distance(56.19, 52.23, 36.33, 4.54));
    }
}
