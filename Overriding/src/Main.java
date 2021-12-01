import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        USB usb = new USB();
        Mouse mouse = new Mouse();

        Scanner input = new Scanner(System.in);

        System.out.println("Nhap thong tin USB");
        System.out.print("Ma Hang: ");
        usb.maHang = input.nextLine();
        System.out.print("So luong: ");
        usb.setSoLuong(input.nextInt());
        System.out.print("Gia: ");
        usb.setGia(input.nextDouble());

        System.out.println("Nhap thong tin Mouse");
        System.out.print("Ma Hang: ");
        input.nextLine();
        mouse.maHang = input.nextLine();
        System.out.print("So luong: ");
        mouse.setSoLuong(input.nextInt());
        System.out.print("Gia: ");
        mouse.setGia(input.nextDouble());

        System.out.println(usb.show());
        System.out.println(mouse.show());
    }
}
