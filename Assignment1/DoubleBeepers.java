import stanford.karel.*;
public class DoubleBeepers extends SuperKarel{
	public void run(){
		move();
		doubleTheBeepers();
		moveBackward();
	}
	
	private void moveBackward(){
		turnAround();
		move();
		turnAround();
	}
	
	private void doubleTheBeepers(){
		while(beepersPresent()){
			pickBeeper();
			put2BeepersNextDoor();
		}
		movePleBack();
	}	
	private void put2BeepersNextDoor(){
		move();
		putBeeper();
		putBeeper();
		moveBackward();
	}
	
	private void movePleBack(){
		move();
		while(beepersPresent()){
			moveOneBeeperBack();
		}
		moveBackward();
	}
	
	private void moveOneBeeperBack(){
		pickBeeper();
		moveBackward();
		putBeeper();
		move();
	}
}
