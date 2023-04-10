import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MovieManagerTest {

    @Test
    public void testMovieFindAll1() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMovieFindAll2() {
        MovieManager manager = new MovieManager();

        manager.add("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMovieFindAll3() {
        MovieManager manager = new MovieManager();

        manager.add("Film 1");
        manager.add("Film 2");

        String[] expected = {"Film 1", "Film 2"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMovieFindAll4() {
        MovieManager manager = new MovieManager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");


        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMovieFindLast1() {
        MovieManager manager = new MovieManager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");


        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMovieFindLast2() {
        MovieManager manager = new MovieManager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");


        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMovieFindLast3() {
        MovieManager manager = new MovieManager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");



        String[] expected = { "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMovieFindLast4() {
        MovieManager manager = new MovieManager();

        manager.add("Film 1");


        String[] expected = { "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
