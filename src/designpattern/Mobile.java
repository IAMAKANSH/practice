package designpattern;

public class Mobile {

    //private and required
    private final String name;
    private final String brand;
    //Optional
    protected Integer ram;
    protected Integer rom;
    protected String price;

    public Mobile(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }
    public Mobile(MobileBuilder mobileBuilder)
    {
        this(mobileBuilder.getName(),mobileBuilder.getBrand());
        this.ram=mobileBuilder.ram;
        this.rom=mobileBuilder.rom;
        this.price=mobileBuilder.price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getRom() {
        return rom;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "ram=" + ram +
                ", rom=" + rom +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    static class MobileBuilder extends Mobile{

        public MobileBuilder(String name, String brand) {
            super(name, brand);
        }

        public MobileBuilder ram(Integer ram)
        {
            if (ram==null)
                this.ram=4;
            else
                this.ram=ram;
            return this;
        }
        public MobileBuilder rom(Integer rom)
        {
            if (rom==null)
                this.rom=32;
            else
                this.rom=rom;
            return this;
        }
        public MobileBuilder price(String price)
        {
            if (price==null)
                this.price="20000";
            else
                this.price=price;
            return this;
        }
        public Mobile build()
        {
            return new Mobile(this);
        }
    }
}

class BuilderTesting{

    public static void main(String[] args) {

        Mobile nokia=new Mobile.MobileBuilder("Nokia C2-01","Nokia")
                .ram(6)
                .rom(64)
                .price("250000")
                .build();

        System.out.println(nokia);
    }
}
