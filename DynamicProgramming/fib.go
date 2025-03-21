package main

import (
	"fmt"
)

func fib(n int) int {
	array := make([]int, n+1)
	array[0] = 0
	array[1] = 1
	for i := 2; i < len(array); i++ {
		array[i] = array[i-1] + array[i-2]
	}
	return array[n]
}

func recursiveFib(n int) int {
	if n <= 1 {
		return n
	}
	return recursiveFib(n-1) + recursiveFib(n-2)
}

func main() {
	go fmt.Println(fib(120))
	go fmt.Println(recursiveFib(40))
}
