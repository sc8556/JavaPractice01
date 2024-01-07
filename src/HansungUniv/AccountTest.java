import java.util.Scanner;
 
public class AccountTest {
    public static void main(String[] args) {
        Account account01 = new Account(0, "001"); // Account 클래스 객체변수 생성, 잔액 초기화
        Account account02 = new Account(0, "002");
        Scanner scan = new Scanner(System.in); // 입금, 출금 값을 입력할 스캐너 객체변수 생성

        int deposit, withdraw;

        System.out.println("입금금액을 입력해주세요");
        deposit = scan.nextInt(); // 입금 금액 스캔함수에 입력
        account01.deposit(deposit); // deposit 메서드 호출

        System.out.println("출금금액을 입력해주세요");
        withdraw = scan.nextInt();
        account01.withdraw(withdraw);

        System.out.println("입금금액을 입력해주세요");
        deposit = scan.nextInt(); // 입금 금액 스캔함수에 입력
        account02.deposit(deposit); // deposit 메서드 호출

        System.out.println("출금금액을 입력해주세요");
        withdraw = scan.nextInt();
        account02.withdraw(withdraw);

        scan.close();
    }
}
