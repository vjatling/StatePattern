package State;

public class MachineOffState implements State{
	FabricFactory fabric;
	public MachineOffState(FabricFactory fabric) {
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
		System.out.println("Weaving is done and sent for Inspection and will be packed");
		
	}


	@Override
	public void MachineOn() {
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
	public void MachineOff() {
		// TODO Auto-generated method stub
		System.out.println("Machine is turned off..");
		
	}
	public String toString() {
		return "Machine is turned off";
		
	}

	@Override
	public void Spinning() {
		// TODO Auto-generated method stub
		
	}

}
