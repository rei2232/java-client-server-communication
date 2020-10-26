
import java.net.*;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;
public class Client {
  
    public static void main(String[] args) throws IOException {
    	String addr = "127.0.0.1";
    	int port = 6666;
    	Socket s  = new Socket(addr,port);
    	PrintWriter out = new PrintWriter(s.getOutputStream(), true);
    	BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
    	String msg="";
    	while(true) {
    		Scanner sc= new Scanner(System.in);
    		System.out.println("Send messsage to server: ");
    		String toServer = sc.nextLine();
    		out.println(toServer);
    		msg = input.readLine();
    		System.out.println(msg);
    		if (toServer.equals("#")) break;
    		
    		
    	}
    	out.close();
    	input.close();
    	s.close();
    	System.exit(0);
    }
}

