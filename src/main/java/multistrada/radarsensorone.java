/**
 * 
 */
package multistrada;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author 13025
 *
 */
public class radarsensorone implements SelfCheckCapable
{

	private String sizeofantenna;
	private String manufacturer;
	private String model;
	
	private void fireradarbeam() {
		// It emits radar beam
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "sensor";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
}
