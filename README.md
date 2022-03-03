# DBSMax
Proof-of-concept for DBS Max  

**Project architecture**
Multi-module MVVM + Clean architecture that isolates the Data/Domain/Presentation layers  

app: Where the application consolidates all the modules  
core: The module that Domain/Data layers inherit from (Does not contain UI dependencies)  
core-ui: The module that Presentation layers inherit from (Contain UI dependencies)  
buildSrc: This module contain classes that specify dependency versions 
feature: Every feature is a library module and has it's own Data/Domain/Presentation layer  
