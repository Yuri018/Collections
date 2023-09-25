package homeWork50;

public enum SidePoints {
    NORTH {
        @Override
        public void printText() {
            System.out.println("Step north");
        }
    },
    SOUTH {
        @Override
        public void printText() {
            System.out.println("Step south");
        }
    },
    WEST {
        @Override
        public void printText() {
            System.out.println("Step west");
        }
    },
    EAST {
        @Override
        public void printText() {
            System.out.println("Step east");
        }
    };

    public abstract void printText();
}


