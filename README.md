# InfoLab5:Multipage Application with Design Patterns
Group Project: Medical Resource Finder
Collaborated by Longfei Yu, Junfeng Quan, Wenqing Yang

Project Description:
Medical Resource Finder is a Java Swing-based application designed to help users find and manage medical resources in different cities and communities. The application enables patients to search for doctors in nearby hospitals, while allowing doctors to diagnose patients and maintain encounter records based on vital signs. It also provides different roles for users, such as System Administrators, Patients, Hospital Administrators, and Community Administrators, to ensure efficient management of the platform.

Features:
Java Swing-based application: The application is built using Java Swing, providing a user-friendly and responsive interface.

User roles and access: When opening the app, users can choose their role: New Patient, New Encounter, or Administrator. Based on the selected role, the user can access different functionalities within the application.

New Patient: Users selecting the "New Patient" role can add their information into the system.

New Encounter: Users selecting the "New Encounter" role can create and add new encounter records with associated vital sign components.

Administrator: Users selecting the "Administrator" role can choose to manage Patients, Doctors, or Hospitals, and view, update, add, or delete information accordingly.

Find nearby doctors: Patients can search for doctors in nearby hospitals based on their location.

Encounter records: Doctors can create encounter records for their patients, with each encounter having a single vital sign component.

Admin management: Administrators can modify hospitals under a community. A system admin can perform CRUD operations on all data.

User data management: The application supports managing user data, including creating, reading, updating, and deleting (CRUD) operations.

Data validation: The application performs data validation checks, including non-null and basic data type checks.

Design Patterns: The application implements two common design patterns: Singleton, ensuring a single instance with a global access point, and Observer, enabling automatic updates of dependents when an object's state changes.

Project architecture hierarchy: The project follows a well-structured architecture hierarchy with nested packages segregated into UI and model components.
