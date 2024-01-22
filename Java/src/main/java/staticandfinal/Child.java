package staticandfinal;

public class Child extends Parent {
    String childVar;

    public Child(String parentVar, String childVar) {
        this.parentVar = parentVar;
        this.childVar = childVar;
    }

    public Child(String childVar) {
        this.childVar = childVar;
    }

}