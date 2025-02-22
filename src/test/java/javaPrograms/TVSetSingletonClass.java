package javaPrograms;

public class TVSetSingletonClass {

    TVSetSingletonClass tvSetInstance=null;
    private TVSetSingletonClass() {
    }

    public TVSetSingletonClass getTvSetInstance() {
        if(tvSetInstance==null)
            tvSetInstance=new TVSetSingletonClass();
        return tvSetInstance;
    }
}







