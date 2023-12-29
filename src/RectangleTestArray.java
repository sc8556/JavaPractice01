import java.util.Scanner;

public class RectangleTestArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle[] rectangles = new Rectangle[5]; // 0,1,2,3,4 까지 5개의 주소 객체 배열에 저장


        for (int i = 0; i < rectangles.length; i++) {
            System.out.println((i+1) + "번 째 사각형의 너비는?? ");
            int width = scan.nextInt();
            System.out.println((i+1) + "번 째 사각형의 높이는?? ");
            int height = scan.nextInt();

            rectangles[i] = new Rectangle(width, height); // 입력받은 너비와 높이를 객체 배열에 저장
        }

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println((i+1) + "번 째 사각형 " + rectangles[i].getArea());
        }
    }
}
