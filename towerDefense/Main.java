package towerDefense;

public class Main {
	public static double px[] = new double[999];
	public static double py[] = new double[999];
	public static double curves = 4;
	public static double res = 10;

	public static void main(String[] args) {
		px[0]=0;
		py[0]=0;
		px[1]=50;
		py[1]=50;
		px[2]=50;
		py[2]=100;
		px[3]=100;
		py[3]=100;
		px[4]=100;
		px[4]=250;
		
		towerDefense.map.tracks.TrackOneInOut.trackGen();
		for (int i = 0; i<=curves * res;i++){
			System.out.println("px:" + (px[i]) + " py:" + (py[i]));
		}
		Window w = new Window();

	}

}
