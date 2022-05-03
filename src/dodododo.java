
public class dodododo implements Comparable<dodododo> {
    private String name;
    private String category;
    private int value;

    // Creates a new bar.
    public dodododo(String name, int value, String category) {
        this.name = name;
        this.category = category;
        this.value = value;
    }

    // Returns the name of this bar.
    public String getName() {
        return this.name;
    }

    // Returns the value of this bar.
    public int getValue() {
        return this.value;
    }

    // Returns the category of this bar.
    public String getCategory() {
        return this.category;
    }


    @Override
    public int compareTo(dodododo that) {
        return this.compareTo(that);
    }
}