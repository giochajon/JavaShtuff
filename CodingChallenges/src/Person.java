public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ((age < 0 )||(age > 100 )) {this.age = 0; } else {
            this.age = age;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public boolean isTeen(){
        if(( this.age > 12) && (this.age <20)) {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getFullName(){
        if ((this.firstName.length() == 0 )&&(this.lastName.length() == 0 )) {return "";}
        else
        if ((this.firstName.length() == 0 )&&(this.lastName.length() > 0 )) {return lastName;}
        else
        if ((this.firstName.length() > 0 )&&(this.lastName.length() == 0 )) {return firstName;}
        else
        {return this.firstName + " " + this.lastName;}
    }
}
