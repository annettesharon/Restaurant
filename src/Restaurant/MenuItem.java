package Restaurant;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class MenuItem {
    //Private int itemCode;
    ArrayList<Object> menuItems = new ArrayList<Object>();
    private Double Price;
    private String Description;
    private String Category;
    private LocalDate menuAddedOn;
    private Boolean newItem;



    public MenuItem(Double price, String description, String category, LocalDate menuAddedOn, Boolean newItem) {
        Price = price;
        Description = description;
        Category = category;
        this.menuAddedOn = menuAddedOn;
        this.newItem = newItem;
    }

//    public void AddRemoveMenuItem(String choice) {
//        if (choice.toLowerCase() == "add"){
//            menuItems.add(getPrice());
//            menuItems.add(getDescription());
//            menuItems
//            this.menuAddedOn = LocalDate.now(ZoneId.of( "America/Montreal"));
//    } else if (choice.toLowerCase() == "remove") {
//
//        }
//        }


        public String newItem (){
        if(this.newItem){
            return "This item is new!";
        }
        else {
            return "This item is not new!";
        }
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
