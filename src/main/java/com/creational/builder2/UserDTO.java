package com.creational.builder2;

import com.creational.builder.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserDTO {

    private String firstName;
    private String age;
    private String address;

    private UserDTO(String firstName,String age,String address){
        this.firstName=firstName;
        this.age=age;
        this.address=address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "firstName='" + firstName + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //Get builder instance
    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }

    public static class UserDTOBuilder{
        private String firstName;
        private  String lastName;
        private String age;
        private String address;

        public UserDTOBuilder withFirstName(String firstName){
            this.firstName=firstName;
            return this;
        }

        public  UserDTOBuilder withLastName(String lastName){
            this.lastName=lastName;
            return this;
        }

        public UserDTOBuilder withBirthDate(LocalDate date){
            Period ageInYear=Period.between(date,LocalDate.now());
            age=Integer.toString(ageInYear.getYears());
            return this;

        }

        public  UserDTOBuilder withAddress(Address address){
            this.address=address.getHouseNumber()+", "+address.getStreet()+","+
                    "\n"+address.getCity()+" \n "+address.getState()+" "+address.getZipcode();
            return this;
        }

        public UserDTO build(){
            UserDTO userDTO=new UserDTO(this.firstName+this.lastName,this.age,this.address);
            return userDTO;
        }




    }

}
