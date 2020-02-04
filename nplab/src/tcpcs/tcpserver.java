package tcpcs;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class tcpserver {

	@SuppressWarnings({ "deprecation", "resource" })
	public static void main(String[] args) throws IOException {
		
		
		ServerSocket ss=new ServerSocket(55);
		Socket s=ss.accept();
		DataInputStream in=new DataInputStream(s.getInputStream());
		DataOutputStream out=new DataOutputStream(s.getOutputStream());
		DataInputStream sysin=new DataInputStream(System.in);
		System.out.println("Enetr an String");
		
		String str=sysin.readLine();
		out.writeBytes(str+"\n");
		System.out.println("the String from TCP server"+in.readLine());
		
		// TODO Auto-generated method stub

	}

}


