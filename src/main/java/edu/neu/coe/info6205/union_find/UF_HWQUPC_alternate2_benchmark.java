package edu.neu.coe.info6205.union_find;

import edu.neu.coe.info6205.util.Benchmark;
import edu.neu.coe.info6205.util.Benchmark_Timer;

import java.util.Random;

public class UF_HWQUPC_alternate2_benchmark {
    public static void main(String args[]){


        for(int i=200;i<=3200;i=i*2)
        {
            int sites=i;
            //Weighted Union Find with Path Compression
            Benchmark benchmark_wqupc = new Benchmark_Timer<>("", b->{

                UF_HWQUPC ufHwqupc =new UF_HWQUPC(sites);
                Random random1=new Random();
                while(ufHwqupc.components()!=1) {
                    int comp1 = random1.nextInt(sites);
                    int comp2 = random1.nextInt(sites);
                    if (!ufHwqupc.connected(comp1, comp2)) {
                        ufHwqupc.union(comp1, comp2);
                    }
                }
            });
            double result= benchmark_wqupc.run(0,100);
            System.out.println("Weighted quick union with path compression for " + sites + " sites takes "+ result+" milliseconds.");

        //do two loops, so that all intermediate nodes point to the root, not just the alternates. - alternate2
            Benchmark benchmark_wqupc_alternate = new Benchmark_Timer<>("", b->{

                UF_HWQUPC_alternate2 uf_hwqupc_alternate2 =new UF_HWQUPC_alternate2(sites);
                Random random=new Random();
                while(uf_hwqupc_alternate2.components()!=1) {
                    int comp1 = random.nextInt(sites);
                    int comp2 = random.nextInt(sites);
                    if (!uf_hwqupc_alternate2.connected(comp1, comp2)) {
                        uf_hwqupc_alternate2.union(comp1, comp2);
                    }
                }
            });
            double result_alternate= benchmark_wqupc_alternate.run(0,100);
            System.out.println("Weighted quick union with path compression with 2 loops for " + sites + " sites takes "+ result_alternate+" milliseconds.");
            System.out.println("------------------------------------------------------------------------------------------------------");

        }


    }
}
