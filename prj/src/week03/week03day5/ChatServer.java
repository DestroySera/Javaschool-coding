package week03.week03day5;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer {
	Vector<ChatHandler> v;

	public ChatServer() {
		try {
			ServerSocket ss = new ServerSocket(5000);
			v = new Vector<>();
			System.out.println("서버 준비 완료");
			while (true) {
				Socket s = ss.accept();
				ChatHandler c = new ChatHandler(this, s);
				System.out.println("클라이언트");
				c.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void register(ChatHandler c) {
		v.add(c);
	}

	public void unregister(ChatHandler c) {
		v.remove(c);
	}

	public synchronized void broadcast(String message) {
		for (int i = 0; i < v.size(); i++) {
			ChatHandler c = v.get(i);
			try {
				c.disp(message);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new ChatServer();
	}
}
