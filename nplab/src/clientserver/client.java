package clientserver;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class client {
	 public static DatagramSocket ds;
		public static byte buffer[]=new byte[1024];
	    public static int clientport=1030,serverport=1037;
		
	    public static void main(String[] args)throws Exception 
	    {
			ds=new DatagramSocket(clientport);
			System.out.println("Client is waiting for server to send data");
			System.out.println("Press Ctrl+C to come out");
			while(true)
			{
				DatagramPacket dp=new DatagramPacket(buffer,buffer.length);
				ds.receive(dp);
				String pdata=new String(dp.getData(),0,dp.getLength());
				System.out.println(pdata);
				
			}
			
		}

	}


