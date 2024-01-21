package oopsconcepts;

public class DepartmentImpl extends Department{
    private int size;

    public DepartmentImpl(int size) {
        this.size = size;
    }

    @Override
    public int getDepartmenSize() {
        return size;
    }
}
