package HelpersClass;

public class Discipline {
    private String obsh;
    private String rus;
    private String ikt;
    private String bio;
    private String geo;
    private String him;
    private String fiz;
    private String lit;
    private String ist;
    private String mat;
    private String inyz;

    public Discipline(String obsh, String rus, String ikt,
                      String bio, String geo, String him,
                      String fiz, String lit, String ist,
                      String mat, String inyz) {
        this.obsh = obsh;
        this.rus = rus;
        this.ikt = ikt;
        this.bio = bio;
        this.geo = geo;
        this.him = him;
        this.fiz = fiz;
        this.lit = lit;
        this.ist = ist;
        this.mat = mat;
        this.inyz = inyz;
    }

    public String getObsh() {
        return obsh;
    }

    public String getRus() {
        return rus;
    }

    public String getIkt() {
        return ikt;
    }

    public String getBio() {
        return bio;
    }

    public String getGeo() {
        return geo;
    }

    public String getHim() {
        return him;
    }

    public String getFiz() {
        return fiz;
    }

    public String getLit() {
        return lit;
    }

    public String getIst() {
        return ist;
    }

    public String getMat() {
        return mat;
    }

    public String getInyz() {
        return inyz;
    }
}
