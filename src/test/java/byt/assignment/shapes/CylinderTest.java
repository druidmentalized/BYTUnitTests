package byt.assignment.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CylinderTest {
    private final IShape cylinder = new Cylinder(5, 10);


    @Test
    void calculateArea_shouldReturnExpectedValue() {
        var area = cylinder.calculateArea();
        assertEquals(471.239, area, 0.001);
    }

    @Test
    void calculateVolume_shouldReturnExpectedValue() {
        var volume = cylinder.calculateVolume();
        assertEquals(785.398, volume, 0.001);
    }
}
