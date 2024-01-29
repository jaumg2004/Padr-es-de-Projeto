package GoF.singleton;

public class SingletonLazyHolder {

    private static class InsatnceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InsatnceHolder.instancia;
    }

}
