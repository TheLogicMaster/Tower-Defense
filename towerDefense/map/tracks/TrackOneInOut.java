package towerDefense.map.tracks;

public class TrackOneInOut {
	public static double px[] = new double[999999999];
	public static double py[] = new double[999999999];
	public static double rad;

	public static void trackGen() {

		for (int i = 0; i <= towerDefense.Main.curves; i++) {
			px[i] = towerDefense.Main.px[i];
			py[i] = towerDefense.Main.py[i];

		}
		for (int a = 1; a <= towerDefense.Main.curves; a++) {
			rad = Math.atan2(py[a] - py[a - 1], px[a] - px[a - 1]);

			for (int b = 1; b <= towerDefense.Main.res; b++) {
				towerDefense.Main.px[(int) (towerDefense.Main.res * a + b)] = Math.cos(rad) * (b * Math.sqrt(Math.pow(py[a]-py[a - 1],2) + Math.pow(px[a]-px[a - 1],2))/towerDefense.Main.res) + px[a - 1];
				towerDefense.Main.py[(int) (towerDefense.Main.res * a + b)] = Math.sin(rad) * (b * Math.sqrt(Math.pow(py[a]-py[a - 1],2) + Math.pow(px[a]-px[a - 1],2))/towerDefense.Main.res) + py[a - 1];

			}
		}
	}

}
// I don't think you will agree with this much, Chris.