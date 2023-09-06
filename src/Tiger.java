public final class Tiger extends Animals {
    private String commands;

    public Tiger(String name, String adres, int age, Color color, Hebitat hebitat, String commands) {
        super(name, adres, age, color, hebitat);
        this.commands = commands;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\ncommands"+ this.commands;

    }

    @Override
    public void makeVoise(String voice) {
        super.makeVoise(voice);
    }
}
