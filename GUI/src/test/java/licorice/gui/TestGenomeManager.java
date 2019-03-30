package licorice.gui;

import org.testng.annotations.Test;

import java.util.stream.Stream;

import static org.testng.Assert.*;

public class TestGenomeManager {

    @Test
    void testList() {
        GenomeManager gm = new GenomeManager("../genome");
        String[] names= gm.listGenomes();
        Stream.of(names).forEach(System.out::println);
        assertTrue(names.length>=2);
    }
}
