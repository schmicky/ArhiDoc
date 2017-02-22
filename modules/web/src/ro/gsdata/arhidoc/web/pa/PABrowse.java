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
    Button printA01a;
    
    @Inject
    Button printA01b;

    @Inject
    Button printA01c;

    @Inject
    Button printA01d;

    @Inject
    Button printA01e;

    @Inject
    Button printA01f;

    @Inject
    Label labelProiect;




    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        printA01a.setAction(new BaseAction("ceva") {
            @Override
            public void actionPerform(Component component) {
                if(pAsTable.getSingleSelected() != null) {

                    openEditor("arhidoc$PA.a01a.edit", pAsTable.getSingleSelected(), WindowManager.OpenType.DIALOG);
                }
                else{
                    showMessageDialog("Alegeti proiect","Inainte de a putea emite documente trebuie sa alegeti un proiect din coloana din dreapta", MessageType.WARNING);
                }
            }
        });
        
        printA01b.setAction(new BaseAction("ceva1") {
            @Override
            public void actionPerform(Component component) {
                if(pAsTable.getSingleSelected() != null)
                openEditor("arhidoc$PA.a01b.edit", pAsTable.getSingleSelected(), WindowManager.OpenType.DIALOG);
                else{
                    showMessageDialog("Alegeti proiect","Inainte de a putea emite documente trebuie sa alegeti un proiect din coloana din dreapta", MessageType.WARNING);
                }
            }
        });

        printA01c.setAction(new BaseAction("ceva2") {
            @Override
            public void actionPerform(Component component) {
                if(pAsTable.getSingleSelected() != null)
                    openEditor("arhidoc$PA.a01c.edit", pAsTable.getSingleSelected(), WindowManager.OpenType.DIALOG);
                else{
                    showMessageDialog("Alegeti proiect","Inainte de a putea emite documente trebuie sa alegeti un proiect din coloana din dreapta", MessageType.WARNING);
                }
            }
        });

        printA01d.setAction(new BaseAction("ceva3") {
            @Override
            public void actionPerform(Component component) {
                if(pAsTable.getSingleSelected() != null)
                    openEditor("arhidoc$PA.a01d.edit", pAsTable.getSingleSelected(), WindowManager.OpenType.DIALOG);
                else{
                    showMessageDialog("Alegeti proiect","Inainte de a putea emite documente trebuie sa alegeti un proiect din coloana din dreapta", MessageType.WARNING);
                }
            }
        });

        printA01e.setAction(new BaseAction("ceva4") {
            @Override
            public void actionPerform(Component component) {
                if(pAsTable.getSingleSelected() != null)
                    openEditor("arhidoc$PA.a01e.edit", pAsTable.getSingleSelected(), WindowManager.OpenType.DIALOG);
                else{
                    showMessageDialog("Alegeti proiect","Inainte de a putea emite documente trebuie sa alegeti un proiect din coloana din dreapta", MessageType.WARNING);
                }
            }
        });

        printA01f.setAction(new BaseAction("ceva5") {
            @Override
            public void actionPerform(Component component) {
                if(pAsTable.getSingleSelected() != null)
                    openEditor("arhidoc$PA.a01f.edit", pAsTable.getSingleSelected(), WindowManager.OpenType.DIALOG);
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