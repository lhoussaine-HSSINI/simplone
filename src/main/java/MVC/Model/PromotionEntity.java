package MVC.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "promotion", schema = "simplone", catalog = "")
public class PromotionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_promo", nullable = false)
    private int idPromo;
    @Basic
    @Column(name = "year", nullable = false, length = -1)
    private String year;

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
}
