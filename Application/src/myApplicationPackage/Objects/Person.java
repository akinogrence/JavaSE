package myApplicationPackage.Objects;

public class Person implements Info{

    private int Age;
    private String Name;
    private String Surname;
    private String Citizen_Number;
    public static int Nüfus = 0;


    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getCitizen_Number() {
        return Citizen_Number;
    }

    public void setCitizen_Number(String citizen_Number) {
        Citizen_Number = citizen_Number;
    }

    public Person() {
        System.out.println("Bilinmeyen kişi oluşturuldu.");
        Nüfus++;
    }

    public Person(int Age, String Name, String Surname, String Citizen_Number) {
        this.Age = Age;
        this.Name = Name;
        this.Surname = Surname;
        this.Citizen_Number = Citizen_Number;
        Nüfus++;
    }

    public void Introduce() {
        System.out.println("Adım:" + Name + "\n" + "Soyadım:" + Surname + "\n" + "Yasım:" + Age + "\n" + "Kimlik Numaram:" + Citizen_Number);
    }

    public String toString() {

        //Return işlemi efektiflik ve hız açısından stringBuilder yada stringFormat ile yapılmalıdır.
        return "Merhaba ben "+Age+" yasındayım.Adım "+Name+Surname+" ve Kimlik Numaram " + Citizen_Number +"'dır.";

    }

    public void showInfo(){


    System.out.println("Merhaba ben "+Age+" yasındayım.Adım "+Name+Surname+" ve Kimlik Numaram " + Citizen_Number +"'dır.");

}

}
