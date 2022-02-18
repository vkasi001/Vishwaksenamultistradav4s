/**
 * 
 */
package multistrada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * @author 13025
 *
 */
public class adaptiveCruisecontrol implements GenericComponent{ 
	
	private String metalbox;
	private String motherboard;
	private String cables;
	private ducatimultistradav4s ducaticv4s;
	private ProcessingUnit processingunit;
	private Server server;
	private radarsensorone sensor;
	public adaptiveCruisecontrol()
	{
		ducaticv4s=new ducatimultistradav4s ();
		processingunit= new ProcessingUnit ();
		server= new Server();
		sensor= new radarsensorone();
		
		
				
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ducati now in adaptive cruise control mode");
		
	}
	
	private void sendRadarSignal()
	{
		//This function enables the radar to send radar
	}
	
	private void receiveRadarSignal()
	{
		//This function enables to receive the information and radar signals
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "adaptive cruise control";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		// TODO Auto-generated method stub
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents,ducaticv4s , processingunit, server, sensor); // add all your sub components
		return internalComponents;
	}

}
