package nplab;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
public class ipfinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String host;
Scanner input=new Scanner(System.in);
System.out.println("\n\n Enter host name:");
host=input.next();
try
{
	InetAddress address=InetAddress.getByName(host);
	System.out.println("IP address:" +address.toString());
}
catch(UnknownHostException uhEx)
{
	System.out.println("Could not find"+host);
	input.close();
}
	}

}
