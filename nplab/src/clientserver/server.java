package clientserver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class server
{

		public static DatagramSocket ds;
	    public static int clientport=1030,serverport=1037;
		
	    public static void main(String args[])throws Exception 
	    {   
	    	byte buffer[]=new byte[1024];
			ds=new DatagramSocket(serverport);
			BufferedReader breader=new BufferedReader(new InputStreamReader(System.in));
		   System.out.println("Server is waiting for input");
		
			while(true)
			{
				String str=breader.readLine();
				if(str==null|| str.equals("End"))
					break;
				buffer=str.getBytes();
				ds.send(new DatagramPacket(buffer,str.length(),InetAddress.getLocalHost(),clientport));
				
			}
			
		}

}
