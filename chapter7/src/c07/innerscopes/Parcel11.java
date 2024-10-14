package c07.innerscopes;

public class Parcel11 {
    class Contens {
        private int i = 11;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }

    public static void main(String[] args){
        Parcel11 p = new Parcel11();
        Parcel11.Contens c = p.new Contens();
        Parcel11.Destination d = p.new Destination("我是你爸爸");
    }
}
