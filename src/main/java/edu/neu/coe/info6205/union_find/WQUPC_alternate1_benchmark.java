package edu.neu.coe.info6205.union_find;

import edu.neu.coe.info6205.util.Benchmark;
import edu.neu.coe.info6205.util.Benchmark_Timer;

import java.util.Random;

public class WQUPC_alternate1_benchmark {

    public static void main(String args[]){


        for(int i=200;i<=3200;i=i*2)
        {
            int sites=i;
            //weighted quick union, storing the size
            Benchmark benchmark_wqupc = new Benchmark_Timer<>("", b->{

                WQUPC wqupc =new WQUPC(sites);
                Random random1=new Random();
                while(wqupc.count()!=1) {
                    int comp1 = random1.nextInt(sites);
                    int comp2 = random1.nextInt(sites);
                    if (!wqupc.connected(comp1, comp2)) {
                        wqupc.union(comp1, comp2);
                    }
                }
       });
            double result= benchmark_wqupc.run(0,100);
            System.out.println("Weighted quick union by storing size for " + sites + " sites takes "+ result+" milliseconds.");

//weighted quick union, store the depth rather than the size - alternate1
            Benchmark benchmark_wqupc_alternate = new Benchmark_Timer<>("", b->{

                WQUPC_alternate1 wqupc_alternate1 =new WQUPC_alternate1(sites);
                Random random=new Random();
                while(wqupc_alternate1.count()!=1) {
                    int comp1 = random.nextInt(sites);
                    int comp2 = random.nextInt(sites);
                    if (!wqupc_alternate1.connected(comp1, comp2)) {
                        wqupc_alternate1.union(comp1, comp2);
                    }
                }
            });
            double result_alternate= benchmark_wqupc_alternate.run(0,100);
            System.out.println("Weighted quick union by storing depth for " + sites + " sites takes "+ result_alternate+" milliseconds.");
            System.out.println("------------------------------------------------------------------------------------------------------");

        }


    }
}
