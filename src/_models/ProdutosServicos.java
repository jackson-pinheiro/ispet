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
 * ProdutosServicos generated by hbm2java
 */
@Entity
@Table(name = "produtos_servicos",
         catalog = "pet"
)
public class ProdutosServicos implements java.io.Serializable {

    private Integer codprod;
    private Unidades unidades;
    private float precops;
    private float precovend;
    private String nomeps;
    private float estoqueps;
    private String marcasprod;
    private String descps;
    private Set<RelatamItensCompras> relatamItensComprases = new HashSet<>(0);
    private Set<RelatamItensVendas> relatamItensVendases = new HashSet<>(0);

    public ProdutosServicos() {
    }

    public ProdutosServicos(Unidades unidades,float precovend, float precops, String nomeps, float estoqueps) {
        this.unidades = unidades;
        this.precops = precops;
        this.precovend = precovend;
        this.nomeps = nomeps;
        this.estoqueps = estoqueps;
    }

    public ProdutosServicos(Unidades unidades,float precovend ,float precops, String nomeps, float estoqueps, String marcasprod, String descps, Set relatamItensComprases, Set relatamItensVendases) {
        this.unidades = unidades;
        this.precops = precops;
        this.precovend = precovend;
        this.nomeps = nomeps;
        this.estoqueps = estoqueps;
        this.marcasprod = marcasprod;
        this.descps = descps;
        this.relatamItensComprases = relatamItensComprases;
        this.relatamItensVendases = relatamItensVendases;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "CODPROD", unique = true)
    public Integer getCodprod() {
        return this.codprod;
    }

    public void setCodprod(Integer codprod) {
        this.codprod = codprod;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODUNI")
    public Unidades getUnidades() {
        return this.unidades;
    }

    public void setUnidades(Unidades unidades) {
        this.unidades = unidades;
    }

 

    @Column(name = "PRECOPS", precision = 9, scale = 2)
    public float getPrecops() {
        return this.precops;
    }

    public void setPrecops(float precops) {
        this.precops = precops;
    }
    
    @Column(name = "PRECOVEND", precision = 9, scale = 2)
    public float getPrecoVend() {
        return this.precovend;
    }

    public void setPrecoVend(float precovend) {
        this.precovend = precovend;
    }

    @Column(name = "NOMEPS", nullable = false, length = 50)
    public String getNomeps() {
        return this.nomeps;
    }

    public void setNomeps(String nomeps) {
        this.nomeps = nomeps;
    }

    @Column(name = "ESTOQUEPS", precision = 9, scale = 1)
    public float getEstoqueps() {
        return this.estoqueps;
    }

    public void setEstoqueps(float estoqueps) {
        this.estoqueps = estoqueps;
    }

    @Column(name = "MARCASPROD")
    public String getMarcasprod() {
        return this.marcasprod;
    }

    public void setMarcasprod(String marcasprod) {
        this.marcasprod = marcasprod;
    }

    @Column(name = "DESCPS")
    public String getDescps() {
        return this.descps;
    }

    public void setDescps(String descps) {
        this.descps = descps;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "produtosServicos")
    public Set<RelatamItensCompras> getRelatamItensComprases() {
        return this.relatamItensComprases;
    }

    public void setRelatamItensComprases(Set relatamItensComprases) {
        this.relatamItensComprases = relatamItensComprases;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "produtosServicos")
    public Set<RelatamItensVendas> getRelatamItensVendases() {
        return this.relatamItensVendases;
    }

    public void setRelatamItensVendases(Set relatamItensVendases) {
        this.relatamItensVendases = relatamItensVendases;
    }

    @Override
    public String toString() {
        return nomeps;
    }

}
