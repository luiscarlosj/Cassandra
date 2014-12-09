/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conection;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
//import com.datastax.driver.core.Host;
//import com.datastax.driver.core.Metadata;

/**
 *
 * @author luis carlos
 */
public class Conexao {
    
    public Cluster cluster;
    public Session session;
    
    public Session connect () 
    {
        cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        
        this.session = cluster.connect("monografia");
        
        /*Metadata metadata = cluster.getMetadata();
        
        System.out.printf("Connected to cluster: %s\n",metadata.getClusterName());
        
        for ( Host host : metadata.getAllHosts() ) 
        {
            System.out.printf("Datacenter: %s; Host: %s; Rack: %s\n",
            host.getDatacenter(), host.getAddress(), host.getRack());
        }*/
        
        return session;
    }
    
    public void close() 
    {
        this.cluster.close();
    }
    
}
