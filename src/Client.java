import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client{
    private String nome;
    private String colore; 
    private Socket socket;
    
    public Client(String nomeDefault, String coloreDefault){
        nome = nomeDefault;
        colore = coloreDefault;
    }
    public Client(String nome){
        this.nome = nome;
    }
    public void connetti(String nomeServer, int portaServer){
        try {
            socket = new Socket(nomeServer, portaServer);
            System.out.println("1. Connessione avvenuta.");
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            System.out.err("Connessione non riuscita.");
        }
    }
    public void scrivi(){
        try {
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Inserisci messaggio: ");
            String mess= buff.readLine();
            output.println(mess);
        } catch (IOException e) {
            System.err.println("Errore nell'invio del messaggio.");
        }
    }
    
    public void leggi(){
        try {
            String risposta = input.readLine();
            System.out.println(risposta);
        } catch (IOException e) {
            System.err.println("Errore nella lettura della risposta.");
        }
    }
public void chiudi(){
        try {
            socket.close();
            System.out.println("Socket chiuso.");
        } catch (IOException e) {
            System.err.println("Errore nella chiusura del socket.");
        }
    }
}
