package licorice.gui;

import org.testng.annotations.Test;

import java.util.stream.Stream;

import static org.testng.Assert.assertEquals;

public class TestGenomeManager {

    @Test
    void testList() {
        GenomeManager gm = new GenomeManager("../genome");
        String[] names= gm.listGenomes();
        Stream.of(names).forEach(System.out::println);
        assertEquals(2,names.length);
    }
}
