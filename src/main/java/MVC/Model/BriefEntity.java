package MVC.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "brief", schema = "simplone", catalog = "")
public class BriefEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_brief", nullable = false)
    private int idBrief;
    @Basic
    @Column(name = "title_brief", nullable = false, length = 255)
    private String titleBrief;
    @Basic
    @Column(name = "description_brief", nullable = false, length = -1)
    private String descriptionBrief;
    @Basic
    @Column(name = "deadline_brief", nullable = false)
    private int deadlineBrief;
    @Basic
    @Column(name = "id_classroom", nullable = false)
    private int idClassroom;
    @Basic
    @Column(name = "id_formateur", nullable = false)
    private int idFormateur;

    public int getIdBrief() {
        return idBrief;
    }

    public void setIdBrief(int idBrief) {
        this.idBrief = idBrief;
    }

    public String getTitleBrief() {
        return titleBrief;
    }

    public void setTitleBrief(String titleBrief) {
        this.titleBrief = titleBrief;
    }

    public String getDescriptionBrief() {
        return descriptionBrief;
    }

    public void setDescriptionBrief(String descriptionBrief) {
        this.descriptionBrief = descriptionBrief;
    }

    public int getDeadlineBrief() {
        return deadlineBrief;
    }

    public void setDeadlineBrief(int deadlineBrief) {
        this.deadlineBrief = deadlineBrief;
    }

    public int getIdClassroom() {
        return idClassroom;
    }

    public void setIdClassroom(int idClassroom) {
        this.idClassroom = idClassroom;
    }

    public int getIdFormateur() {
        return idFormateur;
    }

    public void setIdFormateur(int idFormateur) {
        this.idFormateur = idFormateur;
    }
}
