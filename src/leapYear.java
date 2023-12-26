/*
키보드로부터 연도를 입력 받아서 입력 받은 연도가 윤년인지 아닌지 판단하는 프로그램을 완성하시오.
<힌트>
주어진 연도 year가 윤년인지 판단하는 기준
1.) year가 400의 배수이면 무조건 윤년
ex.) 1600, 2000, 800
2.) year가 4의 배수이고 100의 배수가 아니면 윤년
ex,) 1100년은 윤년이 아님, 1004년은 윤년
 */
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("연도를 입력해주세요.");
        year = sc.nextInt();

        boolean isleapyear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));

        if(isleapyear == true){
            System.out.println(year + "년은 윤년입니다.");
        }else {
            System.out.println(year + "년은 윤년이 아닙니다.");
        }
        sc.close();


    }
}
