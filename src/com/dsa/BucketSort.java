package com.dsa;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        float [] arr={0.7f,0.4f,0.3f,0.2f,0.1f};
        Bsort(arr);
        for(float val:arr){
            System.out.println(val+"");
        }
    }

    static void Bsort(float[]arr){
        int n =arr.length;
        //buckets
        ArrayList<Float>[] buckets = new ArrayList[n];

        for (int i =0;i<n;i++){
            buckets[i]=new ArrayList<Float>();

        }

        // adding elements into buckets
        for(int i =0; i<n; i++){
            int bucketIndex =(int)(arr[i]*n);
            buckets[bucketIndex].add(arr[i]);
        }

        //sorting each bucket individually;
        for(int i =0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }

        //merge all buckets
        int index=0;
        for(int i =0;i<buckets.length;i++){
            ArrayList<Float>currBucket=buckets[i];
            for(int j=0;j<currBucket.size();j++){
                arr[index++]=currBucket.get(j);
            }
        }

    }

}
