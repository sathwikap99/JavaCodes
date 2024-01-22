package staticandfinal;

public class Main {
    public static void main(String[] args) {
        ExStatic exStatic = new ExStatic();
        exStatic.var = 18;

        System.out.println(exStatic.var);
        System.out.println(ExStatic.meth());

        ExFinal exFinal = new ExFinal();

        System.out.println(exFinal.NAME);
        System.out.println(exFinal.getName());

        Child child = new Child("Sathwika");
        System.out.println(child.childVar);

        Child child2 = new Child("Sathwika", "wika");
        System.out.println(child2.childVar + "=" + child2.parentVar);

    }
}

