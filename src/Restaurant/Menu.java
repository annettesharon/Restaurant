package Restaurant;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private LocalDate UpdatedDate;
    private ArrayList<MenuItem> updatedMenu;

    public Menu(LocalDate updatedDate, ArrayList<MenuItem> updatedMenu) {
        UpdatedDate = updatedDate;
        this.updatedMenu = updatedMenu;
    }

    public void checkDate(){
        if(getUpdatedDate().before(LocalDate.now(ZoneId.of( "America/Montreal"))))
    }
    public LocalDate getUpdatedDate() {
        return UpdatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        UpdatedDate = updatedDate;
    }

    public ArrayList<MenuItem> getUpdatedMenu() {
        return updatedMenu;
    }

    public void setUpdatedMenu(ArrayList<MenuItem> updatedMenu) {
        this.updatedMenu = updatedMenu;
    }

    public ArrayList<MenuItem> addItem(MenuItem item) {
        this.updatedMenu.add(item);
        return this.updatedMenu;
    }

    public ArrayList<MenuItem> removeItem(MenuItem item) {
        int toBeRemoved = -1;
        for (MenuItem currentItem : this.updatedMenu) {
            if (this.updatedMenu.equals(item)) {
                this.updatedMenu.remove(item);
            }
        }
        return this.updatedMenu;
    }
}

