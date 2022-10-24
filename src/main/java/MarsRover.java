import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarsRover {

    private String coordinates = "0:0";
    private List<String> compass = Arrays.asList("N", "E", "S", "W");
    private int rightTurns = 0;

    public String execute(String commands) {
        String[] commandsList = commands.split("");

        for(String command : commandsList) {
            rightTurns += 1;
        }

        wrapAround();

        return formatPosition();
    }

    private void wrapAround() {
        rightTurns %= 4;
    }

    private String formatPosition() {
        return coordinates + ":" + compass.get(rightTurns);
    }
}
