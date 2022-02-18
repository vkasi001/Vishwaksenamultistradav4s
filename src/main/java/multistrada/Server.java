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
public class Server implements SelfCheckCapable

{

	private String antena;
	private String manufacturer;
	private String memory;
	
	public void givesaccess() {
		// Gives security permission
	}
	public void managessystem() {
		// Manages all the systems and updates
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "server";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.3);
	}

}
