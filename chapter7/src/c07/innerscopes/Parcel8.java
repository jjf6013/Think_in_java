package c07.innerscopes;

public class Parcel8 {
    public Destination dest(final String dest){
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args){
        Parcel8 p = new Parcel8();
        Destination d = p.dest("我是你爸爸");
    }
}
