package towerDefense.map;

import java.awt.Image;
import java.util.ArrayList;

public class Map {

	private ArrayList<TrackSection> track;
	private Image img;
	
	@SuppressWarnings("unchecked")
	public Map(ArrayList<TrackSection> track, Image img){
		this.img = img;
		this.track = (ArrayList<TrackSection>) track.clone();
	}
	
	public void setImage(Image img){
		this.img = img;
	}
	
	@SuppressWarnings("unchecked")
	public void setTrack(ArrayList<TrackSection> track){
		this.track = (ArrayList<TrackSection>) track.clone();
	}
	
	public Image getImage(){
		return img;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<TrackSection> getTrack(){
		return (ArrayList<TrackSection>) track.clone();
	}
}
