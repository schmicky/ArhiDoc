package ro.gsdata.arhidoc.web.pa;

import com.haulmont.cuba.core.app.DataService;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.actions.BaseAction;
import com.haulmont.cuba.gui.data.DsContext;
import com.haulmont.reports.entity.Report;
import com.haulmont.reports.gui.ReportGuiManager;
import ro.gsdata.arhidoc.entity.PA;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaA01fEdit extends AbstractEditor<PA> {

    @Inject
    DsContext dsContext;


    @Inject
    Button printButton;



    @Inject
    Button cancelButton;

    @Inject
    protected DataService dataService;

    protected ReportGuiManager reportGuiManager = AppBeans.get(ReportGuiManager.class);

    public void runReport() {

        Map<String,Object> reportParams = new HashMap<>();
        reportParams.put("entity", this.getItem());
        // reportParams.put("additionalParam", "123");

        LoadContext<Report> lContext = new LoadContext<>(Report.class);
        lContext.setQueryString("select r from report$Report r where r.name like '%A01F%'");
        List<Report> reports = dataService.loadList(lContext);

        for (Report report : reports){
            reportGuiManager.printReport(report, reportParams);
        }
    }

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        printButton.setAction(new BaseAction("print") {
            @Override
            public void actionPerform(Component component) {
                dsContext.commit();
                runReport();
               close("arhidoc$PA.a01c.edit");


            }
        });

//        cancelButton.setAction(new BaseAction("cancel") {
//            @Override
//            public void actionPerform(Component component) {
//                close("arhidoc$PA.a01c.edit");
//
//
//            }
//        });

        cancelButton.setAction(new BaseAction("cancel") {
            @Override
            public void actionPerform(Component component) {

                ArhidocUtil.OpenLink("www.arhidoc.ro/manual/constanta");


            }
        });

    }
}