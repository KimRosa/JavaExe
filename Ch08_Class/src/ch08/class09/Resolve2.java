package ch08.class09;

// 중화요리집을 표현하는 ChinesseFood 클래스를 정의한 예제입니다.
public class Resolve2 {
    // ChinesseFood 클래스를 정적(static)으로 정의
    public static class ChinesseFood {
        private int noodle;      // 짜장면 개수
        private int chicken;     // 오렌지치킨 개수
        private int fried;       // 게 튀김 개수
        private int mara;        // 마라탕 개수
        private int time;        // 방문 시간
        private int people;      // 방문 인원

        // 중화요리집의 메뉴 정보를 설정하는 메서드
        public void setMenuInfo(int noodle, int chicken, int fried, int mara, int time, int people) {
            this.noodle = noodle;
            this.chicken = chicken;
            this.fried = fried;
            this.mara = mara;
            this.time = time;
            this.people = people;
        }

        // 중화요리집의 메뉴 정보를 출력하는 메서드
        public void show() {
            System.out.println("메뉴 개수와 방문 시간 그리고 인원 수를 입력해주세요");
            System.out.println("짜장면 : " + noodle + "개");
            System.out.println("오렌지치킨 : " + chicken + "개");
            System.out.println("게 튀김 : " + fried + "개");
            System.out.println("마라탕 : " + mara + "개");
            System.out.println("방문 시간 : " + time + "시");
            System.out.println("인원 : " + people + "명");
        }
    }

    // 메인 메서드에서는 ChinesseFood 클래스의 인스턴스를 생성하고 메뉴 정보를 설정한 후 출력합니다.
    public static void main(String[] args) {
        ChinesseFood guest = new ChinesseFood();
        guest.setMenuInfo(3, 2, 1, 5, 17, 11);

        guest.show();
    }
}
