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

}