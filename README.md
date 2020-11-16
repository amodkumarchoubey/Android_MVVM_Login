# Android_MVVM_Login



MVVM (Model View ViewModel)--->

MVVM architecture is a Model-View-ViewModel architecture that removes the tight coupling between each component.
in this architecture, the children don't have the direct reference to the parent, they only have the reference by observables.

The MVVM (Model-View-ViewModel) pattern helps to completely separate the business and presentation logic from the UI, and 
the business logic and UI can be clearly separated for easier testing and easier maintenance

ViewModel replaces the Presenter in the Middle Layer.
The Presenter holds references to the View. The ViewModel doesn’t.
The Presenter updates the View using the classical way (triggering methods).
The ViewModel sends data streams.
The Presenter and View are in a 1 to 1 relationship.
The View and the ViewModel are in a 1 to many relationship.
The ViewModel does not know that the View is listening to it.

There are two ways to implement MVVM in Android:
a).Data Binding
b).RXJava

In MVP, the presenter communicates with the view through an interface. 
In MVVM, the ViewModel communicates with the view using the Observer pattern.
Model is the logic associated with the application data.

Model: It represents the data and the business logic of the Android Application. It consists of the business logic - local and remote data source, 
model classes, repository.

View: It consists of the UI Code(Activity, Fragment), XML. It sends the user action to the ViewModel but does not get the response back directly. 
To get the response, it has to subscribe to the observables which ViewModel exposes to it.

ViewModel: It is a bridge between the View and Model(business logic). It does not have any clue which View has to use it as it does not have a direct 
reference to the View. So basically, the ViewModel should not be aware of the view who is interacting with. It interacts with the Model and exposes the observable that can be observed by the View.

what are the advantages of using MVVM in your android project.

If you use MVVM it will help you structuring your code in a nice way so that it is easy to understand for a new developer.
Using MVVM makes your project maintainable as everything is well organized and making changes are very easy.
Testability is easy with MVVM because all modules are independent and testable.
MVVM enhances the re-usability of the code.
