package ro.gsdata.arhidoc.web.proiectarhitectura;

import com.haulmont.cuba.core.app.DataService;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.gui.WindowParams;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.reports.entity.Report;
import com.haulmont.reports.gui.ReportGuiManager;
import ro.gsdata.arhidoc.entity.ProiectArhitectura;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProiectArhitecturaView extends AbstractEditor<ProiectArhitectura> {

    @Inject
    private Button printCerere;

    @Inject
    protected DataService dataService;

    protected ReportGuiManager reportGuiManager = AppBeans.get(ReportGuiManager.class);

    public void runReport() {

        Map<String,Object> reportParams = new HashMap<>();
        reportParams.put("entity", this.getItem());
       // reportParams.put("additionalParam", "123");

        LoadContext<Report> lContext = new LoadContext<>(Report.class);
        lContext.setQueryString("select r from report$Report r where r.name like '%Proiect%'");
        List<Report> reports = dataService.loadList(lContext);

        for (Report report : reports){
            reportGuiManager.printReport(report, reportParams);
        }
    }

    @Override
    public void init(Map<String, Object> params) {

        ProiectArhitectura item = (ProiectArhitectura) WindowParams.ITEM.getEntity(params);

     //   showNotification(item.getBeneficiarNume(), NotificationType.TRAY);
        setCaption(item.getBeneficiarNume());


        Action myaction = new BaseAction("test"){
           @Override
            public void actionPerform(Component component) {
                runReport();
            }

        };

        printCerere.setAction(myaction);

        super.init(params);
    }
}