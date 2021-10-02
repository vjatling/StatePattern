package State;

public class MachineOnState implements State {
	 FabricFactory fabric;
	 public MachineOnState(FabricFactory fabric) {
		// TODO Auto-generated constructor stub
		 this.fabric=fabric;
	}

	public void spinning() {
		// TODO Auto-generated method stub	
		System.out.println("Spinning is already started");
		
	}

	@Override
	public void Weaving() {
		// TODO Auto-generated method stub
		System.out.println("Weaving is Completed.");
		
	}

	@Override
	public void MachineOn() {
		// TODO Auto-generated method stub
		System.out.println("Machine is turned on.");
		
	}

	@Override
	public void MachineOff() {
		// TODO Auto-generated method stub
		if(fabric.checkFabric()) {
			System.out.println("Machine is turned on and Spinning has Started");
			fabric.setState(fabric.getMachineOn());
		}	else {
			System.out.println("Fabrics is out of Stock....");
			fabric.setState(fabric.getMachineOff());
		}
		
	}
	public String toString() {
		return "Machines is turned on.";
	}

	@Override
	public void Spinning() {
		// TODO Auto-generated method stub
		
	}


}
