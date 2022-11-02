package MVC.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "classroom", schema = "simplone", catalog = "")
public class ClassroomEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_classroom", nullable = false)
    private int idClassroom;
    @Basic
    @Column(name = "nom_classroom", nullable = false, length = 255)
    private String nomClassroom;
    @Basic
    @Column(name = "id_promo", nullable = false)
    private int idPromo;
    @Basic
    @Column(name = "id_formateur", nullable = false)
    private int idFormateur;
    @Basic
    @Column(name = "id_apprenante", nullable = false)
    private int idApprenante;

    public int getIdClassroom() {
        return idClassroom;
    }

    public void setIdClassroom(int idClassroom) {
        this.idClassroom = idClassroom;
    }

    public String getNomClassroom() {
        return nomClassroom;
    }

    public void setNomClassroom(String nomClassroom) {
        this.nomClassroom = nomClassroom;
    }

    public int getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(int idPromo) {
        this.idPromo = idPromo;
    }

    public int getIdFormateur() {
        return idFormateur;
    }

    public void setIdFormateur(int idFormateur) {
        this.idFormateur = idFormateur;
    }

    public int getIdApprenante() {
        return idApprenante;
    }

    public void setIdApprenante(int idApprenante) {
        this.idApprenante = idApprenante;
    }
}
