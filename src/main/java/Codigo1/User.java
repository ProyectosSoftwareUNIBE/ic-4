package Codigo1;

public class User {
<<<<<<< HEAD
    private String name, familyname;
=======
    private String name, familyname, asdasd  ;
>>>>>>> develop

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
