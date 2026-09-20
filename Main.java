public class Resource {
    
 private String id; 
 private String region; 
 private double cpuUsage; 
 private int upTime;
 
 
    Resource (String id, String region, double cpuUsage,int upTime){
        this.id = id ;
        this.region = region;
        this.cpuUsage = cpuUsage; 
        this.upTime = upTime;
    }

    public String Getid(){
        return id; 
    }


     public String Getregion(){
         return region; 
    }



    public double GetcpuUgage(){
        return cpuUsage; 
    }


     public int Getuptime(){
        return upTime; 
    }


    public boolean isHealthy(){
        if(cpuUsage <= 85.00 ){
           return true ; 
        }
        else {
            return false; 
        }
    }

    public void status(){
        System.out.println("The Service id is: " + Getid() + "  region:- " +Getregion() +"  cpuUgage:- " +GetcpuUgage() + "Uptime =  " +Getuptime() + "Is healthy:- " +isHealthy());
    }

 


}

