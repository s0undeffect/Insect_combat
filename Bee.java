public class Bee {
    Insect insect = new Insect("Bee", 100, 15, 100) {

        public void beedance(){
            System.out.println("Bee intimidades his target!");
        }

        public void deathsting(){
            int ap = 50;
            System.out.println("Bee strikes back with a suicidal move. Very critical");
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
