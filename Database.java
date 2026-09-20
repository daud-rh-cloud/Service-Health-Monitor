public class Database extends Resource{
    
    private int connectionperSec; 

    
    Database (String id, String region, double cpuUsage,int upTime,int connectionperSec){
        super(id,region, cpuUsage, upTime);
        this.connectionperSec = connectionperSec;  
    }




  @Override
    public boolean isHealthy() {
        if(GetcpuUgage()<= 85.00 && connectionperSec < 100){
        return true; 
    }
    else{
        return false; 
    }
    }
}
