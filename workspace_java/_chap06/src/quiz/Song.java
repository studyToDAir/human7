package quiz;

public class Song {

	// 제목, 가수명, 장르, 가사, 곡 길이
	private String title;
	private String singer;
	private String genre;
	private String lyric;
	private int duration;
	
	// title getter
	// get+필드명(대문자로 시작)
	// 전달인자 : 없음
	// 리턴타입 : 필드의 타입
	public String getTitle() {
		return this.title;
	}
	
	// title setter
	// set+필드명(대문자로 시작)
	// 전달인자 : 필드의 타입
	// 리턴타입 : 없음
	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLyric() {
		return lyric;
	}

	public void setLyric(String lyric) {
		this.lyric = lyric;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song [title=" + title 
				+ ", singer=" + singer 
				+ ", genre=" + genre 
				+ ", lyric=" + lyric 
				+ ", duration=" + duration + "]";
	}
	
	
	
}







