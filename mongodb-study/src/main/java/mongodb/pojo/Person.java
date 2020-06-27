package mongodb.pojo;

import org.bson.types.ObjectId;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/18 16:09
 * @name Person
 */
public final class Person {
    private ObjectId id;
    private String name;
    private int age;
    private Address address;

    public Person( String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
