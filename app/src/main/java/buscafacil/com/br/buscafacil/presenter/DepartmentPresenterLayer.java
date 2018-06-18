package buscafacil.com.br.buscafacil.presenter;


import java.util.ArrayList;
import java.util.List;

import buscafacil.com.br.buscafacil.model.ro.departamentsRO.Category;
import buscafacil.com.br.buscafacil.model.ro.departamentsRO.DepartmentRO;
import buscafacil.com.br.buscafacil.model.ro.departamentsRO.Subcategory;
import buscafacil.com.br.buscafacil.model.service.RequestAPI;
import buscafacil.com.br.buscafacil.presenter.po.departmentsPO.DepartmentPLObject;
import buscafacil.com.br.buscafacil.presenter.po.departmentsPO.SubcategoryPLObject;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class DepartmentPresenterLayer {

    private List<DepartmentPLObject> departmentsPLObject;
    protected Observer<DepartmentRO> departmentROObserver;
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
        requestAPI.requestGetAllDepartments(Utils.getMystiqueDomain());
    }

    private void buildObject(DepartmentRO departmentRO){
        departmentsPLObject = new ArrayList<>();

        for(Category category : departmentRO.getAggregations().get(0).getCategories()){
            DepartmentPLObject departmentPLObject = new DepartmentPLObject();
            departmentPLObject.setTitle(category.getTitle());
            if (!category.getSubcategories().isEmpty()){
                List<SubcategoryPLObject> subcategoryPLObjectList = new ArrayList<>();
                for(Subcategory sc : category.getSubcategories()){
                    SubcategoryPLObject subcategoryPLObject = new SubcategoryPLObject();
                    subcategoryPLObject.setTitle(sc.getTitle());
                    subcategoryPLObject.setSearchLink(sc.getSearchValueLink().getSelf().getHref());
                    subcategoryPLObjectList.add(subcategoryPLObject);
                }
                departmentPLObject.setSubcategoryPLObjectList(subcategoryPLObjectList);
            }
            departmentsPLObject.add(departmentPLObject);
        }
        departmentListObservable = Observable.just(departmentsPLObject);
        departmentListObservable.subscribe(departmentListObserver);
    }

}
