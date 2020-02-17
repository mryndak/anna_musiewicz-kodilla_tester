public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight < 650) {
            System.out.println("This notebook is light");
        } else if (this.weight > 650 && this.weight < 1250) {
            System.out.println("This notebook is not so heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }

    public void checkYearAndPrice() {
        if (this.year < 2011) {
            System.out.println("This notebook is very old");
        } else if ((this.year > 2011) && (this.price > 1000)) {
            System.out.println("This notebook is new and expensive");
        } else if ((this.year > 2011) && (this.price < 1000)) {
            System.out.println("This notebook is new and chip");
        } else {
            System.out.println("This notebook is new");
        }
    }




}
