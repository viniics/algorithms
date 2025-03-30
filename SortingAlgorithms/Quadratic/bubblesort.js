function bubblesort(array){
    for(i=0;i<array.length-1;i++){
        for(j=i;j<array.length;j++){
            if(array[i]>array[j]){
                let temp = array[i]
                array[i]= array[j]
                array[j] = temp
            }
        }
    }
}
array = [1,2,4,5,6,7,8,9,2,4,5,6,7,0]
console.log(array + "-> array original")
bubblesort(array)
console.log(array + "-> array ordenado")
