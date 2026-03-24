package main

import (
	"fmt"
)

// reverseString reverses a given string
func reverseString(s string) string {
	runes := []rune(s)
	for i, j := 0, len(runes)-1; i < j; i, j = i+1, j-1 {
		runes[i], runes[j] = runes[j], runes[i]
	}
	return string(runes)
}

func main() {
	var input string
	fmt.Print("Enter a string to reverse: ")
	fmt.Scanln(&input)
	
	reversed := reverseString(input)
	fmt.Printf("Original string: %s\n", input)
	fmt.Printf("Reversed string: %s\n", reversed)
}