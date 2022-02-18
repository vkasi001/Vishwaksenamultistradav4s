/**
 * 
 */
package multistrada;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author 13025
 *
 */
public class ProcessingUnit implements SelfCheckCapable
{
	private String controlunit;
	private String arthematiclogicUnit;
	private String registers;
	
	private void controlsACC()
	{
		//Controls Few functions of ACC
	}

	private void storesdata() {
		//Stores the data 
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "processingunit";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	
	}

