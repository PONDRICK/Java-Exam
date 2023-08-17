package Student6421604927;
import java.util.Arrays;
import java.util.Scanner;
public class StudentTest {
    private float[] point = new float[10];
    Scanner sc = new Scanner(System.in);
    public void getRange(){
        
        for(int i =0 ;i<=9;i++){
            System.out.print("Student NO "+(i+1)+" Point = ");
            this.point[i] = sc.nextFloat();
            System.out.println();
        }
        Arrays.sort(point);
        System.out.println("Range = "+(this.point[9]-this.point[0]));
    }
    public void getMedian(){
        for(int i =0 ;i<=9;i++){
            System.out.print("Student NO "+(i+1)+" Point = ");
            this.point[i] = sc.nextFloat();
            System.out.println();
        }
        Arrays.sort(point);
        System.out.print("Median = "+((this.point[4]+this.point[5])/2));
    }
    
    /**
     * @return float[] return the point
     */
    public float[] getPoint() {
        return point;
    }

    /**
     * @param point the point to set
     */
    public void setPoint(float[] point) {
        this.point = point;
    }

}
