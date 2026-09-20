public class Loadbalancer extends Resource{
    
    private int backendCount; 

    
    Loadbalancer (String id, String region, double cpuUsage,int upTime,int backendCount){
        super(id,region, cpuUsage, upTime);
        this.backendCount = backendCount;  
    }
 

 
    
}
