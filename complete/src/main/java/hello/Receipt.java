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

    private Date date;

    private int totalPrice;

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public String getNumber()
  {
    return number;
  }

  public void setNumber(String number)
  {
    this.number = number;
  }

  public Date getDate()
  {
    return date;
  }

  public void setDate(Date date)
  {
    this.date = date;
  }

  public long getTotalPrice()
  {
    return totalPrice;
  }

  public void setTotalPrice(long totalPrice)
  {
    this.totalPrice = totalPrice;
  }
}

