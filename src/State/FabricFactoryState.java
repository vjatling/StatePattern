package State;

public class FabricFactoryState {

	public static void main(String []args) {
		FabricFactory fabric=new FabricFactory(100);
		System.out.println(fabric);
		
		fabric.machineOff();
		System.out.println(fabric);
		
		fabric.machineOn();
		System.out.println(fabric);
		
		fabric.spinning();
		System.out.println(fabric);
		
		fabric.weaving();
		System.out.println(fabric);
		
		fabric.machineOff();
		System.out.println(fabric);
		
		fabric.machineOn();
		System.out.println(fabric);
		
		fabric.machineOff();
		fabric.machineOn();
		fabric.usingFabric();
		fabric.machineOn();
		fabric.loadFabric(200);
		fabric.machineOff();
		fabric.spinning();
		fabric.weaving();
				
	}

}
