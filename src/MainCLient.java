public class MainClient{
    public static void main(String[] args) {
        Client cl = new Client("Tosti");
        cl.connetti("localhost", 2000);
        cl.scrivi();
        cl.chiudi();
    }
}