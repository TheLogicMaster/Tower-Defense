package towerDefense.map;

public abstract class TrackSection {
	public abstract int getSectionHeight();
	public abstract int getSectionWidth();
	public abstract int getSectionTrackLength();
	public abstract boolean isStartingSection();
	public abstract boolean isEndingSection();
	public abstract int getStartAngle();
	public abstract int getEndAngle();
	public abstract double getSpeed();
	
	public abstract void setHeight(int height);
	public abstract void setWidth(int width);
	public abstract void setLength(int length);
	public abstract void setIsStartingSection(boolean isStart);
	public abstract void setIsEndingSection(boolean isEnd);
	public abstract void setStartAngle(int angle);
	public abstract void setEndAngle(int angle);
	public abstract void setSpeed(double speed);
	//extensions of this are in the tracks package
	
	public abstract int getX();
	public abstract int getY();
	public abstract void setCoords(int x, int y);
}
