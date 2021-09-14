public class WaterSpider{

    Insect insect = new Insect("Water Spider", 100, 15, 100) {



        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return super.toString();
        }
    };

    public void CannibalCrush () {
        System.out.println("The Water Spider bites the body parts away! The opponent is bleeding...");
    }

    public void WaterbombSmack (int ap) {
        ap = 15;
        System.out.println("The Spider sssssssmack with a water bomb and makes the Target very uncomfortable, ha!");
    }


}




