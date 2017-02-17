package ro.gsdata.arhidoc.web.proiectarhitectura;

import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.components.actions.CreateAction;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Map;

public class ProiectArhitecturaBrowse extends AbstractLookup {



    @Inject
    private GroupTable proiectArhitecturasTable;

    @Named("proiectArhitecturasTable.create")
    private CreateAction proiectArhitecturaTableCreate;

    @Override
    public void init(Map<String, Object> params) {

        proiectArhitecturaTableCreate.setOpenType(WindowManager.OpenType.NEW_WINDOW);

        proiectArhitecturasTable.setItemClickAction(new BaseAction("Hello") {

            @Override
            public void actionPerform(Component component) {
              //  showNotification("Hello!", NotificationType.TRAY);

                openEditor("arhidoc$ProiectArhitectura.view",proiectArhitecturasTable.getSingleSelected(), WindowManager.OpenType.NEW_TAB);
            }

        });

        super.init(params);
    }
}