package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date UpdatedDate;
    private ArrayList<MenuItem> updatedMenu;

    public Menu(Date updatedDate, ArrayList<MenuItem> updatedMenu) {
        UpdatedDate = updatedDate;
        this.updatedMenu = updatedMenu;
    }

    public Date getUpdatedDate() {
        return UpdatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        UpdatedDate = updatedDate;
    }

    public ArrayList<MenuItem> getUpdatedMenu() {
        return updatedMenu;
    }

    public void setUpdatedMenu(ArrayList<MenuItem> updatedMenu) {
        this.updatedMenu = updatedMenu;
    }
}
