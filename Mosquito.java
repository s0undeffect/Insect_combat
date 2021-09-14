public class Mosquito {

    Insect insect = new Insect("Mosquito", 80, 10, 100,"Air") {

        public void transfusion(){
            System.out.println("Mosquito is thirsty and sucks the blood from the victim.");
        }
        public void contaminate(){
            int ap = 20;
            System.out.println("The Mosquito injects viruses with its proboscis");

        }
        public void tornado(){
            int ap = 25;
            System.out.println("Heavy winds sling all sorts of debris towards the enemy!");
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
