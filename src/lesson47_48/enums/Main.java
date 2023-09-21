package lesson47_48.enums;

public class Main {

    public static void main(String[] args) {

//        Directions north = Directions.NORTH;
//        System.out.println(north);
//
//        System.out.println(Directions.EAST);

        for (Directions dir : Directions.values()) {
            System.out.println(dir);
        }

//        Directions direction = Directions.WEST;
//
//        if (direction == Directions.EAST) {
//            System.out.println("go east");
//        } else if (direction == Directions.WEST) {
//            System.out.println("go west");
//        } else {
//            System.out.println("go south or north");
//        }


        getDirection(Directions.EAST);
        getDirection(Directions.SOUTH);
        getDirection(Directions.NORTH);
        getDirection(Directions.WEST);

        System.out.println("----------------------");
        String east = "east";
        Directions eastFromStr = Directions.valueOf(east.toUpperCase()); // Если константы с таким значением нет, то генерируется exception
        getDirection(eastFromStr);

        System.out.println("----------------------------");
        Directions dir = Directions.NORTH;
        System.out.println(dir.getLetter());
        String letterWest = Directions.WEST.getLetter();
        System.out.println(letterWest);


    }

    public static void getDirection (Directions directions){
        switch (directions){
            case SOUTH:
                System.out.println("go south");
                break;
            case NORTH:
                System.out.println("go north");
                break;
            case EAST:
                System.out.println("go east");
                break;
            case WEST:
                System.out.println("go west");
                break;
        }
    }
}
