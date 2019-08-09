package example;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Answer", propOrder = {
        "pid",
        "surname",
        "name"
})
public class Answer {
    @XmlElement(name = "PID", required = true)
    private Integer pid;

    @XmlElement(name = "SURNAME", required = true)
    private String surname;

    @XmlElement(name = "NAME", required = true)
    private String name;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
