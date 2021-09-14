public abstract class Insect {
    private String name;
    private int hp;
    private int ad;
    private int ap;
    private String element;

    public Insect(String name, int hp, int ad, int ap,String element) {
        this.name = name;
        this.hp = hp;
        this.ad = ad;
        this.ap = ap;
        this.element = element;
    }


}
