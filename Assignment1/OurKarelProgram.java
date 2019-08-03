import stanford.karel.Karel;
import stanford.karel.SuperKarel;


public class OurKarelProgram extends SuperKarel{
	public void run(){
		moveToWall();
		for(int i=0;i<3;i++){
			turnLeft();
		}
		move();
		turnLeft();
		move();
		if(beepersPresent()){
			pickBeeper();
		}
		move();
		putBeeper();
		turnRight();
		move();
		move();
		turnAround();
	}
	private void moveToWall(){
	while(frontIsClear()){
		move();
	}
	}
}
