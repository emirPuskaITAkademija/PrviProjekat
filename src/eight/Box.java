package eight;
//T - generički tip uveden na nivou klase Box
// 1.4 1.5
public class Box<T> {
    private T field;



    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}
