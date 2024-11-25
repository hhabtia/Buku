/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulasi_uts;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Habtia Humaira
 */
@Entity
@Table(name = "bukuu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bukuu.findAll", query = "SELECT b FROM Bukuu b"),
    @NamedQuery(name = "Bukuu.findByIsbn", query = "SELECT b FROM Bukuu b WHERE b.isbn = :isbn"),
    @NamedQuery(name = "Bukuu.findByJudul", query = "SELECT b FROM Bukuu b WHERE b.judul = :judul"),
    @NamedQuery(name = "Bukuu.findByTahunTerbit", query = "SELECT b FROM Bukuu b WHERE b.tahunTerbit = :tahunTerbit"),
    @NamedQuery(name = "Bukuu.findByPenerbit", query = "SELECT b FROM Bukuu b WHERE b.penerbit = :penerbit")})
public class Bukuu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "judul")
    private String judul;
    @Column(name = "tahun_terbit")
    private String tahunTerbit;
    @Column(name = "penerbit")
    private String penerbit;

    public Bukuu() {
    }

    public Bukuu(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bukuu)) {
            return false;
        }
        Bukuu other = (Bukuu) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "simulasi_uts.Bukuu[ isbn=" + isbn + " ]";
    }
    
}
