/*****************************************************************
//
// NAME: Umi a Liloa Ching-Nakama
//
// HOMEWORK: 9
//
// CLASS: ICS 212
//
// INSTRUCTOR: Ravi Narayan
//
// DATE: August 5, 2017
//
// FILE: HelloWorld.java
//
// DESCRIPTION: This file contains the c native functions for the temp conversion program
//
****************************************************************/
#include <stdio.h>
#include <jni.h>
#include <jni_md.h>
#include "HelloWorld.h"

/*****************************************************************
//
// Function name: round
//
// DESCRIPTION: rounds a number to the next multiple of t
//
// Parameters: in: number that is input
//
// Return values: number if it is a multiple of 5, else nubmer to the next multiple of 5
//
****************************************************************/
JNIEXPORT jint JNICALL
Java_HelloWorld_round(JNIEnv *j, jobject o, jint in)
{

    jint returnVal;
    if(in % 5 == 0) 
    {
        returnVal = in;
    }
    else
    {
        while(in % 5 !=0)
        {
            in++;
        }
        returnVal = in;

    }
    return returnVal;
}
/*****************************************************************
//
// Function name: convertFtoC
//
// DESCRIPTION: converts temp from F to temp in C
//
// Parameters: in: number that is input
//
// Return values: temp in C
//
****************************************************************/
JNIEXPORT jfloat JNICALL
Java_HelloWorld_convertFtoC(JNIEnv * j, jobject o, jint f)
{
    jfloat returnVal;
    jfloat converted = f;
    returnVal = (5.0/9.0) * (converted-32.0);
    return returnVal;
}

