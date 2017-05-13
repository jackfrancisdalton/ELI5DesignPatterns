package behavioural.command.real;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker
 */
public class QueryRunner {
    List<QueryCommand> queries = new ArrayList<>();

    public QueryRunner() {}

    public void addQuery(QueryCommand q) {
        queries.add(q);
    }

    public void runAllQueries() {
        queries.forEach(q -> q.execute());
        queries.remove(queries);
    }
}
