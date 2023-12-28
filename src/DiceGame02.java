public class DiceGame02 { // 절차 지향 방식
    public static void main(String[] args) {
        int a = (int)(Math.random() * 6) + 1;
        System.out.println("첫 번째: " + a);
        int b = (int)(Math.random() * 6) + 1;
        System.out.println("두 번째: " + b);

        System.out.println("총합: " + (a + b));

        if((a + b) >= 10){
            System.out.println("승리");
        }else{
            System.out.println("패배");
        }
    }
}
