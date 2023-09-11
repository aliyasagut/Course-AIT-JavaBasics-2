package lesson38_39.linkedList_Implementation;

public class Main {

    public static void main(String[] args) {


        OurLinkedList<Integer> list = new OurLinkedList<>();

        list.append(5);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.set(10, 0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.append(5);
        list.append(2);
        list.append(15);
        list.append(7);
        list.append(17);
        list.append(18);
        list.append(25);

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("]");

        list.removeByID(3);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("]");

        System.out.println(list.contains(17));
        System.out.println(list.contains(15));

        System.out.println("========================================");

        OurList<String> ourList = new OurLinkedList<>();
        ourList.append("Jack");
        String jack = ourList.get(0);
        System.out.println(jack);

        OurList<Human> humans = makeHumanList();

        for (int i = 0; i < makeHumanList().size(); i++) {
            System.out.println(humans.get(i));
        }

    }
    static OurLinkedList<Human> makeHumanList(){
        Human john = new Human("John", 21);
        Human bill = new Human("Bill", 25);
        Human ann = new Human("Ann", 20);

        OurLinkedList<Human> result = new OurLinkedList<>();
        result.append(john);
        result.append(bill);
        result.append(ann);

        return result;
    }
}
