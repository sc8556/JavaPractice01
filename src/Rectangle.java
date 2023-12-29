public class Rectangle {
    int width;
    int height;


    Rectangle(){
        width = height = 1;
        // 너비, 높이 초기화
        // 너비와 높이가 0이면 존재하지 않는 것이기 때문에 1로 초기화
    }
    Rectangle(int width, int height){

        this(); // 전달받은 너비와 높이가 음수일 경우 기본값으로 세팅, Rectangle() 생성자 호출
        if(width > 0 ||  height > 0){  // 전달받은 값을 너비, 높이 변수에 각각 저장
            this.width = width;
            this.height = height;
        }



    }
    // 전달받은 너비와 높이를 Return
    String getArea(){
        return width + " * " + height;
    }

    // 다른 클래스에서 이 생성자를 호출할 수 있도록 public으로 생성

    int calArea() {
        return width * height;

    }
}
