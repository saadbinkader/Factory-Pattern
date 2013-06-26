/**
 * Created with IntelliJ IDEA.
 * User: sk.saad
 * Date: 6/26/13
 * Time: 10:22 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractClass {
    private String className ;
    private int classID ;

    public void setClassName( String className ) {
         this.className = className ;
    }
    public String getClassName () {
        return className;
    }

    public void setClassID ( int classID ) {
        this.classID = classID ;
    }
    public int getClassID () {
        return classID ;
    }

    public abstract void tellWhoAmI() ;
}
