package RestaurantMenu;

public class MenuItem {

            private String name;
            private double price;
            private String itemDescription;

            private String itemCategory;

            private Boolean newItem;

            public MenuItem(String name, double price, String itemDescription) {
                this.name = name;
                this.price = price;
                this.itemDescription = itemDescription;
                this.itemCategory = "Not Categorized";
                this.newItem = false;
            }

    public MenuItem(String name, double price, String itemDescription,String itemCategory, Boolean newItem) {
        this.name = name;
        this.price = price;
        this.itemDescription = itemDescription;
        this.itemCategory = "Not Categorized";
        this.newItem = false;
    }

            public String getName() {
                return this.name;
            }

                private void name(String name) {
                    this.name = name;
                }

            public double getPrice() {
                return this.price;
            }

            private void price(double price) {
                this.price = price;
            }

            public String getItemDescription() {
                return this.itemDescription;
            }

            public void setItemDescription(String itemDescription) {
                this.itemDescription = itemDescription;
            }

            public String getItemCategory() {
                return this.itemCategory;
            }

            public void setItemCategory(String itemCategory) {
                this.itemCategory = itemCategory;
            }

            public boolean getNewItem() {
                return this.newItem;
            }

            public void setNewItem(boolean newItem) {
                this.newItem = newItem;
            }
        }
