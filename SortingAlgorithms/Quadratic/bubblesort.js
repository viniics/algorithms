function bubblesort(array){
    for(i=0;i<array.length-1;i++){
        for(j=i+1;j<array.length;j++){
            if(array[i]>array[j]){
                let temp = array[i]
                array[i]= array[j]
                array[j] = temp
            }
        }
    }
}
array = [9,8,7,6,5,4,3,2,1,0]
console.log(array + "-> array original")
bubblesort(array)
console.log(array + "-> array ordenado")
