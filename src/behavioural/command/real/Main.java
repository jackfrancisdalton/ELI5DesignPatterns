package behavioural.command.real;

/**
 * Created by jackfrancisdalton on 07/04/17.
 */
public class Main {

    public static void main(String[] args) {

        //Instantiate entities
        Entity entityA = new Entity("ABC");
        Entity entityB = new Entity("XYZ");

        //Instantiate commands, wrapping entities inside of commands
        QueryCommand q1 = new MongoDBCreateQuery(entityA);
        QueryCommand q2 = new SQLCreateQuery(entityB);

        //Instantiate invoker
        QueryRunner queryRunner = new QueryRunner();
        queryRunner.addQuery(q1);
        queryRunner.addQuery(q2);

        //Execute commands
        queryRunner.runAllQueries();
    }
}
