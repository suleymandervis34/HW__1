public class Animals  extends Zoo {
    private int age;
    private Color color;
    private Hebitat hebitat;

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public Hebitat getHebitat() {
        return hebitat;
    }

    public Animals(String name, String adres, int age, Color color, Hebitat hebitat) {
        super(name, adres);
        this.age = age;
        this.color = color;
        this.hebitat = hebitat;
    }
    public String getInfo(){
        return "name:"+getName()+"\nadres "+ getAdres()+"\nage "+ getAge() + "\nColor "+ getColor()+ "\nHebitat "+hebitat.getName();
    }
    public final void makeVoise(){
        System.out.println("звук животного");
    }
    public void makeVoise(String voice){
        System.out.println(voice);

    }
}
