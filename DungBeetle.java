import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class DungBeetle{
    Insect insect = new Insect("DungBeetle", 120, 10, 100) {

        public void headbutt(){
            System.out.println("Dung Beetle gives a Headbutt");
        }

        public void giantShitball(){
            int ap = 20;
            System.out.println("Dung Beetle rolls his target with a giant shitball over!");
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
