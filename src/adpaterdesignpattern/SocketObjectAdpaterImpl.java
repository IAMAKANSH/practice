package adpaterdesignpattern;

public class SocketObjectAdpaterImpl implements SocketAdapter{

    private Socket socket=new Socket();

    @Override
    public Volt get120Volts() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volts() {
        return socket.getVolt();
    }
}
