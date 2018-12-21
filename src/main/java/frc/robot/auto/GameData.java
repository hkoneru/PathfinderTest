package frc.robot.auto;

public class GameData {
    public enum Side {
        LEFT, RIGHT
    }

    public Side
        mySwitch,
        myScale,
        oppSwitch;

    public GameData(String gameSpecificMessage) {
        if (gameSpecificMessage.charAt(0) == 'L') {
            mySwitch = Side.LEFT;
        } else {
            mySwitch = Side.RIGHT;
        }

        if (gameSpecificMessage.charAt(1) == 'L') {
            myScale = Side.LEFT;
        } else {
            myScale = Side.RIGHT;
        }

        if (gameSpecificMessage.charAt(2) == 'L') {
            oppSwitch = Side.LEFT;
        } else {
            oppSwitch = Side.RIGHT;
        }
    }
}