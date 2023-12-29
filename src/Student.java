public class Student {
    String name;
    int score;
    // 학생의 이름과 성적 초기화
    Student(){
        name = "NONE";
        score = 0;
    }

    Student(String name, int score){
        this();

        if(name != "" && score > 0) {
            this.name = name;
            this.score = score;
        }
    }
}
