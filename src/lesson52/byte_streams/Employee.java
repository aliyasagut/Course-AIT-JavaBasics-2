package lesson52.byte_streams;

public class Employee {
    // DataOutputStream
    // DataInputStream
    // для работы с данными примитивных типов

        /*
        DataOutputStream
        writeBoolean()
        writeByte()
        writeChar()
        writeInt()
        writeDouble()
        writeShort()
        writeFloat()
        writeUTF(String str) - записывает строку в кодировке UTF-8

        DataInputStream
        Все тоже самое только read..()
         */
    public String name;
    public int age;
    public double salary;
    public boolean isManager;

    public Employee(String name, int age, double salary, boolean isManager) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isManager = isManager;
    }
}
