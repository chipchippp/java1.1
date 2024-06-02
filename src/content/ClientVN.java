package content;

import java.util.Date;

public class ClientVN {
    int id;
    String name;
    Date billDate;
    String customers;
    float quantity;
    int price;

    public ClientVN(int id, String name, Date billDate, String customers, float quantity, int price) {
        this.id = id;
        this.name = name;
        this.billDate = billDate;
        this.customers = customers;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getCustomers() {
        return customers;
    }

    public void setCustomers(String customers) {
        this.customers = customers;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", billDate=" + billDate +
                ", customers='" + customers + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
