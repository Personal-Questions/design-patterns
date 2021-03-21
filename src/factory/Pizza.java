package factory;

public abstract class Pizza {

    String name;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake the pizza at 350 degree for 5 min");
    }

    public void cut() {
        System.out.println("Cut the pizza into slices.");
    }

    public void box() {
        System.out.println("Get a box and put the pizza.");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
