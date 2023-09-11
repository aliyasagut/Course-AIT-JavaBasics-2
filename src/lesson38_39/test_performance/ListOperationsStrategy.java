package lesson38_39.test_performance;

import java.util.List;

public interface ListOperationsStrategy {

    void append(int nTimes);

    List getFilledList(int length);

    void get(int nTimes, List list);

}
