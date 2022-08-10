package adpaterdesignpattern;

public class SocketAdapterImpl extends Socket implements SocketAdapter{
    @Override
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get12Volts() {
        Volt v=get12Volts();
        return convert(v,10);
    }

    private Volt convert(Volt v,int i)
    {
        return new Volt(v.getVolts()/i);
    }
}
