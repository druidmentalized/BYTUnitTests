package byt.assignment.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SphereTest {
    private final IShape sphere = new Sphere(5);

    @Test
    void calculateArea_shouldReturnExpectedValue() {
        var area = sphere.calculateArea();
        assertEquals(314.159, area, 0.001);
    }

    @Test
    void calculateVolume_shouldReturnExpectedValue() {
        var volume = sphere.calculateVolume();
        assertEquals(523.598, volume, 0.001);
    }
}
