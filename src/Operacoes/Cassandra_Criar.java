
package Operacoes;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

/**
 *
 * @author luis carlos
 */
public class Cassandra_Criar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cluster cluster;
        Session session;
        
        // Conecte-se ao cluster e keyspace "monografia" 
        cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        session = cluster.connect("monografia");
        
        session.execute("CREATE KEYSPACE monografia WITH replication " + 
        "= {'class':'SimpleStrategy', 'replication_factor':3};");
        
        
        
        cluster.close();
    }
}
