package ocp.exam.ch7;

public enum Directions {
    UP {
        @Override
        String formatDirection() {
            return null;
        }
    },
    DOWN {
        @Override
        String formatDirection() {
            return null;
        }
    },
    LEFT {
        @Override
        String formatDirection() {
            return null;
        }
    },
    RIGHT {
        @Override
        String formatDirection() {
            return null;
        }

        @Override
        public int[] vectors() {
            return new int[] {1, 0};
        }
    };

    Directions() {

    }

    abstract String formatDirection();

    public int[] vectors() {
        return new int[] {0, 0};
    }
}
