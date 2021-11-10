package services;

public class BrazilInterestService implements InterestService{
	
	private Double interestRate;

	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterstRate() {
		return interestRate;
	}

}
