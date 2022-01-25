package cn.roncantwritecode.designpattern.frontcontrollerpattern;

/**
 * @author Ron Wu
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if("STUDENT".equalsIgnoreCase(request)){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
