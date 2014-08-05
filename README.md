[![Build Status](https://travis-ci.org/tysonite/asn1-compiler.png?branch=master)](https://travis-ci.org/tysonite/asn1-compiler)
[![Coverage Status](https://coveralls.io/repos/tysonite/asn1-compiler/badge.png?branch=master)](https://coveralls.io/r/tysonite/asn1-compiler?branch=master)

# Description

A compiler from ASN.1 to C++ code and run-time library for encoding/decoding data using BER/DER.
Run-time library can be used independently from ASN.1 compiler. 

# Structure

The top directory consists of these sub-directories:
* compiler -- A Java ASN.1 to C++ compiler
* runtime  -- C++ runtime library for encoding/decoding of the data

# Compile & Test runtime library
The runtime library uses [CMake](http://www.cmake.org/) to build itself. As a result of compilation static and shared libraries will be produced.

1. Ensure that you are located in the directory with runtime library sources;
2. Create a temporary build directory (e.g. build) with help of 'mkdir' command: `mkdir build`;
3. Change current working to build directory: `cd build`;
4. Execute CMake to create Makefile: `cmake ..`;
5. Execute GNU make to build static and shared libraries: `make`;

Unit tests can be built during library compilation, if CMake command line contains option `-DBUILD_UNIT_TESTS=1`.

Coverage data can be calculated, if CMake command line contains option `-DDO_COVERAGE=1`. There is no need to specify `-DBUILD_UNIT_TESTS=1` if you are going to see coverage data, because it will be enabled automatically. For example, to compile unit tests and collect coverage data during their running, execute `cmake -DDO_COVERAGE=1 ..` instead of command in step 4 above.

To run unit tests execute command: `./tests/TestBER`.

# Generate Debian/Ubuntu runtime package
The runtime library uses CPack (feature of CMake) to generate an installable Debian package. If compilation of runtime library was successful, execute `make package` to create package.
