/**
 * Created with IntelliJ IDEA.
 * User: sk.saad
 * Date: 6/26/13
 * Time: 11:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteClassCreator {
    public static void main(String[] args) {

        /*Main Objective is to create or choose between class objects at run time.
        * Factory does that for you at run time*/

        ConcreteClassFactory factory = new ConcreteClassFactory() ;
        AbstractClass[] classList = { factory.makeConcreteClass("one","Dipto",1),
                                      factory.makeConcreteClass("two","Bibhash",2),
                                      factory.makeConcreteClass("three","Raqib",3)} ;
        for( AbstractClass classReference : classList )
            classReference.tellWhoAmI();
    }
}
