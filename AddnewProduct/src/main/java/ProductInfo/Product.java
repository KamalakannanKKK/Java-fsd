package ProductInfo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eproduct")
public class Product {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	@Column(length=20)
	private String name;
	@Column(length=50)
	private String features;

	@Column
	private int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFeature() {
		return name;
	}
	public void setFeature(String features) {
		this.features = features;
	}
	

}

