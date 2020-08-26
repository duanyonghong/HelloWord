package model;

/**
 * @author dyh
 * @date 2020.08.24 下午 5:08
 */
public class User {
    private Long id;    //id
    private String name;    //姓名
    private Integer age; //年龄

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
