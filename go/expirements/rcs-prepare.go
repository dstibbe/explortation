/**
 * Copyright (c) 2016 DStibbe 
 */ 

package main

import (
    "fmt"
    "io/ioutil"
    "flag"
    "os"
    "log"
    "bytes"
)


/**
Move files from one dir to another 

One by one for demo purposes.
*/

func main() {

	flag.Parse()
	src := flag.Arg(0)
	dest := flag.Arg(1)
	
	if dest=="" || src=="" {
		fmt.Printf("Invalid arguments")
		return
	}
	
	srcDirInfo,err := os.Stat(src)
	if err != nil {
		log.Fatal(err)
		return
	}
	
	
	destDirInfo,err := os.Stat(dest)
	if err != nil {
		log.Fatal(err)
		return
	}
	
	
	if( !srcDirInfo.IsDir() || !destDirInfo.IsDir() ){
		return
	}

	fmt.Printf("Move contents from %s -> %s\n",src,dest)

	srcFiles, _ := ioutil.ReadDir(src)
	for _, f := range srcFiles {
		
		//get name
		file := f.Name()
		sourcePath := bytes.NewBufferString(src)
		sourcePath.WriteRune(os.PathSeparator)
		sourcePath.WriteString(file)
		
		//prefix with new path
		targetPath := bytes.NewBufferString(dest)
		targetPath.WriteRune(os.PathSeparator)
		targetPath.WriteString(file)
		
		
		
		//rename  
		fmt.Printf("+ %s -> %s\n", sourcePath.String(), targetPath.String())
		os.Rename( sourcePath.String(), targetPath.String())           
    	
    }
}
