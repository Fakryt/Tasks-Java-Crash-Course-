public class Person {
    private String name;
    private int birthYear;

    public Person(){
        this.name = null;
        this.birthYear = 0;
    }

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName(){
        return name;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public static void calculate_Age(int birthYear){
        birthYear = 2022 - birthYear;
    }

    
}
