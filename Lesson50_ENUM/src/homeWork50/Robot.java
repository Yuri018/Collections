package homeWork50;

public class Robot {
    //    String command;
    SidePoints N = SidePoints.NORTH;
    SidePoints S = SidePoints.SOUTH;
    SidePoints W = SidePoints.WEST;
    SidePoints E = SidePoints.EAST;
//    public Robot(String command) {
//        this.command = command;
//    }

    public void commandExecution(String str) {
        if (str.isEmpty()) {
            System.out.println("There are no commands to move");
        }
        int counter = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'N') {
                System.out.print(++counter + ".");
                N.printText();
            }
            if (ch == 'S') {
                System.out.print(++counter + ".");
                S.printText();
            }
            if (ch == 'W') {
                System.out.print(++counter + ".");
                W.printText();
            }
            if (ch == 'E') {
                System.out.print(++counter + ".");
                E.printText();
            }
        }
    }
}

