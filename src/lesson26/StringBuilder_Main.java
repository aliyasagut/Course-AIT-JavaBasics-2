package lesson26;

public class StringBuilder_Main {
    // StringBuilder
    /*
    Констукторы:
    StringBuilder()
    StringBuilder( String str )
    StringBuilder( int capacity )

    Методы:
    append ( String s ) - добавляется для добавления строки к уже имеющейся. Метод может также добавлять int, float, double etc.
    insert () - вставляет строку в исходную начиная с указанной позиции
    replace () - заменяет исходную строку с указанной позиции заканчивая указанной позицией
    delete () - удаляет строку между указанными индексами
    reverse () - разворачивает строку
     */
    public static void main(String[] args) {
        // append ()
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ").append("Java");
        System.out.println(sb);

        // insert ()

        StringBuilder sbInsert = new StringBuilder("Hello");
        sbInsert.insert(1, "World");
        System.out.println(sbInsert);

        // replace ()

        StringBuilder sbReplace = new StringBuilder("Hello");
        sbReplace.replace(1, 3, "jave");
        System.out.println(sbReplace);

        // delete ()

        StringBuilder sbDelete = new StringBuilder("Hello");
        sbDelete.delete(1,3);
        System.out.println(sbDelete);

        // reverse ()

        StringBuilder sbReverse = new StringBuilder("Hello");
        System.out.println(sbReverse.reverse());




    }
}
