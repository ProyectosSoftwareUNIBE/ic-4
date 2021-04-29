package Codigo1;

public class User {
    private String name, familyname;

    public User(String name, String familyname) {
        this.name = name;
        this.familyname = familyname;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public String getNamemayus(){
        return this.name.toUpperCase();

    }

}
