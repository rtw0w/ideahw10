import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MovieManagerTest {

    @Test
    public void testMovie1() {
        MovieManagerTest manager = new MovieManagerTest();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMovie2() {
        MovieManagerTest manager = new MovieManagerTest();

        manager.add("Film 1");

        String[] expected = { "Film 1" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMovie3() {
        MovieManagerTest manager = new MovieManagerTest();

      manager.add("Film 1");
        manager.add("Film 2");

        String[] expected = { "Film 1", "Film 2" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMovie4() {
        MovieManagerTest manager = new MovieManagerTest();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");


        String[] expected = { "Film 1", "Film 2", "Film 3" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMovie5() {
        MovieManagerTest manager = new MovieManagerTest();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");


        String[] expected = { "Film 5", "Film 4", "Film 3", "Film 2", "Film 1" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
