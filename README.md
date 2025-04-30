# CS-360

# Event Tracking App – README

## Summary and Purpose
This mobile app was developed to help users efficiently manage and track items, events, or goals depending on their personal or business needs. The primary goal was to create a user-centered, functional mobile application that demonstrates core Android development skills, including UI design, database management, and permissions handling. The app features a clean and intuitive interface designed to support new users while also offering features for data entry, editing, deletion, and SMS-based notifications.

## User Interface and Features
To support user needs, the app features a login screen for secure access. This data display screen shows stored information in a RecyclerView grid format and SMS functionality for sending alerts, such as low inventory notifications or reminders. Key UI elements such as input fields, buttons, and confirmation messages were carefully placed and styled to promote a clear visual hierarchy. The design adhered to Android's material design guidelines and incorporated input validation and feedback to enhance usability. These choices were made to create an intuitive experience, helping users feel in control and informed.

## Development and Strategy
During development, I followed modular and iterative coding strategies. I utilized Room for persistent data storage, ViewBinding for safe UI referencing, and the MVVM architecture to logically organize the code. Reusability and clarity were emphasized by encapsulating logic in utility classes and ViewModels. These practices not only streamlined development but also made the app easier to test and scale. This approach will be helpful in future projects, especially for managing complexity and ensuring code maintainability.

## Testing and Validation
I tested the app on the Android Emulator across different device sizes and OS versions, particularly API 34, to confirm UI responsiveness and data integrity. I verified login functionality, data CRUD operations, and SMS permission handling. This testing process was vital in identifying bugs like UI misalignment and permission request handling issues. It helped me ensure that the app functions correctly under real-world conditions and remains stable when permissions are denied, or the database is empty.

## Overcoming Challenges
One challenge I encountered was linking delete buttons in the RecyclerView to the Room database while maintaining UI responsiveness. I overcame this by using a DiffUtil-based adapter and observing LiveData from the ViewModel. Another challenge was designing a layout that worked across screen sizes; this was solved by using ConstraintLayout and testing on multiple device configurations.

## Demonstration of Skills
The most successful component of the app was the integration of the Room database with RecyclerView, which enabled the display, update, and deletion of data to be performed dynamically. This demonstrated my ability to build responsive UIs, connect them with backend logic, and ensure smooth data management—all critical skills in mobile app development. Additionally, implementing SMS permission requests and fallbacks highlighted my understanding of Android's permission model and user-centric error handling.
