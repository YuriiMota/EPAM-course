package epam.MusicShop;

enum Company {
    YAMAHA, GIBSON, LESPAUL, DRUMDRUM
}

enum Country {
    UKRAINE, USA, ENGLAND, DENMARK
}

public abstract class MusicInstrument {
    private int weight;
    private float price;

    private String type;
    private Company company;
    private Country country;

    @Override
    public String toString() {
        return "MusicInstrument{" +
                "weight=" + weight +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", company=" + company +
                ", country=" + country +
                '}';
    }

    void print() {
        System.out.print(type + " ");
        System.out.print(company.toString() + " ");
        System.out.print("Country: " + country.toString() + " ");
        System.out.print("Price: " + price + "$ ");
        System.out.println("Weight: " + weight + " ");
    }

    public int getWeight() {
        return weight;
    }

    public float getPrice() {
        return price;
    }

    public Company getCompany() {
        return company;
    }

    public Country getCountry() {
        return country;
    }

    public String getType() {
        return type;
    }


    public MusicInstrument(int weight, float price, String type, Country country, Company company) {
        this.weight = weight;
        this.price = price;
        this.type = type;
        this.company = company;
        this.country = country;
    }
}

