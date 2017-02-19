package ro.gsdata.arhidoc.web.proiectarhitectura;

import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;

public class ExtAppMainWindow extends AppMainWindow {
    @Override
    public void ready() {
        // Wait for the super to be ready
        super.ready();

        // Then load the initial screen
        openWindow("arhidoc$PA.browse", WindowManager.OpenType.THIS_TAB);
    }
}