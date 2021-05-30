package week03.week03day5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;
	
	public Client() {
		try {
			clientSocket = new Socket("localhost", 5000);
			System.out.println("서버 접속요청");
			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
		} catch (Exception e) {
			// TODO: handle exception
		}
		dataSend();
		dataRecv();
	}

	private void dataRecv() {
		new Thread (new Runnable() {

			@Override
			public void run() {
				try {
					String data = "";
					while (true) {
						data = dataInputStream.readUTF();
						System.out.println(data);
					}
				} catch (Exception e) {
					System.out.println("나감");
				}
				
			}
		}).start();
		
	}
	private void dataSend() {
		
		Scanner in = new Scanner(System.in);
		
		new Thread (new Runnable() {
			
			@Override
			public void run() {
				try {
					while(true) {
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
		new Client();
	}
}
