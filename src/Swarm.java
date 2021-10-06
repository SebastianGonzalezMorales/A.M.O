import java.util.ArrayList;


public class Swarm {
	
	private final ArrayList<Animal> SWARM = new ArrayList<>();
	public final int POPULATION_SIZE = 90;
	private final int DIMENSION = 30;
	
	private final int GENERATIONS = 50;
	private final int BOUND = 100;
	private final int UB = BOUND;
	private final int LB = -BOUND;
	
	public void execute() {
	      init();
	      run();
	  }
	
	private void init() { 
		
	    	Animal A;
	    	for(int i = 1; i <= POPULATION_SIZE; i++) {
	        	do{
	        		A = new Animal();
	        	}
	        	while(A.isFeasible());
	        	SWARM.add(A);
	        }
	}
	
	private void run() { 
    }
	
	
}
