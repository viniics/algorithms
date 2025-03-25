// Aprendendo a usar o "waitGroup"

package main

import (
	"fmt"
	"math/rand"
	"sync"
)

func randomNum(goRoutineNum int, wg *sync.WaitGroup, ch chan int) {
	n := rand.Intn(10)
	fmt.Println("GoRoutine numero:", goRoutineNum, "sorteou o valor", n)
	ch <- n
	defer wg.Done()
}

func main() {
	var wg sync.WaitGroup
	fmt.Println("Hello")
	ch := make(chan int, 10)
	for i := range 10 {
		wg.Add(1)
		go randomNum(i, &wg, ch)
	}
	wg.Wait()
	close(ch)
	fmt.Println(calculaMedia(ch))
	fmt.Println("Fim do programa :)")
}

func calculaMedia(ch <-chan int) float64 {
	media := 0
	size := 0
	for n := range ch {
		media += n
		size++
	}
	return float64(media)
}
