package main

import "fmt"

func main() {
    a := 99
    b := 44
    fmt.Println("Before swap:", "a =", a, "b =", b)
    // Swap using a temporary variable
    temp := a
    a = b
    b = temp
    fmt.Println("After swap:", "a =", a, "b =", b)
}