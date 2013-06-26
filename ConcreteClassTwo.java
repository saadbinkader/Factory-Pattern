/**
 * Created with IntelliJ IDEA.
 * User: sk.saad
 * Date: 6/26/13
 * Time: 11:45 AM
 * To change this template use File | Settings | File Templates.
 */

public class ConcreteClassTwo extends AbstractClass {

    public ConcreteClassTwo( String className, int classID) {
        super.setClassName(className);
        super.setClassID(classID);
    }

    @Override
    public void tellWhoAmI() {
        System.out.println("I'm concrete class TWO with name ["+this.getClassName()
                + "] and ID ["+this.getClassID()+"]" );
    }
}

