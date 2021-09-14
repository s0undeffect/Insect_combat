public class MorphoEpistrophus {
    Insect insect = new Insect("Morpho Epistrophus",80,15,100,"Fire") {

        public void fireClaw(){
            System.out.println("Morpho Epistrophus bites his enemy.");
        }
        public void deathSwing(){
            int ap = 20;
            System.out.println("Morpho Epistrophus fires his spikes at his enemy!");
        }
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

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }
    };
}
