public class GrowthPopulation {
    /*In a small town the population is p0 = 1000 at the beginning of a year. The population regularly
    increases by 2 percent per year and moreover 50 new inhabitants per year come to live in the town.
    How many years does the town need to see its population greater or equal to p = 1200 inhabitants?
     */
    public static void main(String[] args) {
        int p0;
        double percent;
        int aug, p;
        p0=1000;
        p=p0;
        int contador=0;
        percent=2;
        percent= 1+(percent/100);
        System.out.println(percent);
        while(p <= 1200 ){
            p=(int)(p*percent)+50;
            contador++;
        }
        System.out.println("La poblacion alcanza los "+p+" a los "+contador+" anios");
    }
}
