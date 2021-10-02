package State;

public class SpinningState implements State{
	FabricFactory fabric;
	public SpinningState(FabricFactory fabric ) {
		this.fabric = fabric;
	}

	@Override
	public void Spinning() {
		// TODO Auto-generated method stub
		if(fabric.checkFabric()) {
			fabric.setState(fabric.getMachineOn());
			fabric.usingFabric();
		}else {
			fabric.setState(fabric.getMachineOff());
	}
}
	@Override
	public void Weaving() {
		// TODO Auto-generated method stub
		System.out.println("Weaving is done and sent for Packaging");
		
	}

	@Override
	public void MachineOn() {
		// TODO Auto-generated method stub
			System.out.println("Machine is already turned on..");
			fabric.usingFabric();
		}
		

	@Override
	public void MachineOff() {
		// TODO Auto-generated method stub
		System.out.println("Fabrics is out of stock");
		fabric.setState(fabric.getMachineOff());
		
	}
	
	public String toString() {
		return "Spinning is done.";
		
	}

}
