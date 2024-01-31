package ch08.class09;

/*
 * Rectangle 클래스를 작성합니다.
 */
public class Resolve5 {
    // 사각형을 구성하는 두 점의 좌표
    int x1, y1, x2, y2;

    // 좌표 설정 메서드
    void set(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // 사각형 넓이 계산 메서드
    int square() {
        return Math.abs((x2 - x1) * (y2 - y1));
    }

    // 좌표와 넓이 등 직사각형 정보를 출력하는 메서드
    void show() {
        System.out.println("좌표: (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")");
        System.out.println("넓이: " + square());
    }

    // 두 객체가 동일한 좌표의 직사각형인지 확인하는 메서드
    boolean equals(Rectangle r) {
        return (x1 == r.x1 && y1 == r.y1 && x2 == r.x2 && y2 == r.y2);
    }

    public static void main(String[] args) {
        // Rectangle 클래스 테스트
        Resolve5.Rectangle rect1 = new Resolve5.Rectangle();
        rect1.set(1, 2, 4, 5);

        Resolve5.Rectangle rect2 = new Resolve5.Rectangle();
        rect2.set(1, 2, 4, 5);

        Resolve5.Rectangle rect3 = new Resolve5.Rectangle();
        rect3.set(2, 3, 5, 6);

        rect1.show();
        rect2.show();
        rect3.show();

        System.out.println("rect1과 rect2는 동일한 좌표의 직사각형인가? " + rect1.equals(rect2));
        System.out.println("rect1과 rect3는 동일한 좌표의 직사각형인가? " + rect1.equals(rect3));
    }
}
