package budget;
import category.Category;
import util.BudgetDataBase;

/**
 * Created by dino on 08/11/14.
 */
public  class AddBudgetService implements BudgetServices {

    public Integer addBudget(BudgetDTO budgetDTO) {
        final Budget budget = buildBudget(budgetDTO);
        return BudgetDataBase.budgetDataBase.addBudget(budget);
    }

    private Budget buildBudget(BudgetDTO budgetDTO) {
        final Category category = BudgetDataBase.budgetDataBase.getCategory(budgetDTO.getCategoryId()); 
        return Budget.newBuilder()
                .withName(budgetDTO.getName())        		
        		.withBudgetAmount(budgetDTO.getAmount())
        		.withBeginDate(budgetDTO.getBeginDate())
        		.withEndDate(budgetDTO.getEndDate())
        		.withDueDate(budgetDTO.getDueDate())        		
                .withPaymentFrequency(budgetDTO.getPaymentFrequency())                
                .withCategory(category)
                .build();
    }
}