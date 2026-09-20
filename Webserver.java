public class Webserver extends Resource{
    
    private int requestsPerSec; 

    
    Webserver (String id, String region, double cpuUsage,int upTime,int requestsPerSec){
        super(id,region, cpuUsage, upTime);
        this.requestsPerSec = requestsPerSec;  
    }

  


}
