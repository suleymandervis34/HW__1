public class Main {
    public static void main(String[] args) {
      Hebitat hebitat = new Hebitat("Австралия");
      Animals animals = new Animals("счастливые животные ","ибраимова 103 ", 3,Color.GREEN,hebitat);
        System.out.println(animals.getInfo());
        animals.makeVoise();
        animals.makeVoise("рррррррррррр");

        Hebitat hebitat1 = new Hebitat("amerika");
        Tiger tiger =new Tiger("зоопарк","комсомолская 51",5,Color.BLACK,hebitat1,"умеет прыгать");
        System.out.println(tiger.getInfo());
        tiger.makeVoise("вавававаав");
        tiger.makeVoise();

        Hebitat hebitat2 = new  Hebitat("europa");
        Tiger tiger1 = new Tiger("хорошие животные", "боконбаева 8", 2,Color.PINK,hebitat2,"умеет слушать");
        System.out.println(tiger1.getInfo());
        tiger1.makeVoise("бббббббб");
        tiger1.makeVoise();

    }
}