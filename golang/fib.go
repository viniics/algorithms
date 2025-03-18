package main

import ("fmt")

func fib(n int) int{
	if n <= 1{
		return n
	}
	return (fib(n-1) + fib(n-2))
}

func status(){
	for{
		fmt.Println("Calma, Kayky!")
	}
}

func main(){
	go status()
	result := fib(210)
	fmt.Println(result)
}