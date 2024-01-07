import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("학생 수를 입력해주세요 >> ");
        int count = scanner.nextInt();
        String result = ""; // 총 결과를 담을 저장변수 선언
        int total = 0; // 점수 총합 변수 선언

        Student[] students = new Student[count]; // 객체배열 생성

        // 학생 이름과 성적을 입력하고 저장하는 반복문
        for (int i = 0; i < students.length; i++) {
            System.out.print((i+1) + "번째 학생 이름과 성적을 입력하시오 (이름과 성적은 빈칸으로 구분) :");
            String name = scanner.next();
            int score = scanner.nextInt();

            students[i] = new Student(name, score); // 객체변수 생성 후 입력받은 값 저장

            result += name + " " + score + result;
        }
        // 평균 점수 구하기 전 전체 점수 계산
        for (int i = 0; i < students.length; i++) {
             total = total + students[i].score;
        }

        System.out.println(count + "명 학생의 평균 성적은 " + ((double)total / count) + " 입니다." );
    }
}
