import java.time.LocalDate;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price = 0.0;
    public LocalDate dateUpdated;
    public LocalDate dateCreated = new LocalDate();


    public MenuItem(String name, String description, double price, String category){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateUpdated = new LocalDate();
    }



