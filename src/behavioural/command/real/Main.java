package behavioural.command.real;

/**
 * Created by jackfrancisdalton on 07/04/17.
 */
public class Main {

    public static void main(String[] args) {
        QueryCommand q1 = new MongoDBCreateQuery(new Entity("ABCD"));
        QueryCommand q2 = new SQLCreateQuery(new Entity("XYZ"));
        QueryRunner queryRunner = new QueryRunner();
        
        queryRunner.addQuery(q1);
        queryRunner.addQuery(q2);
        queryRunner.runQuerys();
    }
}
