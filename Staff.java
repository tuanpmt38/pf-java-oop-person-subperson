public class Staff extends Person {
    private String school;
    private double pay;
    public Staff(){}
    public Staff(String school, double pay ){
        this.pay=pay;
        this.school = school;
    }
    public Staff(String name, String adress, String school, double pay){
        super(name, adress);
        this.school=school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff Person {" +
                " name='" + getName() + '\'' +
                ", adress='" + getAdress() + '\'' +
                ", school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }
}
