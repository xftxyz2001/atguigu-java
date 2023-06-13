package banking5_1;
//´¢ĞîÕË»§
public class SavingAccount extends Account{
	private double interestRate;//ÀûÂÊ
	
	public SavingAccount(double balance,double init_rate){
		super(balance);
		this.interestRate = init_rate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}
