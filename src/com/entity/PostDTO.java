package com.entity;

public class PostDTO {

	private int idx;
	private String userid;
	private String weather;
	private String style;
	private String photo;
	private String content;
	private String writeday;
	private int temp;
	
	public PostDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public PostDTO(int idx, String userid, String weather, String style, String photo, String content, String writeday, int temp) {
		super();
		this.idx = idx;
		this.userid = userid;
		this.weather = weather;
		this.style = style;
		this.photo = photo;
		this.content = content;
		this.writeday = writeday;
		this.temp = temp;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getUserid() {
		return userid;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriteday() {
		return writeday;
	}

	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "PostDTO [idx=" + idx + ", userid=" + userid + ", weather=" + weather + ", style=" + style + ", photo="
				+ photo + ", content=" + content + ", writeday=" + writeday + ", temp=" + temp + "]";
	}
}
