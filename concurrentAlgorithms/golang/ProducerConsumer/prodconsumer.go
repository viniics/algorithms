package main

import (
	"fmt"
	"math/rand"
	"sync"
	"time"
)

var wg sync.WaitGroup

func produce(ch chan<- int) {
	defer wg.Done()
	for {
		n := rand.Intn(10)
		fmt.Println(n, "Foi adicioando")
		ch <- n
		time.Sleep(100 * time.Millisecond)
	}
}

func consume(ch <-chan int) {
	defer wg.Done()
	for {
		n := <-ch
		fmt.Println(n, "Foi consumido")
		time.Sleep(500 * time.Millisecond)
	}
}

func main() {
	cn := make(chan int, 5)
	wg.Add(4)
	go produce(cn)
	go produce(cn)
	go produce(cn)
	go consume(cn)
	wg.Wait()
	fmt.Println("Hello World!")
}
