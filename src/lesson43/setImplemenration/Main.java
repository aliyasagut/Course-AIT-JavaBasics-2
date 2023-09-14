package lesson43.setImplemenration;

public class Main {
    public static void main(String[] args) {
        OurSet<Integer> ourSet = new OurHashSet<>();
        ourSet.add(1);
        ourSet.add(6);
        ourSet.add(3);
        ourSet.add(2);

        for (int l : ourSet){
            System.out.println(l);
        }

        /*
        key         Value
        John        INSTANCE
        Jack        INSTANCE
        Bill        INSTANCE
        Ann         INSTANCE
         */
    }
}
