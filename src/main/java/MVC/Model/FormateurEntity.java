package MVC.Model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "formateur", schema = "simplone")
public class FormateurEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_formateur", nullable = false)
    private int idFormateur;
    @Basic
    @Column(name = "nom", nullable = false, length = 255)
    private String nom;
    @Basic
    @Column(name = "prenom", nullable = false, length = 255)
    private String prenom;
    @Basic
    @Column(name = "username", nullable = false, length = 255)
    private String username;
    @Basic
    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @OneToMany(mappedBy = "formateur")
    private Collection<FormateurEntity> formateur;

    public Collection<FormateurEntity> getFormateur() {
        return formateur;
    }

    public void setFormateur(Collection<FormateurEntity> formateur) {
        this.formateur = formateur;
    }

    public int getIdFormateur() {
        return idFormateur;
    }

    public void setIdFormateur(int idFormateur) {
        this.idFormateur = idFormateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public FormateurEntity() {
    }

    public FormateurEntity(String nom, String prenom, String username, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.username = username;
        this.password = password;
    }

    public FormateurEntity(int idFormateur, String nom, String prenom, String username, String password) {
        this.idFormateur = idFormateur;
        this.nom = nom;
        this.prenom = prenom;
        this.username = username;
        this.password = password;
    }
}
