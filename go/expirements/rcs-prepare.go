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


var sep string = string(os.PathSeparator)

/**
Move all files in the directories in the tree to a newly created 'RCS' subdir.
*/

func createSubDirString(base string, dir string) string {
	rcsPathBuilder := bytes.NewBufferString(base)
	rcsPathBuilder.WriteRune(os.PathSeparator)
	rcsPathBuilder.WriteString(dir)
	rcsPathBuilder.WriteRune(os.PathSeparator)

	return rcsPathBuilder.String()

}


func processDir(src string) {
	rcsPath := createSubDirString(src, "RCS")	
		
	srcFiles, _ := ioutil.ReadDir(src)
	
	fmt.Printf("> %s\n",rcsPath)
	os.Mkdir(rcsPath, 0777)
	
	for _, f := range srcFiles {
		fName := src + sep + f.Name()
		if f.IsDir() {
			processDir(fName) 
		}else {
			//fmt.Printf("+ %s -> %s\n",fName, rcsPath + f.Name())		
		    os.Rename(fName, rcsPath + f.Name())		
		}
		
	}
	
}


func main() {

	flag.Parse()
	src := flag.Arg(0)
	
	if src=="" {
		fmt.Printf("Invalid arguments")
		return
	}
	
	srcDirInfo,err := os.Stat(src)
	if err != nil  || !srcDirInfo.IsDir() {
		log.Fatal(err)
		return
	}
	

	fmt.Printf("Start preparation for rcs in %s\n", src)

	
	 processDir(src)
	
}
