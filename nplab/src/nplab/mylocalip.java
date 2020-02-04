package nplab;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class mylocalip {
	public static void main(String[] args)
	{
		try
		{
			 InetAddress address=InetAddress.getLocalHost();
			 System.out.println(address);
		 }
		 catch(UnknownHostException uhex)
		 {
			 System.out.println("could not find host ip");
		 }
		}
		}

	

