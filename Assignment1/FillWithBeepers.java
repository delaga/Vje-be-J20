//import stanford.karel.Karel;
import stanford.karel.*;

public class FillWithBeepers extends SuperKarel{
	
	
	public void run(){
		
		while(frontIsClear()){
			
			putBeeper();
			move();
		}
	}
}