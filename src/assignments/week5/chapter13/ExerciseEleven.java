package assignments.week5.chapter13;

/*
--Exercise 11--
Using the same arrays from the previous problem, trace the complete execution of the merge sort algorithm when called
on each array.

Show the subarrays that are created by the algorithm and show the merging of subarrays into larger sorted arrays.

int[] numbers3 = {8, 5, –9, 14, 0, –1, –7, 3};
int[] numbers4 = {15, 56, 24, 5, 39, –4, 27, 10};

A:
#            |   Left                Right                   Merged
-------------|------------------------------------------------------------------------------
1            |   {8, 5, –9, 14}      {0, –1, –7, 3}          { , , , , , , , }
    1a       |   {8, 5}              {-9, 14}                { , , , }
        1aa  |   {8}                 {5}                     {5, 8}
        1ab  |   {-9}                {14}                    {-9, 14}
    1a       |   {5, 8}              {-9, 14}                {-9, 5, 8, 14}
    1b       |   {0, –1}             {–7, 3}                 { , , , }
        1ba  |   {0}                 {-1}                    {-1, 0}
        1bb  |   {-7}                {3}                     {-7, 3}
    1b       |   {-1, 0}             {-7, 3}                 {-7, -1, 0, 3}
2            |   {-9, 5, 8, 14}      {-7, -1, 0, 3}          {-9, -7, -1, 0, 3, 5, 8, 14}
--------------------------------------------------------------------------------------------

#            |   Left                Right                   Merged
-------------|------------------------------------------------------------------------------
1            |   {15, 56, 24, 5}     {39, –4, 27, 10}        { , , , , , , , }
    1a       |   {15, 56}            {24, 5}                 { , , , }
        1aa  |   {15}                {56}                    {15, 56}
        1ab  |   {24}                {5}                     {5, 24}
    1a       |   {15, 56}            {5, 24}                 {5, 15, 24, 56}
    1b       |   {39, –4}            {27, 10}                { , , , }
        1ba  |   {39}                {-4}                    {-4, 39}
        1bb  |   {27}                {10}                    {10, 27}
    1b       |   {-4, 39}            {10, 27}                {-4, 10, 27, 39}
2            |   {5, 15, 24, 56}     {-4, 10, 27, 39}        {-4, 5, 10, 15, 24, 27, 39, 56}
--------------------------------------------------------------------------------------------
*/

public class ExerciseEleven {
}
