/**
 * Copyright (c) 2016 DStibbe 
 */ 
 
package main

import (
  "path/filepath"
  "os"
  "flag"
  "fmt"
  "regexp"
  "io/ioutil"
)

/**
Listing CVS repository files
*/

func listCsv(path string, info os.FileInfo, err error) error {
  
	if( !info.IsDir()  ){
		name:= info.Name()
		match,_ := regexp.MatchString(".*,v$",name)
		if( match ) {
			fmt.Printf("Visited: %s\n", path)
		}
	
	}
  
  return nil
} 

func listRepos(root string) {
    files, _ := ioutil.ReadDir(root)
    for _, f := range files {
            fmt.Println(f.Name())
    }
}


func checkoutFile(path string, info os.FileInfo, err error) error {
  
	if( !info.IsDir()  ){
		name:= info.Name()
		match,_ := regexp.MatchString(".*,v$",name)
		if( match ) {
			fmt.Printf("Checkout: %s\n", path)
		}
	}
  
  return nil
} 


func main() {
  flag.Parse()
  
  root := flag.Arg(1)
  
  cmd := flag.Arg(0)
  
  if( cmd == "list"){
	err := filepath.Walk(root, listCsv)
	
	fmt.Printf("filepath.Walk() returned %v\n", err)
  } else if( cmd == "repolist"){
	listRepos(root)
  }else if( cmd == "checkout"){
	err := filepath.Walk(root, checkoutFile)
	
	fmt.Printf("filepath.Walk() returned %v\n", err)
  }
  
  
  
  
}

