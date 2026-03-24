package main

import (
	"fmt"
)

// fibonacci generates and prints n fibonacci numbers
func fibonacci(n int) {
	if n <= 0 {
		fmt.Println("Please enter a positive number")
		return
	}
	
	fmt.Printf("First %d Fibonacci numbers:\n", n)
	
	if n >= 1 {
		fmt.Print("0 ")
	}
	if n >= 2 {
		fmt.Print("1 ")
	}
	
	a, b := 0, 1
	for i := 3; i <= n; i++ {
		next := a + b
		fmt.Printf("%d ", next)
		a, b = b, next
	}
	fmt.Println()
}

func main() {
	var n int
	fmt.Print("Enter the number of Fibonacci numbers to print: ")
	fmt.Scanln(&n)
	
	fibonacci(n)
}