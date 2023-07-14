public class Test_1 {
    public static void main(String[] args) {
        Gen<Integer> iOb1;
        Gen<String> iOb2;
        Gen<Double> iOb3;
        
        iOb1 = new Gen<>(88);
        iOb2 = new Gen<>("99");
        iOb3 = new Gen<>(78.5);

        iOb1.printElement();
        iOb2.printElement();
        iOb3.printElement();

    }
}
