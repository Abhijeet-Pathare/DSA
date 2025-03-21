Big O:
Comparing two sets of code mathematically about how effeciently they run.
Time Complexity, Space Complexity

Omega Best case
Theta Average case
Big O Worst Case

O(n) :
publuc static void printItems(int n){
    for(int i =0;i<n;i++){
        sout(i);
    }
}
-----------------------------------------------
Drop Constants:
---------------
publuc static void printItems(int n){
    for(int i =0;i<n;i++){
        sout(i);
    }
    for(int j =0;j<n;j++){
            sout(i);
        }
}
n+n = 2n
o(2n) = O(n) --> drop constants
---------------------------------------------------
publuc static void printItems(int n){
    for(int i =0;i<n;i++){
         for(int j =0;j<n;j++){
                    sout(i+" "+j);
                }
    }

}
n*n = n^2
O(n^2)
----------------------------------------------------
Drop Non-Dominants:
-------------------
publuc static void printItems(int n){
    for(int i =0;i<n;i++){
         for(int j =0;j<n;j++){
                    sout(i+" "+j);
                }
    }

      for(int j =0;j<n;j++){
                sout(i);
            }

}
n*n + n = n^2 +n
O(n^2 + n)
O(n^2)
------------------------------------------------------
Big O(1):
---------
public static int addItems(int n){
    return n+n;
}
-----------------------------------------------------
Big O(log n):
-------------
1 2 3 4 5 6 7 8
find 1 from sorted array.
1 2 3 4
1 2
1
-----------------------------------------------------