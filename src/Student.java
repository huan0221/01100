public class Student extends User{

    private String  zhuanye;
    private String password;
    public Student(String zhuanye,String password){
        this.zhuanye=zhuanye;
        this.password=password;
    }
    public String getZhuanye() {
        return zhuanye;
    }

    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "zhuanye='" + zhuanye + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}



