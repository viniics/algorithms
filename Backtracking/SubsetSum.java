/*
 * 2.3 Subset Sum
 * Let’s consider a more complicated problem, called SubsetSum: Given a set X of positive
 * integers and target integer T, is there a subset of elements in X that add up to T?
 * Notice that there can be more than one such subset. For example, if X = {8, 6, 7, 5, 3, 10, 9}
 * and T = 15, the answer is True, thanks to the subsets {8, 7} and {7, 5, 3} and {6, 9}
 * and {5, 10}. On the other hand, if X = {11, 6, 5, 1, 7, 13, 12} and T = 15, the answer is False.
 * 
 *  There are two trivial cases. If the target value T is zero, then we can immediately
 * return True, because empty set is a subset of every set X, and the elements of the empty
 * set add up to zero.⁶
 * 
 * On the other hand, if T < 0, or if T != 0 but the set X is empty, then
 * we can immediately return False.
 * 
 * For the general case, consider an arbitrary element x ∈ X. (We’ve already handled
 * the case where X is empty.) There is a subset of X that sums to T if and only if one of
 * the following statements is true:
 * 
 * • There is a subset of X that includes x and whose sum is T.
 * • There is a subset of X that excludes x and whose sum is T.
 * 
 * In the first case, there must be a subset of X \ {x} that sums to T − x; in the
 * second case, there must be a subset of X \ {x} that sums to T. So we can solve
 * SubsetSum(X, T) by reducing it to two simpler instances: SubsetSum(X \ {x}, T − x) and SubsetSum(X \ {x}, T)
*/

void main() {

}

boolean subsetSum(int[] subset, int num,int currentPos) {
    //Casos base
    if(num==0){
        return true;
    }
    if(num<0 || subset.length==0){
        return false;
    }
    if(num-subset[currentPos]>0){

    }
    if(currentPos==subset.length-1){
        return subsetSum(subset, num, 0);
    }
    return subsetSum(subset, num, currentPos++);

}
