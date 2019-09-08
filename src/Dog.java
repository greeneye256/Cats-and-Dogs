public class Dog {
    private String name;
    private String color;

    public Dog(String name, String culoare) {
        this.name = name;
        this.color = culoare;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuloare() {
        return color;
    }

    public void setCuloare(String culoare) {
        this.color = culoare;
    }

    @Override
    public String toString() {
        return "Nume = " + this.name + ", Culoare = " + this.color;
    }
}
