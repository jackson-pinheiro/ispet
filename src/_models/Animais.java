package _models;
// Generated 12/05/2018 23:53:27 by Hibernate Tools 4.3.1



import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Animais generated by hbm2java
 */
@Entity
@Table(name="animais"
    ,catalog="pet"
)
public class Animais  implements java.io.Serializable {


     private Integer codani;
     private Clientes clientes;
     private Cores cores;
     private Racas racas;
     private String nomeani;
     private String apelidoani;
     private float pesoani;
     private Date datanasciani;
     private String descani;
     private String sexoani;
     private Set<RelatamItensVendas> relatamItensVendases = new HashSet <>(0);

    public Animais() {
    }

	
    public Animais(Clientes clientes, Cores cores, Racas racas, String nomeani, float pesoani) {
        this.clientes = clientes;
        this.cores = cores;
        this.racas = racas;
        this.nomeani = nomeani;
        this.pesoani = pesoani;
    }
    public Animais(Clientes clientes, Cores cores, Racas racas, String nomeani, String apelidoani, float pesoani, Date datanasciani, String descani, String sexoani, Set relatamItensVendases) {
       this.clientes = clientes;
       this.cores = cores;
       this.racas = racas;
       this.nomeani = nomeani;
       this.apelidoani = apelidoani;
       this.pesoani = pesoani;
       this.datanasciani = datanasciani;
       this.descani = descani;
       this.sexoani = sexoani;
       this.relatamItensVendases = relatamItensVendases;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="CODANI", unique=true, nullable=false)
    public Integer getCodani() {
        return this.codani;
    }
    
    public void setCodani(Integer codani) {
        this.codani = codani;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CODCLI", nullable=true)
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CODCOR", nullable=true)
    public Cores getCores() {
        return this.cores;
    }
    
    public void setCores(Cores cores) {
        this.cores = cores;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CODRACA", nullable=true)
    public Racas getRacas() {
        return this.racas;
    }
    
    public void setRacas(Racas racas) {
        this.racas = racas;
    }

    
    @Column(name="NOMEANI", nullable=false, length=50)
    public String getNomeani() {
        return this.nomeani;
    }
    
    public void setNomeani(String nomeani) {
        this.nomeani = nomeani;
    }

    
    @Column(name="APELIDOANI", length=50)
    public String getApelidoani() {
        return this.apelidoani;
    }
    
    public void setApelidoani(String apelidoani) {
        this.apelidoani = apelidoani;
    }

    
    @Column(name="PESOANI", nullable=false, precision=9)
    public float getPesoani() {
        return this.pesoani;
    }
    
    public void setPesoani(float pesoani) {
        this.pesoani = pesoani;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATANASCIANI", length=10)
    public Date getDatanasciani() {
        return this.datanasciani;
    }
    
    public void setDatanasciani(Date datanasciani) {
        this.datanasciani = datanasciani;
    }

    
    @Column(name="DESCANI")
    public String getDescani() {
        return this.descani;
    }
    
    public void setDescani(String descani) {
        this.descani = descani;
    }

    
    @Column(name="SEXOANI", length=6)
    public String getSexoani() {
        return this.sexoani;
    }
    
    public void setSexoani(String sexoani) {
        this.sexoani = sexoani;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="animais")
    public Set<RelatamItensVendas> getVendases() {
        return this.relatamItensVendases;
    }
    
    public void setVendases(Set relatamItensVendases) {
        this.relatamItensVendases = relatamItensVendases;
    }

 @Override
    public String toString() {
        return nomeani;
       
    }



}


