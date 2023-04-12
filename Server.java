import java.net.*;

public class Server {
    private ServerSocket serverSocket;

    public Server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public void startServer() {
        try {
            while(!serverSocket.isClosed()) {
                serverSocket.accept();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
