class SingletonPatternTest{

    private static volatile SingletonPatternTest singletonPatternTest;

    private SingletonPatternTest(){}

    public static SingletonPatternTest getIntaceSingletonPatternTest(){

        if(singletonPatternTest == null ){

            return new SingletonPatternTest();
        }

        return singletonPatternTest;
    }

}

public class SingletonPattern{

    public static void main (String[] args){

        System.out.println("This is pattern");

        System.out.println("");
        


    }
}



