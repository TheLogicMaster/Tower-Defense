package towerDefense.map.tracks;

public class TrackOneInOut {
	public static double px[] = new double[999];
	//use ArrayList<Double>, size is exactly how many are needed
	public static double py[] = new double[999];
	public static double rad;

	public static void trackGen() {

		for (int i = 0; i <= towerDefense.TowerMain.curves; i++) {
			px[i] = towerDefense.TowerMain.px[i];
			py[i] = towerDefense.TowerMain.py[i];

		}
		for (int a = 1; a <= towerDefense.TowerMain.curves; a++) {
			rad = Math.atan2(py[a] - py[a - 1], px[a] - px[a - 1]);

			for (int b = 1; b <= towerDefense.TowerMain.res; b++) {
				towerDefense.TowerMain.px[(int) (towerDefense.TowerMain.res * a + b)] = Math.cos(rad)
						* (b * Math.sqrt(Math.pow(py[a] - py[a - 1], 2) + Math.pow(px[a] - px[a - 1], 2))
								/ towerDefense.TowerMain.res)
						+ px[a - 1];
				towerDefense.TowerMain.py[(int) (towerDefense.TowerMain.res * a + b)] = Math.sin(rad)
						* (b * Math.sqrt(Math.pow(py[a] - py[a - 1], 2) + Math.pow(px[a] - px[a - 1], 2))
								/ towerDefense.TowerMain.res)
						+ py[a - 1];

			}
		}
	}

}
// I don't think you will agree with this much, Chris.