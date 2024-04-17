public class MyClass2<T> {
    public <T> void display(T[] elems) {
        for (T elem : elems) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        MyClass2<String> abc = new MyClass2<>();
        String[] names = new String[]{
                "Luan","Nam","Linh"
        };
        abc.display(names);


    }
}
