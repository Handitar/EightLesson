public abstract class Shape implements Namable {
    private final String name;
    public void printName(){
    }

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
