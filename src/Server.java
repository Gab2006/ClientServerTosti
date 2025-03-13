
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private int porta;

    public Server(int porta) {
        this.porta = porta;
        try {
            //realizza la primitiva listen e bind
            serverSocket = new ServerSocket(porta);
            System.out.println("Il server è in ascolto");
        } catch (IOException e) {
            System.err.println("Server non in ascolto " + e);
        }

    }

    public Socket attendi() {
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println(e);
        }
        return clientSocket;
    }

    public void scrivi(String messaggio) {
        output.println(messaggio);
    }

    public void leggi() {
        try {
            String mess = input.readLine();
            System.out.println("Messaggio ricevuto: " + mess);
        } catch (IOException e) {
            System.err.println("Errore nella lettura del messaggio.");
        }
    }

    public void chiudi() {
        try {
            clientSocket.close();
            System.out.println("Socket chiuso.");
        } catch (IOException e) {
            System.err.println("Errore nella chiusura del socket.");
        }
    }


    public void termina() {
        try{
            serverSocket.close();
            System.out.println("Server chiuso");
        } catch (IOException e){
            System.out.println("Errore nella chiusura del server");
        }
    }
}
