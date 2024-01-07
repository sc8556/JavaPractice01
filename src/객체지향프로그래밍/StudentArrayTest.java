import java.util.Locale;
import java.util.Scanner;

public class StudentArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생 수를 입력해주세요 >> ");
        int num = scanner.nextInt();

        String schoolName = "";
        String name = "";
        int id = 0;
        int score = 0;

        Student[] students = new Student[num]; // 객체 배열 생성

        for (int i = 0; i < num; i++) {
            System.out.println((i+1) + "번째 학생 이름과 성적을 입력하시오: ");
            name = scanner.next(); // 입력받은 이름을 name 변수에 할당
            score = scanner.nextInt(); // 입력받은 점수를 score 변수에 할당

            Student student = new Student(name, score); // student 객체 변수 생성
            students[i] = student; // name, score 를 갖고 있는 객체 변수를 객체배열에 저장



        }
            System.out.println("학교       학번     이름      성적");
        for (int i = 0; i < num; i++) {
            System.out.println(students[i].schoolName + "   " + students[i].id + "   " +
                                students[i].name + "   " + students[i].score);
        }


        // 평균을 구하는 코드
//        int sum = 0;
//        for (int i = 0; i < num; i++) {
//            // **(새로 안 사실)** for문 안에서 변수를 선언하게 되면 for문 안에서만 사용할 수 있음
//            sum = sum + students[i].score;
//        }
//        System.out.printf("%d 명 학생의 평균성적은 %f 입니다.",num, (double)sum/num);


    }
}
