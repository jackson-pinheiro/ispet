package _models;
// Generated 12/05/2018 23:53:27 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Racas generated by hbm2java
 */
@Entity
@Table(name="racas"
    ,catalog="pet"
)
public class Racas  implements java.io.Serializable {


     private Integer codraca;
     private Especies especies;
     private String nomeraca;
     private Set<Animais> animaises = new HashSet<>(0);


    public Racas() {
    }

    public Racas(Especies especies, String nomeraca) {
       this.especies = especies;
       this.nomeraca = nomeraca;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="CODRACA", unique=true, nullable=false)
    public Integer getCodraca() {
        return this.codraca;
    }
    
    public void setCodraca(Integer codraca) {
        this.codraca = codraca;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CODESP", nullable=false)
    public Especies getEspecies() {
        return this.especies;
    }
    
    public void setEspecies(Especies especies) {
        this.especies = especies;
    }

    
    @Column(name="NOMERACA", nullable=false, length=20)
    public String getNomeraca() {
        return this.nomeraca;
    }
    
    public void setNomeraca(String nomeraca) {
        this.nomeraca = nomeraca;
    }

     @Override
    public String toString() {
        return nomeraca;
    }
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="racas")
    public Set<Animais> getAnimaises() {
        return this.animaises;
    }
    
    public void setAnimaises(Set animaises) {
        this.animaises = animaises;
    }



}


