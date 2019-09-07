import javax.swing.*;

public class Main {

    private static final String MESSAGE = "Azureнные сервисы.\nAzure DevOps Cloud Services в помощь QA автоматизатору";
    private static final String TITLE = "COMAQA Conference";

    public static void main(String[] args) {
        JDialog dialog = getConferenceDialog();
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    private static JDialog getDialog(String windowPanelTitle, String message) {
        JOptionPane pane = new JOptionPane();
        pane.setMessage(message);
        return pane.createDialog(windowPanelTitle);
    }

    static JDialog getConferenceDialog() {
        return getDialog(TITLE, MESSAGE);
    }
}
