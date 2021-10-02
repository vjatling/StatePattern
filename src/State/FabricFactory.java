package State;

public class FabricFactory {

	State machineOnState;
	State machineOffState;
	State spinningState;
	State weavingState;
	
	State state= spinningState;
	double fabric=0.0;
	
	public FabricFactory(double fabric) {
		machineOnState =new MachineOnState(this);
		machineOffState =new MachineOffState(this);
		spinningState=new SpinningState(this);
		weavingState =new WeavingState(this);
		
		this.fabric=fabric;	
		if (fabric>0) {
			state=spinningState;
		}
	}
	
		public void spinning() {
			state.Spinning();
		}
		
		public void machineOff() {
			state.MachineOff();
		}
		public void machineOn() {
			state.MachineOn();
		}
		public void weaving() {
			state.Weaving();
		}
		
		public State getSpinningState() {
			return spinningState;
		}
		public State getMachineOn() {
			return machineOnState;
		}
		public State getMachineOff() {
			return machineOffState;
		}
		public State getWeavingState() {
			return weavingState;
		}

		public void setState(State state) {
			this.state = state;
		}
		
		public double getFabric() {
			return fabric;
		}
		public void loadFabric(double fabric) {
			this.fabric += fabric;
		}
		public boolean checkFabric() {
				return fabric > 25;
			}
		public void usingFabric() {
			this.fabric -= 25.0;
		}
		public String toString() {
			StringBuffer result = new StringBuffer();	
			
			if( fabric != 1) {
				result.append("");
			}
			result.append(" " + state + "\n");
			return result.toString();
		}


}
