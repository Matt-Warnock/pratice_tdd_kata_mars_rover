import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {
    @Test
    void returns_easterly_when_given_once_right_command() {
        MarsRover marsRover = new MarsRover();
        String expectedCoordinates = "0:0:E";
        String command = "R";

        String result = marsRover.execute(command);

        assertEquals(expectedCoordinates, result);
    }

    @Test
    void returns_easterly_when_given_twice_right_command() {
        MarsRover marsRover = new MarsRover();
        String expectedCoordinates = "0:0:S";
        String commands = "RR";

        String result = marsRover.execute(commands);

        assertEquals(expectedCoordinates, result);
    }
    @Test
    void returns_easterly_when_given_three_right_command() {
        MarsRover marsRover = new MarsRover();
        String expectedCoordinates = "0:0:W";
        String commands = "RRR";

        String result = marsRover.execute(commands);

        assertEquals(expectedCoordinates, result);
    }
    @Test
    void turns_360_degrees() {
        MarsRover marsRover = new MarsRover();
        String expectedCoordinates = "0:0:N";
        String commands = "RRRR";

        String result = marsRover.execute(commands);

        assertEquals(expectedCoordinates, result);
    }

}