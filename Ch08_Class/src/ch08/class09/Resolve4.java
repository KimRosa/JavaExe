package ch08.class09;

/*
 * 4. 노래를 나타내는 Song이라는 클래스를 설계하세요.
   <필드>
    노래제목 title
    가수    artist
    앨범제목 album
    작곡가  composer
    노래가 발표된 연도 year
    노래가 속한 앨범에서의 트랙 번호를 나타내는 track

   <메서드>
    노래의 정보를 저장하는 setSongInfo(...) : 관련된 매개변수를 인자로 넘겨줌
    노래의 정보를 나타내는 show()

   <main 실행>
    ABBA의 "Dancing Queen"노래를 Song객체로 생성하고
    Show()로 출력하세요
 */
public class Resolve4 {
	//Song 클래스는 노래의 정보를 저장하고 출력하는 기능
    public static class Song { 
        private String title;
        private String artist;
        private String album;
        private String composer;
        private int year;
        private int track;

        public Song() {

        }
        //노래의 정보를 설정하는 메서드
        public void setSongInfo(String title, String artist, String album, String composer, int year, int track) {
            this.title = title;
            this.artist = artist;
            this.album = album;
            this.composer = composer;
            this.year = year;
            this.track = track;
        }
        //노래의 정보를 출력하는 메서드
        public void show() {
            System.out.println("노래 제목 : " + title);
            System.out.println("가수 : " + artist);
            System.out.println("앨범 제목 : " + album);
            System.out.println("작곡가 : " + composer);
            System.out.println("발표 연도 : " + year);
            System.out.println("트랙 번호 : " + track);
        }
    }

    //메인 메서드에서는 Song 클래스의 인스턴스를 생성하고 "Dancing Queen" 노래의 정보를 설정한 후 출력합니다.
    public static void main(String[] args) {
        Song dancingQueen = new Song();
        dancingQueen.setSongInfo("DancingQueen", "Abba", "Arrival", "Benny Andersson, Björn Ulvaeus", 1976, 1);

        dancingQueen.show();
    }
}
