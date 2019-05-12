package Tests;

//import org.apache.openjpa.persistence.Persistent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "Hund")

public class Hund implements Serializable{

    private static final long serialVersionUID = 701L;
    private String test="Hund";
    public Hund(){

    }

    @Column(name = "test")
    public String getTest(){
        return this.test;
    }

    public void setTest(String test){
        this.test = test;
    }

    @Override
    public String toString() {
        return this.test;
    }
}
