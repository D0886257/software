//package fcu.sep.fcushop.model;
//
//public class Cart {
//}
package fcu.sep.fcushop.model;

public class Cart {

    private int id;

    private String name;

    private String url;

    private String price;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;}

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}