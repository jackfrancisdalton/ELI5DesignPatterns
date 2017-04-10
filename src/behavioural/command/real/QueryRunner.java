package behavioural.command.real;

import android.app.DownloadManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackfrancisdalton on 07/04/17.
 */
public class QueryRunner {
    List<QueryCommand> querys = new ArrayList<>();

    public QueryRunner() {}

    public void addQuery(QueryCommand q) {
        querys.add(q);
    }

    public void runQuerys() {
        for (QueryCommand q: querys) {
            q.execute();
        }
        querys.remove(querys);
    }
}
