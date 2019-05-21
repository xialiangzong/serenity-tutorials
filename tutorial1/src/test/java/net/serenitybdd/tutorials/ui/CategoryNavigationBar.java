package net.serenitybdd.tutorials.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.tutorials.features.model.Category;
import org.openqa.selenium.By;

public class CategoryNavigationBar extends PageObject {
    public void selectCategory(Category category) {
        $("*[id=navitems] *[id=navitems-group1] *[class=fore1]").find(By.linkText(category.name())).click();
    }
}
