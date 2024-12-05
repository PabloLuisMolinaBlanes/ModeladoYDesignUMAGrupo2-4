public class RentalOffice {

	private String address;
	private int feeForDelivery;

	public RentalOffice(String address, int feeForDelivery) {
		this.address = address;
		this.feeForDelivery = feeForDelivery;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getFeeForDelivery() {
		return this.feeForDelivery;
	}

	public void setFeeForDelivery(int feeForDelivery) {
		this.feeForDelivery = feeForDelivery;
	}

}