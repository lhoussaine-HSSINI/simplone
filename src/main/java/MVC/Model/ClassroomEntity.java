package MVC.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "classroom", schema = "simplone")
public class ClassroomEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_classroom", nullable = false)
    private int idClassroom;
    @Basic
    @Column(name = "nom_classroom", nullable = false, length = 255)
    private String nomClassroom;
//    @Basic
//    @Column(name = "id_promo", nullable = false)
//    private int idPromo;
//    @Basic
//    @Column(name = "id_formateur", nullable = false)
//    private int idFormateur;
//    @Basic
//    @Column(name = "id_apprenante", nullable = false)
//    private int idApprenante;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_promo", nullable = false)
    private PromotionEntity promotion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_apprenante", nullable = false)
    private ApprenanteEntity apprenante;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_formateur", nullable = false)
    private FormateurEntity formateur;
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

    public PromotionEntity getPromotion() {
        return promotion;
    }

    public void setPromotion(PromotionEntity promotion) {
        this.promotion = promotion;
    }

    public ApprenanteEntity getApprenante() {
        return apprenante;
    }

    public void setApprenante(ApprenanteEntity apprenante) {
        this.apprenante = apprenante;
    }

    public FormateurEntity getFormateur() {
        return formateur;
    }

    public void setFormateur(FormateurEntity formateur) {
        this.formateur = formateur;
    }

    public ClassroomEntity() {
    }

    public ClassroomEntity(String nomClassroom, PromotionEntity promotion, ApprenanteEntity apprenante, FormateurEntity formateur) {
        this.nomClassroom = nomClassroom;
        this.promotion = promotion;
        this.apprenante = apprenante;
        this.formateur = formateur;
    }

    public ClassroomEntity(int idClassroom, String nomClassroom, PromotionEntity promotion, ApprenanteEntity apprenante, FormateurEntity formateur) {
        this.idClassroom = idClassroom;
        this.nomClassroom = nomClassroom;
        this.promotion = promotion;
        this.apprenante = apprenante;
        this.formateur = formateur;
    }
}
