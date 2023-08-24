package lesson28.series;

public class Fourth implements Series {
    int start;
    int value;

    public Fourth() {
        start = 0;
        value = 0;
    }

    public int getNext() {
        value += 4;
        return value;
    }

    public void reset() {
        value = start;
    }

    public void setStart(int a) {
        start = a;
        value = a;
    }
}
