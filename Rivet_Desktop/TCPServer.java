import java.io.*;
import java.net.*;

public class TCPServer {
  public static void main(String argv[]) throws Exception {
    String clientSentence;
    ServerSocket welcomeSocket = new ServerSocket(6789);

    while(true) {
      Socket connectionSocket = welcomeSocket.accept();
      BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
      clientSentence = inFromClient.readLine();
      System.out.println("Received: " + clientSentence);
    }
  }
}
