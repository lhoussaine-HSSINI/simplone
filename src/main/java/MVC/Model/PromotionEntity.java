package MVC.Model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "promotion", schema = "simplone")
public class PromotionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_promo", nullable = false)
    private int idPromo;
    @Basic
    @Column(name = "year", nullable = false, length = -1)
    private String year;

    @OneToMany(mappedBy = "promotion")
    private Collection<PromotionEntity> promotion;

    public Collection<PromotionEntity> getPromotion() {
        return promotion;
    }

    public void setPromotion(Collection<PromotionEntity> promotion) {
        this.promotion = promotion;
    }

    public int getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(int idPromo) {
        this.idPromo = idPromo;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public PromotionEntity() {
    }

    public PromotionEntity(int idPromo, String year) {
        this.idPromo = idPromo;
        this.year = year;
    }

    public PromotionEntity(String year) {
        this.year = year;
    }
}
