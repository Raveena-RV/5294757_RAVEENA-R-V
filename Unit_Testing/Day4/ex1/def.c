#include "demo.h"
#include <stdio.h>


float calculate_average(int arr[], int size){
    if(size <= 0 || arr == NULL) return 0.0f;

    int sum = 0;
    for(int i = 0; i < size;i++){
        sum += arr[i];
    }
    return (float)sum/size;
}