/**
 * Created with IntelliJ IDEA.
 * User: sk.saad
 * Date: 6/26/13
 * Time: 11:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteClassFactory {

    public AbstractClass makeConcreteClass ( String classType, String className, int classID ) {
        if ( classType.equals("one") )
            return new ConcreteClassOne(className,classID) ;
        else if ( classType.equals("two") )
            return new ConcreteClassTwo(className,classID) ;
        else if ( classType.equals("three") )
            return new ConcreteClassThree(className, classID) ;
        else
            return null ;
    }
}
