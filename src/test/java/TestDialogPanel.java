import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestDialogPanel {

    private static final String TITLE = "COMAQA Conference";
    private JDialog dialog;

    @BeforeClass
    public void beforeClass() {
        this.dialog = Main.getConferenceDialog();
    }

    @Test
    public void testDialogPanelTitle() {
        Assert.assertEquals(dialog.getTitle(), TITLE, "Dialog Panel Title does not match expected result.");
    }
}
