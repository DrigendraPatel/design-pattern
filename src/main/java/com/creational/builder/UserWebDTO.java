package com.creational.builder;
// This is the product
public class UserWebDTO implements UserDTO{

    private String name;
    private String age;
    private String address;
    public UserWebDTO(String name,String age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public String getAge() {
        return null;
    }


    @Override
    public String toString() {
        return "UserWebDTO{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
