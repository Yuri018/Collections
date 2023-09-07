package linkedLists;

public class Application {

    public static void main(String[] args) {

        ListOperationsStrategy arrayStrategy = new ArrayListOperationsStrategy();
        ListOperationsStrategy linkedStrategy = new LinkedListOperationsStrategy();

        ListPerformanceTester arrayTester = new ListPerformanceTester(arrayStrategy);
        ListPerformanceTester linkedTester = new ListPerformanceTester(linkedStrategy);

        System.out.println("Test add Performance");
        System.out.println(arrayTester.testAddPerformance(1_000_000));
        System.out.println(linkedTester.testAddPerformance(1_000_000));

        System.out.println("Test get Performance");
        System.out.println(arrayTester.testGetPerformance(1_000_000, 1000));
        System.out.println(linkedTester.testGetPerformance(1_000_000, 1000));
    }

}
