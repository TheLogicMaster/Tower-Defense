package towerDefense;

public class Main {
	public static double px[] = new double[999999999];
	public static double py[] = new double[999999999];
	public static double curves = 4;
	public static double res = 10;

	public static void main(String[] args) {
		towerDefense.map.tracks.TrackOneInOut.trackGen();
		for (int i = 0; i<=curves;i++){
			System.out.println("px:" + (px[i]) + " py:" + (py[i]));
		}
		Window w = new Window();

	}

}
