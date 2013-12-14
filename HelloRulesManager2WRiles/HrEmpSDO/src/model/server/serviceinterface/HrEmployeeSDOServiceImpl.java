package model.server.serviceinterface;

import java.lang.reflect.Method;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import javax.interceptor.Interceptors;

import model.common.EmployeesViewSDO;
import model.common.serviceinterface.HrEmployeeSDOService;

import oracle.jbo.common.Diagnostic;
import oracle.jbo.common.sdo.SDOHelper;
import oracle.jbo.common.service.types.FindControl;
import oracle.jbo.common.service.types.FindCriteria;
import oracle.jbo.common.service.types.ProcessControl;
import oracle.jbo.common.service.types.ProcessData;
import oracle.jbo.server.svc.ServiceContextInterceptor;
import oracle.jbo.server.svc.ServiceImpl;
import oracle.jbo.service.errors.ServiceException;

import oracle.webservices.annotations.PortableWebService;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Dec 13 17:03:18 EST 2013
// ---------------------------------------------------------------------
@Stateless(name="model.common.HrEmployeeSDOServiceBean", mappedName="HrEmployeeSDOServiceBean")
@Remote(HrEmployeeSDOService.class)
@PortableWebService(targetNamespace="/model/common/", serviceName="HrEmployeeSDOService",
    portName="HrEmployeeSDOServiceSoapHttpPort", endpointInterface="model.common.serviceinterface.HrEmployeeSDOService")
@Interceptors( { ServiceContextInterceptor.class })
public class HrEmployeeSDOServiceImpl extends ServiceImpl implements HrEmployeeSDOService {
    private static boolean _isInited = false;

    /**
     * This is the default constructor (do not remove).
     */
    public HrEmployeeSDOServiceImpl() {
        init();
        setApplicationModuleDefName("model.HrEmployeeSDO");
        setConfigurationName("HrEmployeeSDOService");
    }

    /**
     * Generated method. Do not modify. Do initialization in the constructor
     */
    protected void init() {
        if (_isInited) {
            return;
        }
        synchronized (HrEmployeeSDOServiceImpl.class) {
            if (_isInited) {
                return;
            }
            try {
                SDOHelper.INSTANCE.defineSchema("model/common/serviceinterface/", "HrEmployeeSDOService.xsd");
                _isInited = true;
            } catch (Exception ex) {
                Diagnostic.printStackTrace(ex);
            }
        }
    }

    /**
     * getEmployeesView1: generated method. Do not modify.
     */
    public EmployeesViewSDO getEmployeesView1(Integer employeeId) throws ServiceException {
        return (EmployeesViewSDO)get(new Object[] { employeeId },
                                     "EmployeesView1", EmployeesViewSDO.class);
    }

    /**
     * createEmployeesView1: generated method. Do not modify.
     */
    public EmployeesViewSDO createEmployeesView1(EmployeesViewSDO employeesView1) throws ServiceException {
        return (EmployeesViewSDO)create(employeesView1, "EmployeesView1");
    }

    /**
     * updateEmployeesView1: generated method. Do not modify.
     */
    public EmployeesViewSDO updateEmployeesView1(EmployeesViewSDO employeesView1) throws ServiceException {
        return (EmployeesViewSDO)update(employeesView1, "EmployeesView1");
    }

    /**
     * deleteEmployeesView1: generated method. Do not modify.
     */
    public void deleteEmployeesView1(EmployeesViewSDO employeesView1) throws ServiceException {
        delete(employeesView1, "EmployeesView1");
    }

    /**
     * mergeEmployeesView1: generated method. Do not modify.
     */
    public EmployeesViewSDO mergeEmployeesView1(EmployeesViewSDO employeesView1) throws ServiceException {
        return (EmployeesViewSDO)merge(employeesView1, "EmployeesView1");
    }

    /**
     * findEmployeesView1: generated method. Do not modify.
     */
    public List<EmployeesViewSDO> findEmployeesView1(FindCriteria findCriteria,
                                                     FindControl findControl) throws ServiceException {
        return (List<EmployeesViewSDO>)find(findCriteria, findControl,
                                            "EmployeesView1",
                                            EmployeesViewSDO.class);
    }

    /**
     * processEmployeesView1: generated method. Do not modify.
     */
    public List<EmployeesViewSDO> processEmployeesView1(String changeOperation,
                                                        List<EmployeesViewSDO> employeesView1,
                                                        ProcessControl processControl) throws ServiceException {
        return (List<EmployeesViewSDO>)process(changeOperation, processControl,
                                               employeesView1,
                                               "EmployeesView1");
    }

    /**
     * processCSEmployeesView1: generated method. Do not modify.
     */
    public ProcessData processCSEmployeesView1(ProcessData processData,
                                               ProcessControl processControl) throws ServiceException {
        return processChangeSummary(processData, processControl, "EmployeesView1");
    }
}
