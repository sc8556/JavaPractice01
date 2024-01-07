import java.util.Random;

class Dice{
    int value; // 주사위 결과값 변수 초기화

    // Random 한 주사위 값을 반환하는 메서드 생성
    int roll() {
        Random random = new Random(); // 랜덤함수 객체변수 생성
        System.out.println("주사위를 굴립니다.");

        value = random.nextInt(6); // 1~6까지의 랜덤값 변수에 할당, value값: 0~5

        value = value + 1; // value 값 1~6
        System.out.println("윗면은?? " + value);

        return value;
        }
    // 주사위 결과 계산 후 출력하는 메서드 생성
    void gameResult(int a, int b){
        if ((a + b) >= 10){
            System.out.println("총합 " +  (a+b) + "로 승리하였습니다.");
        }else {
            System.out.println("총합 " +  (a+b) + "로 패배하였습니다.");
            }
        }
    }

public class DiceGame {
    public static void main(String[] args) {
        Dice dice = new Dice(); // Dice 클래스 dice 변수에 주소 할당
        int tryOne, tryTwo; // 주사위를 굴렸을 때 결과값을 할당할 변수 선언

        System.out.print("첫 번째 ");
        tryOne = dice.roll(); //  첫 번째 주사위 굴리기
        System.out.print("두 번째 ");
        tryTwo = dice.roll(); // 두 번째 주사위 굴리기

        dice.gameResult(tryOne,tryTwo);

//        if((tryOne + tryTwo) >= 10){
//            System.out.println("승리");
//        }else {
//            System.out.println("패배");
//        }
    }
}
