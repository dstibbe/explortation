package main

import (
	"fmt"
	"time"
)

func fill(c chan int) {
	fmt.Println("Fill")
 	for i:=0;i<10;i++ {
	
	 fmt.Printf("Write: %d\n", i)
	  c <- i
	}
	close(c)
}

func read(c chan int) {
	fmt.Println("Read")
 	for  {
		r,open := <- c
		if( open ) {
	 		fmt.Printf("Read: %d\n", r)
		} else {
			break
		}
	  
	}
}

func readRange(c chan int) {
	fmt.Println("Read")
		for r := range c {
	 		fmt.Printf("Read: %d\n", r)
		} 
}


func main() {
	ch := make(chan int,4)
	fmt.Println("Start")
	go fill(ch)
	go readRange(ch)
	
	fmt.Println("end?")

	time.Sleep(10000 * time.Millisecond)
}
