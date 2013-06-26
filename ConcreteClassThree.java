/**
 * Created with IntelliJ IDEA.
 * User: sk.saad
 * Date: 6/26/13
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteClassThree extends AbstractClass {

    public ConcreteClassThree( String className, int classID) {
        super.setClassName(className);
        super.setClassID(classID);
    }

    @Override
    public void tellWhoAmI() {
        System.out.println("I'm concrete class THREE with name ["+this.getClassName()
                + "] and ID ["+this.getClassID()+"]" );
    }
}

