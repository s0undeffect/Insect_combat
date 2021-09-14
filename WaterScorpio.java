import com.sun.security.jgss.GSSUtil;

public class WaterScorpio {
    Insect insect = new Insect("Water Scorpio", 120, 10, 100,"Water") {
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

    public void HitAndRun (){
        System.out.println("Scorpio hits the target and runs away as a coward...");
    }

    public void Trunksting (int ap){
        ap = 20;
        System.out.println("Scorpio injects his trunk and absorbs hella lot of essential liquids! How you like that?");
    }
    public void tsunami(){
        int ap = 25;
        System.out.println("A giant wave rolls over the enemy and destroys everything in the way!");
    }
}
