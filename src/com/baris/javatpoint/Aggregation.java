package com.baris.javatpoint;

class Address {
    String city,state,country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

}

class Emp {
    int id;
    String name;
    Address address; // aggregation

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }
}


    public class Aggregation {

        public static void main(String[] args) {
            Address address = new Address("izmir","goztepe","turkey");
            Emp emp = new Emp(123,"baris",address);
            emp.display();
        }
}
