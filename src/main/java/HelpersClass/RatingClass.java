package HelpersClass;

public class RatingClass {
    private String name;
    private String proc;
    private String money;

    public RatingClass(String name, String proc, String money) {
        this.name = name;
        this.proc = proc;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getProc() {
        return proc;
    }

    public String getMoney() {
        return money;
    }
}
