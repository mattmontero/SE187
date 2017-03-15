import java.util.Stack;


public class TowerOfHanoi {
	
	Stack<Integer> tower1;
	Stack<Integer> tower2;
	Stack<Integer> tower3;
	int heightOfTower;
	
	
	TowerOfHanoi(int heightOfTower){
		tower1 = new Stack<Integer>();
		tower2 = new Stack<Integer>();
		tower3 = new Stack<Integer>();
		this.heightOfTower = heightOfTower;
		
		for(int i = heightOfTower; i > 0; i--){
			tower1.add(i);
		}
		System.out.println("Starting towers");
		System.out.println(tower1);
		System.out.println(tower2);
		System.out.println(tower3);
		System.out.println("***********************");
	}
	
	public void solve(){
		hanoiSolver(heightOfTower, tower1, tower2, tower3);
		displayTowers();
	}
	
	private void hanoiSolver(int height, Stack<Integer> from, Stack<Integer> to, Stack<Integer> helper){
		
		//base case
		
		if(height == 0){			
			return;
		} else {
			hanoiSolver(height-1, from, helper, to);
			to.add(from.pop());
			hanoiSolver(height-1, helper, to, from);	
		}
	}
	
	private void displayTowers(){
		System.out.println("Ending towers");
		System.out.println(tower1);
		System.out.println(tower2);
		System.out.println(tower3);
		System.out.println("***********************");
	}
}
