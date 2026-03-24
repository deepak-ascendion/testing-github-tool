package main

import (
	"fmt"
	"strconv"
)

// isPalindrome checks if a number is palindrome
func isPalindrome(num int) bool {
	// Convert number to string
	numStr := strconv.Itoa(num)
	
	// Check if string reads same forwards and backwards
	for i := 0; i < len(numStr)/2; i++ {
		if numStr[i] != numStr[len(numStr)-1-i] {
			return false
		}
	}
	return true
}

func main() {
	var number int
	fmt.Print("Enter a number to check if it's palindrome: ")
	fmt.Scanln(&number)
	
	if isPalindrome(number) {
		fmt.Printf("%d is a palindrome number\n", number)
	} else {
		fmt.Printf("%d is not a palindrome number\n", number)
	}
}