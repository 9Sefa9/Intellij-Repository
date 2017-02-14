public class TestForGithub{

    public static void main(String[] args){
        TestForGithub tfg = new TestForGithub();
        System.out.println("is github working with intellij ? "+isWorking(true))
    }
    public boolean isWorking(boolean tf){
        if( tf == true)
            return true;

        return false;
    }

}