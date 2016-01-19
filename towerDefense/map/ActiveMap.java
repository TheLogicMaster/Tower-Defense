package towerDefense.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import towerDefense.enemies.EnemyBase;
import towerDefense.towers.TowerBase;

public class ActiveMap {

	private Map map;
	private int life, money, level;
	
	private ArrayList<TowerBase> towers;
	private HashMap<TowerBase, int[]> towerCoordsByTower;
	private ArrayList<EnemyBase> enemies;
	private HashMap<EnemyBase, int[]> enemyCoordsByEnemy;
	private Difficulty difficulty;
	
	public ActiveMap(Map map, Difficulty difficulty, int life, int money){
		this.life = life;
		this.money = money;
		this.map = map;
		this.level = 1;
		this.towers = new ArrayList<>();
		this.towerCoordsByTower = new HashMap<>();
		this.enemies = new ArrayList<>();
		this.enemyCoordsByEnemy = new HashMap<>();
		this.difficulty = difficulty;
	}
	
	public ActiveMap(Map map, Difficulty difficulty){
		switch(difficulty){
			case EASY:
				life = 200;
				money = 700;
				break;
			case EXPERT:
				life = 50;
				money = 625;
				break;
			case HARD:
				life = 100;
				money = 650;
				break;
			case NORMAL:
				life = 150;
				money = 675;
				break;
			default:
				life = -1;//terminate game without counting a loss
				money = 0;
				break;
		}
	}
	
	public void spawnEnemy(){
		ArrayList<TrackSection> startTracks = new ArrayList<>();
		for(TrackSection s : map.getTrack()){
			if(s.isStartingSection())
				startTracks.add(s);
		}
		Random r = new Random();
		TrackSection section = startTracks.get(r.nextInt(startTracks.size()));
		int x = section.getX();
		int y = section.getY();
		int length = section.getSectionTrackLength();
		double angle = section.getStartAngle() * Math.PI / 180D;//radians
		int x2 = (int) (x + length * Math.cos(angle));
		int y2 = (int) (y + length * Math.cos(angle));
		EnemyBase e;
		enemies.add(e = getEnemy());
		enemyCoordsByEnemy.put(e, new int[]{x2, y2});
	}
	
	/**random enemy, based on the level.*/
	public EnemyBase getEnemy(){
		int level = 0;
		switch(difficulty){//ranks come faster on higher difficulties
		//feel free to change these formulas. just update the values listed.
			case EASY:
				level = this.level;//1,2,3,4,5
				break;
			case NORMAL:
				level = this.level * 2 - 1;//1,3,5,7,9
				break;
			case HARD:
				level = this.level * 3 - 2;//1,4,7,10,13
				break;
			case EXPERT:
				level = this.level * 4 - 3;//1,5,9,13,17
				break;
			default:
				level = this.level;
				break;
		}
		
		int maxRank = (int) ((Math.sqrt(level * 2) - (double) ((level + 2) / 2D)) + 1.5 + (double) level / 3D);
		//maximum rank of enemy (exclusive), starts at 1.
		Random r = new Random();
		int rank = r.nextInt(maxRank);
		while(level > 35 && rank < 6);
		EnemyBase e = null;
		switch(rank){
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
		}
		return e;
	}
	
	public void placeTower(TowerBase t, int[] coords){
		towers.add(t);
		towerCoordsByTower.put(t, new int[]{coords[0], coords[1]});
	}
	
	public Map getMap(){
		return map;
	}
	
	public int getLife(){
		return life;
	}
	
	public int getMoney(){
		return money;
	}
	
	public int getLevel(){
		return level;
	}
}
