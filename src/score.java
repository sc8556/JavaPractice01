import java.util.Scanner;

/*
학생들의 성적을 0 ~ 100점 사이의 정수로 입력 받아서, 학점을 출력하는 프로그램을 작성하라.
- 성적이 90점 이상이면 A학점
- 성적이 80점 이상 90미만 B학점
- 성적이 70점 이상 80미만 C학점
- 성적이 60점 이상 70미만 D학점
- 성적이 60점 미만이면 F학점
 */
public class score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 객체변수 생성
        String grade = "";
        System.out.println("성적을 입력해주세요.");
        int score = sc.nextInt();
        if (score > 90){
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else if (score >= 60 && score < 70) {
            grade = "D";
        } else if (score < 60) {
            grade = "F";
        }

        System.out.println(grade + "학점 입니다.");
        sc.close();
    }
}
