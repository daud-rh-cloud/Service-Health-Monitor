import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        
        Webserver web1 = new Webserver("web-01", "us-east", 40.0, 200, 1500);
        Database db1   = new Database("db-01", "eu-west", 88.0, 300, 150);
        Loadbalancer lb1 = new Loadbalancer("loadBa-01", "ap-south", 20.0, 500, 8);
        Database db2 = new Database("db-02", "us-east", 50.0, 300, 150);


        ArrayList<Resource> Resources = new ArrayList<>(); 

        Resources.add(web1); 
        Resources.add(db1);
        Resources.add(lb1); 
        Resources.add(db2); 

        int totalhealthy = 0; 
        int  FailedHealthCheak = 0 ;

        for (int i = 0 ; i < Resources.size(); i++){
            Resources.get(i).status();   

            if (Resources.get(i).isHealthy()){
                totalhealthy += 1; 
            }
            else {
             FailedHealthCheak += 1; 
            }
        }

        System.out.println("Total Failed Healthcheak: "+FailedHealthCheak);

        Resource hottestSofar = Resources.get(0); 
          for (int i = 0 ; i < Resources.size(); i++){
            if (Resources.get(i).GetcpuUgage()> hottestSofar.GetcpuUgage()){
                hottestSofar = Resources.get(i); 
            }
          }

          System.out.println(hottestSofar.Getid());



    }
    
}
