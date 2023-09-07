package linkedLists;

import java.util.List;

public class ListPerformanceTester {
    private final ListOperationsStrategy strategy;

    public ListPerformanceTester(ListOperationsStrategy strategy) {
        this.strategy = strategy;
    }

    public long testAddPerformance(int nTime){
        long now = System.currentTimeMillis();
        strategy.append(nTime);
        return System.currentTimeMillis() - now;
    }

    public long testGetPerformance(int nTimes, int length){
        List list = strategy.getFilledList(length);
        long now = System.currentTimeMillis();
        strategy.get(nTimes, list);
        return System.currentTimeMillis() - now;
    }
}
