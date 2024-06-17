public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Array arr = new Array(3);
        arr.insert(10);
        arr.insert(20);

        arr.print();

        Array arr2 = new Array(2);
        arr2.insert(7);
        arr2.insert(3);

        arr2.insert(5);
        arr2.remove(0);
        arr2.print();

        System.out.println("index = " + arr2.indexOf(5));
    }
}
