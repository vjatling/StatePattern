package State;

public class WeavingState implements State{
	FabricFactory fabric;
	 public WeavingState(FabricFactory fabric) {
		// TODO Auto-generated constructor stub
		 this.fabric=fabric;
	}

	public void spinning() {
		// TODO Auto-generated method stub
		if(fabric.checkFabric()) {
			System.out.println("Machine is turned on and Spinning is Started");
			fabric.setState(fabric.getMachineOn());
		}	else {
			System.out.println("Fabrics is out of Stock....");
			fabric.setState(fabric.getMachineOff());
		}
		
		
	}


	@Override
	public void Weaving() {
		// TODO Auto-generated method stub
		System.out.println("Weaving is completed");
		
	}


	@Override
	public void MachineOn() {
		// TODO Auto-generated method stub
		System.out.println("Machine is turned on");
		
	}


	@Override
	public void MachineOff() {
		// TODO Auto-generated method stub
		System.out.println("Machine is turned off");
		
	}
	public String toString() {
		return "Weaving has been started";
	}

	@Override
	public void Spinning() {
		// TODO Auto-generated method stub
		
	}

}
