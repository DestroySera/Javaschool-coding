package week03.week03day5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;

	public Server() {
		try {
			serverSocket = new ServerSocket(6077);
			System.out.println("서버 준비");
			clientSocket = serverSocket.accept();
			System.out.println("클라이언트 소켓 생성");
			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
		} catch (Exception e) {
			// e.printStackTrace();
		}
		dataSend();
		dataRecv();
	}

	private void dataRecv() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					String data = "";
					while (true) {
						data = dataInputStream.readUTF();
						System.out.println(data);
					}
				} catch (IOException e) {
					System.out.println("나감");
				}

			}

		}).start();
	}

	private void dataSend() {

		Scanner in = new Scanner(System.in);

		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while (true) {
						String sendData = in.nextLine();
						dataOutputStream.writeUTF(sendData);
					}
				} catch (Exception e) {
					System.out.println("나감");
				}
			}
		}).start();
		in.close();
	}
	
	public static void main(String[] args) {
		new Server();
	}
}
