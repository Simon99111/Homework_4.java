public class Test_2 {
    public static void main(String[] args) {
        Gen printer = new Gen();
        String[] iOb1 = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] iOb2 = {23, 4, 5, 2, 13, 456, 4};
        printer.<String>printArray(iOb1);
        System.out.println();
        printer.<Integer>printArray(iOb2);
    }
}
