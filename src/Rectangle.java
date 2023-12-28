public class Rectangle {
    int width;
    int height;

    Rectangle(){
        width = height = 1; // 너비, 높이 초기화, 너비와 높이가 0이면 존재하지 않는 것이기 때문에 1로 초기화
    }

    // 다른 클래스에서 이 생성자를 호출할 수 있도록 public으로 생성
    public  Rectangle(int width, int h){
        if(width < 0 ||  height < 0){
            width = 1;
            height = 1;
        }

        this.width = width;
        height = h;
    }

    int calArea(){
        return width * height;
    }
}
