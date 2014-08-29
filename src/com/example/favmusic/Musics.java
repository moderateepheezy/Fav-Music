package com.example.favmusic;

public class Musics {
	private int image;
	private String title;
	private String artist;
	public Musics(int image, String title, String artist) {
		
		this.image = image;
		this.title = title;
		this.artist = artist;
	}
	public int getImage() {
		return image;
	}
	public void setImage(int image) {
		this.image = image;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return artist;
	}
	public void setDescription(String description) {
		this.artist = description;
	}
	
	
}
