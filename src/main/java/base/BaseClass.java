package base;

import org.openqa.selenium.support.PageFactory;

public class BaseClass {


    public <Page extends BasePage> Page getInstance(Class<Page> page) {

        Object obj = PageFactory.initElements(BaseDriver.driver, page);

        return page.cast(obj);
    }

    public <Page extends BasePage> Page As(Class<Page> pageInstance) {
        try {
            return (Page) this;
        } catch (Exception e) {
            e.getStackTrace();
        }

        return null;
    }

}
