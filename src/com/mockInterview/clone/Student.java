package com.mockInterview.clone;

public class Student implements Cloneable{
    private String name;
    private String id;
    private String sex;
    private int age;
    private Address address;

    public Student(){

    }
    public Student(String name, String id, String sex, int age){
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Student cloned = (Student) super.clone();
        cloned.address = (Address) cloned.getAddress().clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public static void main(String[] ages){

        Student stu = new Student("stu" + 0, "00" + 0, "F", 21);
        stu.setAddress(new Address("US", "NY", "NY"));
        try{
            Student stu2 = (Student) stu.clone();

            stu.getAddress().setCity("DC");
            stu.getAddress().setState("DC");
            System.out.println(stu);
            System.out.println(stu2);
        }catch (CloneNotSupportedException e){
            System.out.print(e.toString());
        }


    }
}
