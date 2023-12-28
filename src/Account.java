public class Account {
    int balance; // 잔액 변수 선언 및 초기화
    String id;

    // 잔액을 0으로 초기화하는 생성자 생성
    Account(int balance, String id){
        this.balance = balance;
        this.id = id;
    }

    // 돈을 입금하는 메서드 생성
    void deposit(int amount){
        balance = balance + amount;
        System.out.println("입금완료 // 금액: " + amount);
        System.out.println("총 금액:" + balance);
        System.out.println("계좌 번호:" + id);
    }

    // 돈을 인출하는 메서드 생성
    void withdraw(int amount){
        if (amount > balance){
            System.out.println("계좌의 금액이 부족합니다. 부족한 금액: " + (amount - balance) + "원");
        }else{
            balance = balance - amount;
            System.out.println("계좌의 인출이 완료되었습니다. 남은 금액: " + balance);
        }
        System.out.println("계좌 번호:" + id);
    }
}
