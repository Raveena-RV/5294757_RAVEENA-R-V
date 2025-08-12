#include "unity.h"
#include "demo.h"
#include <stdlib.h>


void setUp(){}
void tearDown(){}

void swap(){
    int a = 10, b = 20;
    swap(&a, &b);
    TEST_ASSERT_EQUAL_INT(20,a);
    TEST_ASSERT_EQUAL_INT(10,b);
}

int main(){
    UNITY_BEGIN()
    
    RUN_TEST(swap);
    return UNITY_END;

}