package towerDefense.map.tracks;

import towerDefense.map.TrackSection;

public class StraightTrack extends TrackSection{

	/**
	 * @author PolymerBoy
	 * 
	 * a section of a track, specifically a straight one.
	 * 
	 * height and width: surrounding box. simple. 
	 * 
	 * length: length of track for the enemies.
	 * 
	 * speed: speed of the enemies going through.
	 * */
	
	private int height, width, length, startAngle, x, y;//angles in DEGREES, distances in PIXELS, speed in PIXELS/TICK
	private double speed;
	private boolean isStart, isEnd;
	
	private StraightTrack(int height, int width, int length, int startAngle, boolean isStart, boolean isEnd, int speed){
		//yay long constructors :D
		this.height = height;
		this.width = width;
		this.length = length;
		this.startAngle = startAngle;
		this.isStart = isStart;
		this.isEnd = isEnd;
	}
	
	public StraightTrack(int length, int startAngle, boolean isStart, boolean isEnd, int speed){
		this((int) Math.cos(startAngle * Math.PI / 180D) * length,(int) Math.sin(startAngle * Math.PI / 180D) * length, length, startAngle, false, false, speed);
	}
	
	public StraightTrack(int length, int startAngle, int speed){
		this((int)(Math.sin(startAngle * Math.PI/180D) * length), (int) (Math.cos(startAngle * Math.PI/180D) * length), length, startAngle, false, false, speed);
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
		return startAngle + ((startAngle < 180) ? 180 : -180);
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

	/**does exactly the same as setStartAngle, but the track ends up pointing the other way.*/
	@Override
	public void setEndAngle(int angle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSpeed(double speed) {
		// TODO Auto-generated method stub
		this.speed = speed;
	}
	
	@Override
	public int getY() {
		return y;
	}
	
	@Override
	public void setCoords(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int getX() {
		return x;
	}
}
