import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryManagement inventory =new InventoryManagement();
        while(true){
            System.out.println("Menu:");
            System.out.println("1.Them San Pham :");
            System.out.println("2.Tim kiem san pham cao nhat va thap nhat :");
            System.out.println("3. Tim kiem san pham :");
            System.out.println("4. Thoat:");
            System.out.println("lua chon cua ban : ");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("chuong trinh ket thuc:");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("lua chon khong hop le. Vui long chon lai");
                    break;
            }
        }


    }
}
