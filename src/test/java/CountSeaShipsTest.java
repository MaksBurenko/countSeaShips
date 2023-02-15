import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.assertj.core.api.Assertions.assertThat;

public class CountSeaShipsTest extends TestCase {

    int[][] matrix = {{1,0,0,1,0},{1,0,0,1,0},{1,0,0,0,0},{0,0,1,1,1},{1,0,0,0,0}};

    @Test
    public void testShouldCountShips() {
        assertThat(CountSeaShips.count(matrix)).is(4);
    }

}