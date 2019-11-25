The two patterns used are the Composite Design Pattern and Password strength checker.

The Composite Design Pattern can be seen in the class structure and hierarchy.

The Component is the Login Interface that is found within the Login package.  
The Leaves are the model classes (Admin, Medical Personnel, and Patients)
The Composite is are the directories (that are created by the other classes, this is where the data is ultimately kept)
The Client are the controllers in the Controller package.

The Password Strength checker is found in the CreateUserView in the View package

Refactoring Plan:
 1. Add encapsulation where needed
 2. Remove dead code
 3. Remove redundancy

Classes where the encapsulation is needed:
    1. every class within the Controller package had public attributes
        a. They were changed to protected attributes, so that other classes within the package could access them
    2. every class within the Data package had public attributes, so they were changed to private and final
    3. AbstractView, in the View package, had public attributes, so they were changed to protected
    4. AdminView had public attributes that were changed to private
    5. MedicalView had a public button that was changed to private

Classes where dead code was removed:
    1. MedicalView, in the View package, had commented out code and unused imports, so they were removed from the program
    2. Login, in the Model.Admin package, had an unused import 

Classes where redundancy was removed:
    1. CreateUserView, in the View package, had a redundant if statement that was removed

The Refactoring plan was implemented by David Schmidt
The Second Use Case was implemented by Henry Pearce, Matt Draghi, and David Schmidt




CREDENTIALS FOR LOGIN

Patient: 
ID = patient
Password = patient

Medical Personnel:
ID = medical
Password = medical

Admin:
ID = admin
Password = admin
