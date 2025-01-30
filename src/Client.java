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

    }
    public void leggi(){

    }
    public void chiudi(){
        
    }
}