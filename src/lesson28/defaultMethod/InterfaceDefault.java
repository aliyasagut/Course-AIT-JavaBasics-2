package lesson28.defaultMethod;

public interface InterfaceDefault {
    int getUserID();

    // Дефолтный метод создается в помощью ключевого слова default

    default int getAdminID(){
        return 25;
    }

}
