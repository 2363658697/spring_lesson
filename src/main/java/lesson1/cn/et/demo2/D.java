package lesson1.cn.et.demo2;

public class D {
    private C c;

    private String id;
    private String name;
    public D(C c, String id, String name) {
        super();
        this.c = c;
        this.id = id;
        this.name = name;
    }
    public C getC() {
        return c;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
  
}
