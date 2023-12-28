import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
//        Rectangle rect = new Rectangle(); // 객체변수 생성

        Scanner scan = new Scanner(System.in); // System.in : 키보드 input을 의미
        System.out.println("사각형의 너비를 입력하시오: ");
        int width = scan.nextInt();
        System.out.println("사각형의 높이를 입력하시오: ");
        int height = scan.nextInt();

        Rectangle rect = new Rectangle(width, height); // 객체변수 생성
//        rect.width = width;
//        rect.height = height;

        int area = rect.calArea();
        System.out.println("사각형의 면접은?? " + area + " 입니다.");

        scan.close();

    }
}
