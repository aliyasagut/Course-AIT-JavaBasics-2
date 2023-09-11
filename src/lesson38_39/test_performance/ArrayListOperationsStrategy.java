package lesson38_39.test_performance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListOperationsStrategy implements ListOperationsStrategy{

    private static final Object object = 10;
    private Random rnd = new Random();



    @Override
    public void append(int nTimes) {
        List list = new ArrayList();

        for (int i = 0; i < nTimes; i++) {
            list.add(object);
        }
    }

    @Override
    public List getFilledList(int length) {
        List list = new ArrayList();

        for (int i = 0; i < length; i++) {
            list.add(object);
        }
        return list;
    }

    @Override
    public void get(int nTimes, List list) {
        int length = list.size();

        for (int i = 0; i < nTimes; i++) {
            list.get(rnd.nextInt(length));
        }

    }
}
