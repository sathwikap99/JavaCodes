package loopsconditions;

public class AgeCalculator {
    public void printCategory(int age)
    {
        if(age >= 13 && age <= 19)
            System.out.println("teen");
        else

        if (age < 13)
            System.out.println("Kid");
        else

        if(age > 19)
            System.out.println("Adult");
    }
}

