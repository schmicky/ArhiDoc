package ro.gsdata.arhidoc.web.pa;

import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import ro.gsdata.arhidoc.entity.PA;

import javax.inject.Inject;
import java.util.Map;

public class PABrowse extends AbstractLookup {

    @Inject
    GroupTable pAsTable;

    @Inject
    Button printA01;

    @Inject
    Label labelProiect;




    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        printA01.setAction(new BaseAction("ceva") {
            @Override
            public void actionPerform(Component component) {
                if(pAsTable.getSingleSelected() != null)
                openEditor("arhidoc$PA.a01.edit", pAsTable.getSingleSelected(), WindowManager.OpenType.DIALOG);
                else{
                    showMessageDialog("Alegeti proiect","Inainte de a putea emite documente trebuie sa alegeti un proiect din coloana din dreapta", MessageType.WARNING);
                }
            }
        });

//        labelProiect.addValueChangeListener(event -> {
//            if (Boolean.TRUE.equals(event.getValue())) {
//                showNotification("set", NotificationType.HUMANIZED);
//            } else {
//                showNotification("not set", NotificationType.HUMANIZED);
//            }
//        });

        pAsTable.setItemClickAction(new BaseAction("choose client") {
            @Override
            public void actionPerform(Component component) {
                labelProiect.setValue(((PA)pAsTable.getSingleSelected()).getA01DenumireProiect());
            }
        });

    }

}