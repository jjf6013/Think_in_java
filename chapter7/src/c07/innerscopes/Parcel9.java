package c07.innerscopes;

public class Parcel9 {
    public Destination dest(final String s, final float price){
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if(cost > 100){
                    System.out.println("超出预算");
                }
            }
            private String label = s;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args){
        Parcel9 p = new Parcel9();
        Destination d = p.dest("我是你爸爸",101.395F);
    }
}
