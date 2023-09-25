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

    public void commandExecution(String str){
        if (str.isEmpty()){
            System.out.println("There are no commands to move");
        }
        for (char ch: str.toCharArray()){
            if (ch == 'N'){
                N.printText();
            }if (ch == 'S'){
                S.printText();
            }if (ch== 'W'){
                W.printText();
            }if (ch == 'E'){
                E.printText();
            }
        }
    }
}

