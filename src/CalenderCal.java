

/*
사용자로부터 올바른 년(1~), 월(1~12), 일(1~31)을 입력 받아서 출력하는 프로그램을 작성하시오.
입력값이 유요한 범위 내에 있지 않으면 올바른 값을 입력 받을 때까지 반복하시오.
 */

import java.util.Scanner;
public class CalenderCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 객체변수 생성
        int year, month, date;
        //연도 입력
        while(true){
            System.out.println("연도를 입력해주세요.");
            year = sc.nextInt();
            if(year < 1){
                System.out.println("올바른 값을 입력해주세요. (1~)");
                continue;
            }
            break;
        }
        System.out.println("입력한 연도는?? " + year);

        //월 입력
        while (true){
            System.out.println("월을 입력해주세요.");
            month = sc.nextInt();
            if(month < 1 || month > 12){
                System.out.println("올바른 값을 입력해주세요. (1~12)");
                continue;
            }
            break;
        }
        System.out.println("입력한 월은?? " + month);

        boolean isleapyear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        boolean isthirtyDay = (month == 4) || (month == 6) || (month == 9) || (month == 11);
        // 일자 입력
        while (true){
            System.out.println("일자를 입력해주세요.");
            date = sc.nextInt();

            if(isthirtyDay == true){
                if(date < 1 || date > 30){
                    System.out.println("올바른 값을 입력해주세요. (1~30)");
                    continue;
                }
                break;
            }else {
                if(month == 2){
                    if(isleapyear == true){
                        if(date < 1 || date > 29){
                            System.out.println("올바른 값을 입력해주세요. (1~29)");
                            continue;
                        }
                    }else{
                        if(date < 1 || date > 28){
                            System.out.println("올바른 값을 입력해주세요. (1~28)");
                            continue;
                        }
                    }
                    break;
                }else{
                    if(date < 1 || date > 31){
                        System.out.println("올바른 값을 입력해주세요. (1~31)");
                        continue;
                    }
                    break;
                }
            }
        }
        int total_days = 0;
        total_days = total_days + (year-1) * 365;
        total_days = total_days + (year/4) - (year/100) + (year/400);

        if((isleapyear == true) && (month == 1 || month == 2)){
            total_days = total_days -1;
        }

        for (int i = 1; i < month; i++) {
            if (isthirtyDay == true){
                total_days = total_days + 30;
            }else{
                if(i == 2){
                    total_days = total_days + 28;
                }else {
                    total_days = total_days + 31;
                }
            }
        }
        total_days = total_days + date;
        // 최종결과 출력문
        System.out.println("입력한 날짜는?? " + year + "." + month + "." + date);
        System.out.println("1년 1월 1일 부터 일 수는?? " + total_days);
    }
}
