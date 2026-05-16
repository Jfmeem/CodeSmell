package bloaters.LongMethod;

import java.util.List;

public class odr {
    private String id;
    private List<Item> items;

    public odr(String id, List<Item> items) {
        this.id = id;
        this.items = items;
    }

    public String getId() { return id; }
    public List<Item> getItems() { return items; }
}
