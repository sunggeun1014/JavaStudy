package myobj.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
	
	private InputStreamReader isr;
	private BufferedReader in;
	private PrintStream out;
	private Socket socket;
	
	public Client(Socket socket) {
		this.socket = socket;
		try {
			isr = new InputStreamReader(socket.getInputStream());
			in = new BufferedReader(isr);
			out = new PrintStream(socket.getOutputStream());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sendMessage(String message) {
		out.println(message);
	}
	
	public BufferedReader getInputStream() {
		return in;
	}
	
	public String getId() {
		return socket.getRemoteSocketAddress().toString();
	}
	
	public void close() {
		try {
			if(isr != null) isr.close();
			if(in != null) in.close();
			if(out != null) out.close();
			if(socket != null) socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
