public class EchoServer extends Server{

    public EchoServer(int pPort) {
        super(pPort);
    }

    @Override
    public void processNewConnection(String pClientIP, int pClientPort) {
        System.out.println("Connect: "+pClientIP);
    }

    @Override
    public void processMessage(String pClientIP, int pClientPort, String pMessage) {
        sendToAll(pMessage);
    }

    @Override
    public void processClosingConnection(String pClientIP, int pClientPort) {

    }
}
