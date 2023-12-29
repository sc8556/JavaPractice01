import java.util.Scanner;

public class intArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 스캐너 변수 생성
        int[] intArray = new int [10]; // 객체배열 생성
        String result = "";

        System.out.println("정수를 입력해주세요.");
        for (int i = 0; i < intArray.length; i++) {
//            int num = scan.nextInt();
            intArray[i] = scan.nextInt();

            if(intArray[i] % 3 == 0){
                result += intArray[i] + " ";
            }
        }

        System.out.print("3의 배수는?? " + result);

        scan.close();
    }
}
