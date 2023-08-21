package lesson25;

public class OurStringBuilder {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str.substring(2));
        System.out.println(str);
        str = "frtu";

        // StringBuilder  - используется для создания изменяемых строк
        // конструкторы:
        /*
        StringBuilder () - пустой
        StringBuilder (String str)
        StringBuilder (int length) - пустой стрингбилдер размера length
         */

        // append(String s) - добавляет строку s к имеющейся уже

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" ").append("Java");
        System.out.println(sb);
    }
}
