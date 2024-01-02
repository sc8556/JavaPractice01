public class Student{
    String name; // 이름
    int score; // 점수
    int id; // 학번
    static int cnt;
    static String schoolName;// static 필드인 cnt 선언
    public Student(String name, int score){
        cnt += 1; // Student 객체 인스턴스가 생성될 떄 cnt 증감
        id = cnt; // 증감한 cnt 값을 학번에 저장
        schoolName = "한성대학교"; // 학생들 간에 공유되는 정보로서 "한성대학교"로 초기화

        this.name = name;
        this.score = score;

    }


}