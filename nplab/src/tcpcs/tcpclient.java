package tcpcs;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
public class tcpclient {

	@SuppressWarnings({ "deprecation", "resource", "unused" })
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("localhost",55);
		DataInputStream in=new DataInputStream(s.getInputStream());
		DataOutputStream out=new DataOutputStream(s.getOutputStream());
		DataInputStream sysin=new DataInputStream(System.in);
		String str=in.readLine();
		System.out.println("String from Tcp Serever"+str);
		System.out.println("enter reply message");
		String line=sysin.readLine();
		out.writeBytes(line);
		s.close();

	}

}
