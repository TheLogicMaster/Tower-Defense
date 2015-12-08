package towerDefense.map.tracks;

import towerDefense.map.TrackSection;

public class StraightTrack extends TrackSection{

	/**
	 * @author PolymerBoy
	 * 
	 * a section of a track, be it straight or curved. Any class using it figures out the curves itself.
	 * 
	 * height and width: surrounding box. simple. 
	 * 
	 * length: length of track for the enemies.
	 * */
	
	private int height, width, length, startAngle, endAngle;//angles in DEGREES, distances in PIXELS, speed in PIXELS/TICK
	private double speed;
	private boolean isStart, isEnd;
	
	public StraightTrack(int height, int width, int length, int startAngle, int endAngle, boolean isStart, boolean isEnd, int speed){
		//yay long constructors :D
		this.height = height;
		this.width = width;
		this.length = length;
		this.startAngle = startAngle;
		this.endAngle = endAngle;
		this.isStart = isStart;
		this.isEnd = isEnd;
	}
	
	@Override
	public int getSectionHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	@Override
	public int getSectionWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	@Override
	public int getSectionTrackLength() {
		// TODO Auto-generated method stub
		return length;
	}

	@Override
	public boolean isStartingSection() {
		// TODO Auto-generated method stub
		return isStart;
	}

	@Override
	public boolean isEndingSection() {
		// TODO Auto-generated method stub
		return isEnd;
	}

	@Override
	public int getStartAngle() {
		// TODO Auto-generated method stub
		return startAngle;
	}

	@Override
	public int getEndAngle() {
		// TODO Auto-generated method stub
		return endAngle;
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

	@Override
	public void setHeight(int height) {
		// TODO Auto-generated method stub
		this.height = height;
	}

	@Override
	public void setWidth(int width) {
		// TODO Auto-generated method stub
		this.width = width;
	}

	@Override
	public void setLength(int length) {
		// TODO Auto-generated method stub
		this.length = length;
	}

	@Override
	public void setIsStartingSection(boolean isStart) {
		// TODO Auto-generated method stub
		this.isStart = isStart;
	}

	@Override
	public void setIsEndingSection(boolean isEnd) {
		// TODO Auto-generated method stub
		this.isEnd = isEnd;
	}

	@Override
	public void setStartAngle(int angle) {
		// TODO Auto-generated method stub
		this.startAngle = angle;
	}

	@Override
	public void setEndAngle(int angle) {
		// TODO Auto-generated method stub
		this.endAngle = angle;
	}

	@Override
	public void setSpeed(double speed) {
		// TODO Auto-generated method stub
		this.speed = speed;
	}

}
