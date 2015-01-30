package budgetModel;
import static org.junit.Assert.assertEquals;
import gateway.BudgetDataBase;

import org.junit.Before;
import org.junit.Test;

import category.CategoryServiceImpl;
import category.Category;
import category.CategoryDTO;
import category.CategoryServices;

/**
 * Created by dino on 11/11/14.
 */
public class AddCategoryServiceTest {
    private CategoryServices categoryService;
    private CategoryDTO categoryDTO;

    private static String CategoryName;

    @Before
    public void setUp() throws Exception {
        categoryService = new CategoryServiceImpl();
    }
    @Test (expected = Exception.class) 
    public void testDubbleNameCategory() {
    	CategoryName= "name";
        Integer id = addCategory();
        Integer id2 = addCategory();
    }

    @Test
    public void testCategoryBuilderAndFactory() {
    	CategoryName = "cat name";
        Integer id = addCategory();

        Category category = loadCategory(id);

        validateCategory(category);
    }  
    
    private Integer  addCategory() {
        categoryDTO = buildCategoryDTO();
        return categoryService.addCategory(categoryDTO);
    }
    private void validateCategory(Category category) {
        assertEquals(CategoryName, category.getName());
    }

    private Category loadCategory(Integer id) {
        return BudgetDataBase.getDB().getCategory(id);
    }


    private CategoryDTO buildCategoryDTO() {
        return CategoryDTO.newBuilder()
                .withCategoryName(CategoryName)
                .build();
    }

}
