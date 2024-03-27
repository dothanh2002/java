import java.io.FileInputStream;
public class Toni {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\User/DoThanh)
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                System.out.println((char) i);
            }
            fileInputStream.close();
        } catch (Exception e) {

        }

    }
}
