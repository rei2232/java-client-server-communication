import java.net.*;
import java.io.*;
import java.io.IOException;
public class Server{

    public static void main(String[] args) throws IOException {
    	ServerSocket listener = new ServerSocket(6666);
    	System.out.println("Server is running");
    	while (true) {
    		Socket socket = listener.accept();
    		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
    		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    		String msg="";
    		while(true) {
    			msg = input.readLine();
    			if (msg.equals("#"))
    			{
    			out.println("From Server: terminatin connection");
    			break;
    			}
    			else out.println("From Server: "+msg);
    			
    		}
    		out.close();
    		input.close();
    		socket.close(); 
    	}
    }
}
