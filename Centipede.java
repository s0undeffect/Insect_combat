public class Centipede {
    Insect insect = new Insect("Centipede",120,10,100) {

        public void sweepingKick(){
            System.out.println("Centipede kicks his enemy with all his foot.");
        }

        public void venomClaw(){
            int ap = 15;
            System.out.println("Centipede bites with his poisonous Claw and poisoned his enemy!");
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
