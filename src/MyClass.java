public class MyClass<K, Z> {
    K a;
    Z b;

    public MyClass(K a, Z b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        System.out.println(this.a);
        System.out.println(this.b);
    }

    public static void main(String[] args) {
        MyClass<String, String> obj = new MyClass<>("Hello", "HIHI");
        obj.add();

        MyClass<Integer, Integer> abc = new MyClass<>(1, 2);
        abc.add();
    }
}
