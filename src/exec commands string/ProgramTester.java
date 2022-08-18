import org.junit.jupiter.api.Test;

public class ProgramTester {
    Program p;
    void init(){
    p=new Program();
    }

    @Test
    void testCountWords(){
        p=new Program();

        String[] commands = {"CountWords", "ls", "mkdir", "cd", "rmdir"};

        for(int i=0; i< commands.length; i++){

            try{String r=p.exec(commands[i],"yes we can");
            assert (r.equals("3"));
            System.out.println("the text containg "+r+" words ");
            System.out.println("counting words with the command "+commands[i]);
            }
            catch(IllegalArgumentException e){
             System.out.println("can't count words with the command "+commands[i]);
            }

        }


    }
}
