import java.awt.*;
import java.util.ArrayList;

public class MarsRover {

    private String direction = "N";
    private String coordinates = "0:0";

    public String execute(String commands) {
        String[] commandsList = commands.split("");

        if (commands.equals("R")) {
            direction = "E";
        }

        if (commands.equals("RR")) {
            direction = "S";
        }

        if (commands.equals("RRR")) {
            direction = "W";
        }

        return formatPosition();
    }

    private String formatPosition() {
        return coordinates + ":" + direction;
    }
}
