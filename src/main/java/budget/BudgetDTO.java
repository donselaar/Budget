package budget;

import org.joda.time.DateTime;

/**
 * Created by dino on 07/11/14.
 */
public class BudgetDTO {
    private String name;
    private double amount;
    private DateTime beginDate;
    private DateTime endDate;    
    private DateTime dueDate;   
    private int numberOfMonthsBetweenDueDates;    
    private Integer categoryId;  
    private boolean incomeCashFlow;

	private BudgetDTO(Builder builder) {
        this.name = builder.name;
        this.amount = builder.amount;
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.dueDate = builder.dueDate;
        this.numberOfMonthsBetweenDueDates = builder.numberOfMonthsBetweenDueDates;         
        this.categoryId = builder.categoryId;
        this.incomeCashFlow = builder.incomeCashFlow; 
    }

    public static Builder newBuilder() {
        return new Builder();
    }
    public String getName() {
        return name;
    }
    public double getAmount() {
        return amount;
    }
    public DateTime getBeginDate() {
		return beginDate;
	}
    public DateTime getEndDate() {
		return endDate;
	}
    public DateTime getDueDate() {
		return dueDate;
	}    
    public int getNumberOfMonthsBetweenDueDates() {
		return numberOfMonthsBetweenDueDates;
	}      
    public Integer getCategoryId() {
        return categoryId;
    }
    public boolean isIncomeCashFlow() {
		return incomeCashFlow;
	}
    
    public static final class Builder {
        private String name;
        private double amount;
        private DateTime beginDate;
        private DateTime endDate;    
        private DateTime dueDate;   
        private int numberOfMonthsBetweenDueDates;         
        private Integer categoryId;
        private boolean incomeCashFlow;
        
        private Builder() {
        }
        public Builder withName(String name) {
            this.name = name;
            return this;
        }
        public Builder withAmount(double amount) {
            this.amount = amount;
            return this;
        }
        public Builder withBeginDate(DateTime begindate2) {
            this.beginDate = begindate2;
            return this;
        }
        public Builder withEndDate(DateTime endDate) {
            this.endDate = endDate;
            return this;
        }       
        public Builder withDueDate(DateTime dueDate) {
            this.dueDate = dueDate;
            return this;
        }       
        public Builder withNumberOfMonthsBetweenDueDates(int NumberOfMonthsBetweenDueDates) {
            this.numberOfMonthsBetweenDueDates = NumberOfMonthsBetweenDueDates;
            return this;
        }        
        public Builder withCategory(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        } 
        public Builder withIncomeCashFlow(boolean incomeCashFlow) {
            this.incomeCashFlow = incomeCashFlow;
            return this;
        }        
        public BudgetDTO build() {
            return new BudgetDTO(this);
        }
    }
}
