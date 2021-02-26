
public class Customer {

    private int c_number;
    private String c_name;
    private String con_lastname;
    private String con_firstname;
    private String phone;
    private String adress_1;
    private String adress_2;
    private String city;
    private String state;
    private String pcode;
    private String country;
    private int e_number;
    private double c_limit;

    public Customer() {
    }

    public Customer(int c_number, String c_name, String con_lastname, String con_firstname, String phone, String adress_1, String adress_2, String city, String state, String pcode, String country, int e_number, double c_limit) {
        this.c_number = c_number;
        this.c_name = c_name;
        this.con_lastname = con_lastname;
        this.con_firstname = con_firstname;
        this.phone = phone;
        this.adress_1 = adress_1;
        this.adress_2 = adress_2;
        this.city = city;
        this.state = state;
        this.pcode = pcode;
        this.country = country;
        this.e_number = e_number;
        this.c_limit = c_limit;
    }

    public int getC_number() {
        return c_number;
    }

    public String getC_name() {
        return c_name;
    }

    public String getCon_lastname() {
        return con_lastname;
    }

    public String getCon_firstname() {
        return con_firstname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdress_1() {
        return adress_1;
    }

    public String getAdress_2() {
        return adress_2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPcode() {
        return pcode;
    }

    public String getCountry() {
        return country;
    }

    public int getE_number() {
        return e_number;
    }

    public double getC_limit() {
        return c_limit;
    }

    @Override
    public String toString() {
        return "\nCustomer" + "\n Costumer Number: " + c_number + "\n Name: "
                + c_name /*+ "\n Contact Last Name: " + con_lastname
                + "\n Contact First Name: " + con_firstname + "\n Phone: " + phone
                + "\n Address 1: " + adress_1 + "\n Address 2: " + adress_2
                + "\n City: " + city + "\n State: " + state + "\n Postal Code: "
                + pcode + "\n Country: " + country + "\n Employee Number: "
                + e_number + "\n Credit Limit: " + c_limit*/;
    }
    
}
