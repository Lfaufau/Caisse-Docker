package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Receipt{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private long number;

    private String promo;

    private float totalPrice;

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public long getNumber()
  {
    return number;
  }

  public void setNumber(long number)
  {
    this.number = number;
  }

  public String getPromo()
  {
    return promo;
  }

  public void setPromo(String promo)
  {
    this.promo = promo;
  }

  public float getTotalPrice()
  {
    return totalPrice;
  }

  public void setTotalPrice(float totalPrice)
  {
    this.totalPrice = totalPrice;
  }
}

