package Restaurant;

import java.util.Date;

public class MenuItem {
    //Private int itemCode;
    private Double Price;
    private String Description;
    private String Category;
    private Date menuAddedOn;
    private Boolean newItem;

    public MenuItem(Double price, String description, String category, Date menuAddedOn, Boolean newItem) {
        Price = price;
        Description = description;
        Category = category;
        this.menuAddedOn = menuAddedOn;
        this.newItem = newItem;
    }

    public Double getPrice() {
        return Price;
    }

    public String getDescription() {
        return Description;
    }

    public String getCategory() {
        return Category;
    }

    public Date getMenuAddedOn() {
        return menuAddedOn;
    }

    public Boolean getNewItem() {
        return newItem;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setMenuAddedOn(Date menuAddedOn) {
        this.menuAddedOn = menuAddedOn;
    }

    public void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }
}
