package ru.bmstu.domain;
import ru.bmstu.service.InvalidPhoneNumberException;

public class Person {
    private String firstName;
    private String secondName;
    private int age;
    private String phone;

    private static boolean is_valid(String phone){
        if (phone.length() == 11){
            try
            {
                long  c = Long.parseLong(phone);
                return true;
            }
            catch (NumberFormatException e){
//                System.out.print('a');
                return false;
            }
        }
        else{
//            System.out.print('b');
            return false;
        }

    }

    public Person(String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public Person(String firstName, String secondName, int age, String phone) throws InvalidPhoneNumberException {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.phone = phone;
        boolean res = is_valid(this.phone);
//        System.out.print(res);
        if (!res){
            InvalidPhoneNumberException e = new InvalidPhoneNumberException("Phone is not valid");
            throw e;
        }
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setPhone(String phone) throws InvalidPhoneNumberException {
        boolean res = is_valid(phone);
//        System.out.print(res);
        if (!res){
            InvalidPhoneNumberException e = new InvalidPhoneNumberException("Phone is not valid");
            throw e;
        }
        else{
            this.phone = phone;
        }
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getSecondName(){
        return this.secondName;
    }

}
