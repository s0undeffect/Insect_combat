public class BulletAnt {
    Insect insect = new Insect("Bullet Ant", 80, 15, 100,"Fire") {

        public void bite(){
            System.out.println("Nom.. Nom.. Nom");
        }
        public void FullMetalJacket(){
            int ap = 30;
            System.out.println("The ant is using its sting. The sting burns like hell");
        }

        public void ignition (){
            int ap = 25;
            System.out.println("Fire strikes on the enemy");
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
