package com.petrusandrey;

public class TheRobotIsMoving {
    public static void main(String[] args) {
        String moving = "ULDR";
        boolean result = checkRobot(moving);
        System.out.println(result);
    }

    private static boolean checkRobot(String moving) {
        int y = 0;
        int x = 0;
        for (int i = 0; i < moving.length(); i++) {
            char ch = moving.charAt(i);
            switch (ch) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }
        }
        return x == 0 && y == 0;
    }

}

