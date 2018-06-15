package buscafacil.com.br.buscafacil.presenter;


import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

import buscafacil.com.br.buscafacil.model.RO.AllDepartmentsResponse;
import buscafacil.com.br.buscafacil.model.RO.ChildrenResponse;
import buscafacil.com.br.buscafacil.model.RO.DepartmentRO;
import buscafacil.com.br.buscafacil.model.RO.DepartmentResponse;
import buscafacil.com.br.buscafacil.model.RO.MenuResponse;
import buscafacil.com.br.buscafacil.model.Service.RequestAPI;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class DepartmentPresenterLayer {

    private List<DepartmentPLObject> departmentsPLObject;
    private Observer<DepartmentRO> departmentROObserver;
    private Observable<List<DepartmentPLObject>> departmentListObservable;
    private Observer<List<DepartmentPLObject>> departmentListObserver;
    private RequestAPI requestAPI;


    public DepartmentPresenterLayer(Observer<List<DepartmentPLObject>> departmentListObserver){
        this.departmentListObserver = departmentListObserver;
    }

    public void callDepartments(){

        departmentROObserver = new Observer<DepartmentRO>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(DepartmentRO departmentRO) {
                buildObject(departmentRO);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
        requestAPI = new RequestAPI(departmentROObserver, null, null);
        requestAPI.requestGetCategories(Utils.getSpaceyApiDomain());
    }

    private void buildObject(DepartmentRO departmentRO){
        departmentsPLObject = new ArrayList<>();

        for(AllDepartmentsResponse allDepartmentsResponse : departmentRO.getMenuResponse().getComponentResponse().
                getChildrensResponse().get(1).getDepartmentsResponse().get(0).getAllDepartments()){
            DepartmentPLObject departmentPLObject = new DepartmentPLObject();
            departmentPLObject.setId(allDepartmentsResponse.getId());
            departmentPLObject.setTitle(allDepartmentsResponse.getTitle());
            departmentPLObject.setLink(allDepartmentsResponse.getLink());

            departmentsPLObject.add(departmentPLObject);
        }
        departmentListObservable = Observable.just(departmentsPLObject);
        departmentListObservable.subscribe(departmentListObserver);
    }

}
