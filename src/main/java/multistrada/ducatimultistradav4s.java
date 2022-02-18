/**
 * 
 */
package multistrada;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author 13025
 *
 */
public class ducatimultistradav4s implements SelfCheckCapable
{
	private String colour;
	private String model;
	private String manufacturer;
	private String price;
	
	private void turnengineon()
	{
		// It turns on the ignition
	}
	private void receivesradarsignal()
	{
		// It receives signal from radar
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "ducativ4s";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.2);
	}
}
