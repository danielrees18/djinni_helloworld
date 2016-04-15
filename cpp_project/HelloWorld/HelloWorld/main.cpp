//
//  main.cpp
//  HelloWorld
//
//  Created by Daniel Rees on 4/15/16.
//  Copyright © 2016 Cedarville University. All rights reserved.
//

#include <iostream>
#include "hellow_world_impl.hpp"

int main(int argc, const char * argv[]) {
    
    helloworld::HelloWorldImpl hw = helloworld::HelloWorldImpl();
    
    std::string myString = hw.get_hello_world();
    
    std::cout << myString << "\n";
    
    // Finish main()
    return 0;
}


