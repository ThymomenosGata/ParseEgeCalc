package HelpersClass;

public class Discipline {
    private Boolean obsh;
    private Boolean rus;
    private Boolean ikt;
    private Boolean bio;
    private Boolean geo;
    private Boolean him;
    private Boolean fiz;
    private Boolean lit;
    private Boolean ist;
    private Boolean mat;
    private Boolean inyz;

    public Discipline() {
        this.obsh = false;
        this.rus = false;
        this.ikt = false;
        this.bio = false;
        this.geo = false;
        this.him = false;
        this.fiz = false;
        this.lit = false;
        this.ist = false;
        this.mat = false;
        this.inyz = false;
    }

    public void setObsh(Boolean obsh) {
        this.obsh = obsh;
    }

    public void setRus(Boolean rus) {
        this.rus = rus;
    }

    public void setIkt(Boolean ikt) {
        this.ikt = ikt;
    }

    public void setBio(Boolean bio) {
        this.bio = bio;
    }

    public void setGeo(Boolean geo) {
        this.geo = geo;
    }

    public void setHim(Boolean him) {
        this.him = him;
    }

    public void setFiz(Boolean fiz) {
        this.fiz = fiz;
    }

    public void setLit(Boolean lit) {
        this.lit = lit;
    }

    public void setIst(Boolean ist) {
        this.ist = ist;
    }

    public void setMat(Boolean mat) {
        this.mat = mat;
    }

    public void setInyz(Boolean inyz) {
        this.inyz = inyz;
    }

    public Boolean getObsh() {
        return obsh;
    }

    public Boolean getRus() {
        return rus;
    }

    public Boolean getIkt() {
        return ikt;
    }

    public Boolean getBio() {
        return bio;
    }

    public Boolean getGeo() {
        return geo;
    }

    public Boolean getHim() {
        return him;
    }

    public Boolean getFiz() {
        return fiz;
    }

    public Boolean getLit() {
        return lit;
    }

    public Boolean getIst() {
        return ist;
    }

    public Boolean getMat() {
        return mat;
    }

    public Boolean getInyz() {
        return inyz;
    }
}
