    BotaniqScape - Technical Report

# BotaniqScape - Technical Report

1.  [Abstract](#abstract)
2.  [Introduction](#introduction)
3.  [Internal Data Structures/Models](#internal-structures)
    1.  [Models](#models)
    2.  [Enums](#enums)
    3.  [APIs](#apis)
    4.  [Statecharts](#statecharts)
    5.  [SHACL Validation](#shacl-validation)
4.  [External Data Sources](#external-sources)
    1.  [Public Web Services](#public-web-services)
    2.  [Private APIs](#private-apis)
5.  [Conformance to Linked Data Principles](#linked-data-principles)
6.  [Preliminary Considerations for Web Application Development](#web-app-development)
    1.  [Frameworks and Technologies Used](#tech-used)
    2.  [Development Methodology](#dev-methodology)
    3.  [Security Considerations](#security-considerations)
    4.  [Scalability and Performance Considerations](#scalability-performance)
7.  [Detailed Analysis of Data Handling and Processing](#data-handling-processing)
    1.  [Data Collection, Processing, and Storage](#data-collection-processing)
    2.  [Data Validation and Sanitization](#validation)
    3.  [Error Handling and Exceptions](#error-handling)
8.  [Authors](#authors)
    1.  [Alex Amarandei](#author-1)
    2.  [Andrei Zaharia](#author-2)
9.  [Acknowledgements](#acks)
10. [References](#biblio-references)
11. [License](#license)

## 1\. Abstract

Embark on a botanical journey like never before with **BotaniqScape**, an immersive and captivating social platform designed to revolutionize the way we explore and connect with the wonders of botanical gardens.

## 2\. Introduction

-   #### Discover a World of Possibilities

    BotaniqScape goes beyond traditional mapping services, offering a dynamic and user-friendly digital cartography experience. Explore the enchanting layouts of botanical gardens from the palm of your hand, bringing the magic of these green sanctuaries directly to your device.

-   #### Ignite Your Curiosity

    Delve into a treasure trove of educational insights, unlocking the secrets of diverse plant species. BotaniqScape serves as your botanical encyclopedia, providing a deeper understanding of plant classification, conservation efforts, and the fascinating world of flora.

-   #### Engage in Interactive Adventures

    Participate in a myriad of engaging activities, from curated guided tours to captivating plant and art exhibitions. Contribute your own experiences by adding comments, images, and establishing connections between objects, creating a vibrant and collaborative community within the botanical realm.

-   #### Seamless Knowledge Integration

    BotaniqScape seamlessly integrates knowledge through SPARQL endpoints, ensuring an enriched experience. Explore a wealth of botanical wisdom sourced from [DBpedia](https://www.dbpedia.org/) and [Wikidata](https://www.wikidata.org/wiki/Wikidata:Main_Page), expanding your understanding of the natural world with every interaction.

-   #### Bonus: Elevate Your Experience with Conversational Bliss

    As a special bonus, BotaniqScape introduces multilingual conversational interactions. Stay informed with personalized notifications on tours, events, and exhibitions, making your botanical adventure not just educational but also socially rewarding.

---

BotaniqScape isn't just an app; it's a gateway to a vibrant community of botanical enthusiasts. Join us as we redefine how botanical gardens are explored, shared, and celebrated. Let BotaniqScape be your companion in transforming ordinary moments into extraordinary botanical adventures. Welcome to a world where every plant tells a story, and every user contributes to an ever-growing tapestry of botanical wonders.

##### The Authors

---

## Internal Data Structures/Models

💡 **Important Mention:** Keep in mind that what is currently written in this section is subject to change.

This section will serve as a general overview of the application's structure. This should be considered the basis and will probably only be extended and not reduced.

### Models

Our internal models serve as the backbone, enabling BotaniqScape to represent and organize botanical data.

-   Garden

-   **Description:** An object modelling a Botanical Garden.
-   **Required Fields:** id, name, description, location, images, exhibitions, events
-   **Optional Fields:** resources

-   Event

-   **Description:** An object modelling an Event happening inside a Botanical Garden.
-   **Required Fields:** id, name, description, date, people
-   **Optional Fields:** images, ticket, socialMediaLinks

-   Exhibition

-   **Description:** An object modelling an Exhibition of Plants inside a Botanical Garden.
-   **Required Fields:** id, name, description, date, plants
-   **Optional Fields:** images, socialMediaLinks, resources

-   Plant

-   **Description:** An object modelling a Plant.
-   **Required Fields:** id, name, description, images, gardenOrgURL
-   **Optional Fields:** season, plantHabit, lifeCycle, soilPreferences

-   User

-   **Description:** An object modelling a User of the BotaniqScape app.
-   **Required Fields:** username, firstName, lastName, birthday, password, email, phoneNumber, role
-   **Optional Fields:** images

-   Review

-   **Description:** An object modelling a User Review on the BotaniqScape app.
-   **Required Fields:** id, itemId, authorUsername, description, anonymous

-   Location

-   **Description:** An object modelling the Location of a Botanical Garden.
-   **Required Fields:** city, county, country, streetName, postalCode, coordinates, googleMapsLink

-   Coordinates

-   **Description:** An object modelling the Coordinates of a Location.
-   **Required Fields:** latitude , longitude

### Enums

The Enums determine a fixed set of possible values for certain fields of the models.

-   Role

-   **Description:** The possible Roles that a user of BotaniqScape could have.
-   **Values:** User, EventOrganizer, GardenOwner, Administrator

### APIs

The APIs in BotaniqScape facilitate seamless interactions, connecting users with a wealth of botanical information.

-   Garden API Endpoints

-   ##### /gardens/{gardenId}:

    -   **Method:** GET
    -   **Summary:** Get a garden by ID
    -   **Parameters:**
        -   **gardenId:** The ID of the garden to retrieve

-   ##### /gardens/{gardenId}:

    -   **Method:** PUT
    -   **Summary:** Update a garden by ID
    -   **Parameters:**
        -   **gardenId:** The ID of the garden to update

-   ##### /gardens/{gardenId}:

    -   **Method:** DELETE
    -   **Summary:** Delete a garden by ID
    -   **Parameters:**
        -   **gardenId:** The ID of the garden to update

-   ##### /gardens:

    -   **Method:** GET
    -   **Summary:** Get all gardens

-   ##### /gardens:

    -   **Method:** POST
    -   **Summary:** Create a new garden
    -   **Parameters:**
        -   **Garden:** The garden informations

-   ##### /gardens/location:

    -   **Method:** GET
    -   **Summary:** Get gardens by location
    -   **Parameters:**
        -   **Location:** The location to filter gardens by

-   ##### /gardens/{gardenId}/events:

    -   **Method:** GET
    -   **Summary:** Get events by garden
    -   **Parameters:**
        -   **gardenId:** The ID of the garden to filter events by

-   ##### /gardens/{gardenId}/exhibitions:

    -   **Method:** GET
    -   **Summary:** Get exhibitions by garden
    -   **Parameters:**
        -   **gardenId:** The ID of the garden to filter exhibitions by

-   ##### /gardens/{gardenId}/plants/:

    -   **Method:** GET
    -   **Summary:** Get plants by garden
    -   **Parameters:**
        -   **gardenId:** The ID of the garden to filter plants by

-   Events API Endpoints

-   ##### /events/{eventId}:

    -   **Method:** GET
    -   **Summary:** Get an event by ID
    -   **Parameters:**
        -   **eventId:** The ID of the event to retrieve

-   ##### /events/{eventId}:

    -   **Method:** PUT
    -   **Summary:** Update an event by ID
    -   **Parameters:**
        -   **eventId:** The ID of the event to update

-   ##### /events/{eventId}:

    -   **Method:** DELETE
    -   **Summary:** Delete an event by ID
    -   **Parameters:**
        -   **eventId:** The ID of the event to delete

-   ##### /events:

    -   **Method:** GET
    -   **Summary:** Get all events

-   ##### /events:

    -   **Method:** POST
    -   **Summary:** Create a new event
    -   **Parameters:**
        -   **Event:** The event information

-   ##### /events/dateRange:

    -   **Method:** GET
    -   **Summary:** Get events by date range
    -   **Parameters:**
        -   **startDate:** The start date of the range
        -   **endDate:** The end date of the range

-   ##### /events/location:

    -   **Method:** GET
    -   **Summary:** Get events by location
    -   **Parameters:**
        -   **location:** The location to filter events by

-   exhibitions API Endpoints

-   ##### /exhibitions/{exhibitionId}:

    -   **Method:** GET
    -   **Summary:** Get an exhibition by ID
    -   **Parameters:**
        -   **exhibitionId:** The ID of the exhibition to retrieve

-   ##### /exhibitions/{exhibitionId}:

    -   **Method:** PUT
    -   **Summary:** Update an exhibition by ID
    -   **Parameters:**
        -   **exhibitionId:** The ID of the exhibition to update

-   ##### /exhibitions/{exhibitionId}:

    -   **Method:** DELETE
    -   **Summary:** Delete an exhibition by ID
    -   **Parameters:**
        -   **exhibitionId:** The ID of the exhibition to delete

-   ##### /exhibitions:

    -   **Method:** GET
    -   **Summary:** Get all exhibitions

-   ##### /exhibitions:

    -   **Method:** POST
    -   **Summary:** Create a new exhibition
    -   **Parameters:**
        -   **exhibition:** The exhibition infromations

-   ##### /exhibitions/dateRange:

    -   **Method:** GET
    -   **Summary:** Get exhibitions by date range
    -   **Parameters:**
        -   **startDate:** The start date of the range
        -   **endDate:** The end date of the range

-   ##### /exhibitions/location:

    -   **Method:** GET
    -   **Summary:** Get exhibitions by location
    -   **Parameters:**
        -   **location:** The location to filter exhibitions by

-   ##### /exhibitions/{exhibitionId}/plants:

    -   **Method:** GET
    -   **Summary:** Get plants by exhibition
    -   **Parameters:**
        -   **exhibitionId:** The ID of the exhibition to filter plants by

-   Plants API Endpoints

-   ##### /plants/{plantId}:

    -   **Method:** GET
    -   **Summary:** Get a plant by ID
    -   **Parameters:**
        -   **plantId:** The ID of the plant to retrieve

-   ##### /plants/{plantId}:

    -   **Method:** PUT
    -   **Summary:** Update a plant by ID
    -   **Parameters:**
        -   **plantId:** The ID of the plant to update

-   ##### /plants/{plantId}:

    -   **Method:** DELETE
    -   **Summary:** Delete a plant by ID
    -   **Parameters:**
        -   **plantId:** The ID of the plant to delete

-   ##### /plants:

    -   **Method:** GET
    -   **Summary:** Get all plants

-   ##### /plants:

    -   **Method:** POST
    -   **Summary:** Create a new plant
    -   **Parameters:**
        -   **Plant:** The plant information

-   ##### /plants/{plantId}/exhibitions:

    -   **Method:** GET
    -   **Summary:** Get exhibitions by plant
    -   **Parameters:**
        -   **plantId:** The ID of the plant to filter exhibitions by

-   ##### /plants/season:

    -   **Method:** GET
    -   **Summary:** Get plants by season
    -   **Parameters:**
        -   **season:** The season to filter plants by

-   ##### /plants/{plantId}/events:

    -   **Method:** GET
    -   **Summary:** Get events by plant
    -   **Parameters:**
        -   **plantId:** The ID of the plant to filter events by

-   Reviews API Endpoints

-   ##### /reviews:

    -   **Method:** POST
    -   **Summary:** Add a review for an item
    -   **Parameters:**
        -   **itemId:** The ID of the item for which the review is being added

-   ##### /reviews/item/{itemId}:

    -   **Method:** GET
    -   **Summary:** Get reviews by item
    -   **Parameters:**
        -   **itemId:** The ID of the item to filter reviews by

-   ##### /reviews/user/{username}:

    -   **Method:** GET
    -   **Summary:** Get reviews by user
    -   **Parameters:**
        -   **username:** The ID of the user to filter reviews by

-   Security and Authentication API Endpoints

-   ##### /security/authenticate:

    -   **Method:** POST
    -   **Summary:** Authenticate a user

-   ##### /security/authorize:

    -   **Method:** POST
    -   **Summary:** Authorize a user based on role
    -   **Parameters:**
        -   **username:** The ID of the user to authorize
        -   **role:** The role to authorize

-   ##### /security/register:

    -   **Method:** POST
    -   **Summary:** Register a new user

-   User API Endpoints

-   ##### /users:

    -   **Method:** GET
    -   **Summary:** Get all users

-   ##### /users/{username}:

    -   **Method:** GET
    -   **Summary:** Get a user by ID
    -   **Parameters:**
        -   **username:** The ID of the user to retrieve
    -   **Method:** DELETE
    -   **Summary:** Delete a user by ID
    -   **Parameters:**
        -   **username:** The ID of the user to delete
    -   **Method:** PUT
    -   **Summary:** Update a user by ID
    -   **Parameters:**
        -   **username:** The ID of the user to update
    -   **Request Body:** User details

-   ##### /users/email:

    -   **Method:** GET
    -   **Summary:** Get a user by email
    -   **Parameters:**
        -   **userEmail:** The email address of the user to retrieve

-   ##### /users/phone:

    -   **Method:** GET
    -   **Summary:** Get a user by phone number
    -   **Parameters:**
        -   **userPhone:** The phone number of the user to retrieve

-   Feedback API Endpoints

-   ##### /feedback/reportIssue:

    -   **Method:** POST
    -   **Summary:** Report an issue for an item
    -   **Parameters:**
        -   **itemId:** The ID of the item for which the issue is being reported

-   ##### /feedback/item/{itemId}:

    -   **Method:** GET
    -   **Summary:** Get feedback by item
    -   **Parameters:**
        -   **itemId:** The ID of the item to filter feedback by

-   ##### /feedback/generateReport:

    -   **Method:** GET
    -   **Summary:** Generate a report of feedback within a date range
    -   **Parameters:**
        -   **startDate:** The start date of the date range
        -   **endDate:** The end date of the date range

### Statecharts

Our statecharts contribute to the dynamic nature of BotaniqScape, orchestrating user interactions and experiences.

🏗️ **Important Mention:** Currently Work in Progress.

### SHACL Validation

SHACL validation ensures the integrity and quality of RDFa data, enhancing the reliability of BotaniqScape.

🏗️ **Important Mention:** Currently Work in Progress.

## External Data Sources

### Public Web Services

Explore a wealth of botanical information through public web services integrated into BotaniqScape.

#### [DBpedia](https://www.dbpedia.org/)

Access comprehensive botanical data from [DBpedia](https://www.dbpedia.org/), enriching your knowledge of plant species.

BotaniqScape users will be able to ask complex questions which will be forwarded via a SPARQL Query to [DBpedia](https://www.dbpedia.org/).

#### [Wikidata](https://www.wikidata.org/wiki/Wikidata:Main_Page)

Discover plant-related information sourced from [Wikidata](https://www.wikidata.org/wiki/Wikidata:Main_Page), contributing to a global knowledge repository.

BotaniqScape users will be able to ask complex questions which will be forwarded via a SPARQL Query to [Wikidata](https://www.wikidata.org/wiki/Wikidata:Main_Page).

#### [garden.org](https://garden.org/)

Visit [garden.org](https://garden.org/) for a curated collection of gardening resources and community engagement.

BotaniqScape users will be able to navigate to [garden.org](https://garden.org/) in order to find more granular information about their favorite plants.

## Linked Data Principles in BotaniqScape

BotaniqScape embodies the principles of Linked Data, transforming the exploration of botanical wonders into an interconnected and discoverable journey. Here's how the application meticulously aligns with each fundamental principle:

### Use URIs as Names for Things

Each botanical garden, attraction, tour, and comment in BotaniqScape is uniquely identified with URIs, ensuring global recognition and persistent identification throughout the platform.

### Use HTTP URIs

BotaniqScape employs HTTP URIs exclusively, allowing for easy dereferencing to retrieve direct information about any identified resource within the application.

### Provide Useful Information Using Standardized Formats

The application embraces RDFa as a standardized and machine-readable format, offering enhanced flexibility and extensibility for the representation of botanical data.

### Include Links to Other URIs

BotaniqScape strategically incorporates links within its data, establishing a comprehensive network of interconnected botanical information. Users can navigate seamlessly between resources, enhancing the exploration experience.

### Link to Other Data Sources

Going beyond its dataset, BotaniqScape extends its reach by linking to external data sources. This collaborative approach contributes to the creation of a decentralized and distributed web of interlinked botanical data.

Through these deliberate implementations, BotaniqScape stands as a testament to the principles of Linked Data, fostering an open, interconnected, and accessible platform for botanical exploration. Users are invited to delve into a world where every plant tells a story, and every connection enriches the collective botanical experience.

## Preliminary Considerations for Web Application Development

### Frameworks and Technologies Used

BotaniqScape leverages cutting-edge frameworks and technologies to deliver a robust web application experience. Here are some of the key technologies:

#### Dart

Dart, a powerful programming language optimized for building mobile, desktop, server, and web applications.

**Reasoning:** Dart was chosen for its efficiency in developing cross-platform applications, enabling a seamless and consistent user experience across different devices.

#### Flutter

Flutter, an open-source UI software development toolkit by Google for building natively compiled applications for mobile, web, and desktop from a single codebase.

**Reasoning:** Flutter provides a single codebase for multiple platforms, reducing development time and ensuring a consistent UI/UX across various devices.

#### Java

Java, a widely-used, class-based, object-oriented programming language for developing mobile, web, and enterprise applications.

**Reasoning:** Java's versatility and platform independence make it a reliable choice for building scalable and robust backend services in the BotaniqScape app.

#### Spring Framework

Spring, a comprehensive framework for Java development that provides infrastructure support, ensuring a smooth and efficient application development process.

**Reasoning:** Spring simplifies development tasks and promotes good design practices, contributing to the overall reliability and maintainability of BotaniqScape's backend.

#### DynamoDB

DynamoDB, a fully managed NoSQL database service by AWS, providing seamless and scalable data storage.

**Reasoning:** DynamoDB's serverless architecture and automatic scaling align with BotaniqScape's requirements for efficient and scalable data storage.

#### AWS Amplify

AWS Amplify, a set of tools and services for building scalable and secure cloud-powered serverless applications.

**Reasoning:** AWS Amplify simplifies the integration of serverless services, providing a streamlined development experience and enhancing the overall scalability of BotaniqScape.

#### IAM Roles

Identity and Access Management (IAM) Roles, enabling fine-grained access control to AWS resources.

**Reasoning:** IAM Roles enhance security by ensuring that only authorized entities have access to specific resources within the AWS infrastructure supporting BotaniqScape.

#### Amazon SNS

Amazon Simple Notification Service (SNS), a fully managed messaging service for distributed applications.

**Reasoning:** SNS facilitates seamless communication and notifications within the BotaniqScape system, contributing to an enhanced user experience.

#### AWS Lambda

AWS Lambda, a serverless compute service allowing the execution of code in response to events without the need for provisioning or managing servers.

**Reasoning:** Lambda functions offer scalability and cost-effectiveness, enabling BotaniqScape to efficiently handle varying workloads without the need for manual intervention.

#### Amazon S3

Amazon Simple Storage Service (S3), providing scalable object storage for data backup, archival, and analytics.

**Reasoning:** S3 offers reliable and scalable storage for BotaniqScape's media assets, ensuring efficient access and retrieval of images and other resources.

### Development Methodology

The development methodology employed in crafting BotaniqScape ensures efficiency and quality in every aspect.

#### Agile Methodology

Agile methodology is an iterative and flexible approach to software development that prioritizes collaboration, customer feedback, and the ability to adapt to changing requirements.

**Reasoning:** Agile methodology was chosen for BotaniqScape to promote rapid development cycles, enhance collaboration between development teams, and allow for quick adaptation to evolving project needs. This ensures that the development process remains responsive to user feedback and changing requirements, ultimately delivering a more customer-centric and high-quality application.

### Security Considerations

Security is a top priority in the development of BotaniqScape, safeguarding user data and interactions.

#### Data Encryption

All sensitive user data, including personal information and login credentials, undergoes robust encryption processes to ensure confidentiality and prevent unauthorized access.

#### Access Control

Access control mechanisms are implemented to restrict system access based on user roles, ensuring that users have appropriate permissions for their actions.

#### User Authentication

BotaniqScape employs secure authentication protocols, such as multi-factor authentication, to verify the identity of users and prevent unauthorized account access.

### Scalability and Performance Considerations

Ensuring a responsive and scalable application is a priority for our small but dynamic development team at BotaniqScape. Here's our approach:

### Code Efficiency

We focus on writing clean, efficient code to optimize resource usage and improve overall application speed.

### Smart Caching Strategies

Implementing intelligent caching mechanisms to reduce redundant computations and enhance response times.

### Database Tuning

Optimizing database queries and ensuring efficient data retrieval by employing appropriate indexing and data organization techniques.

### Cloud Scalability

Utilizing cloud services for scalable infrastructure, allowing us to adapt to varying workloads without compromising performance.

### Continuous Monitoring

Implementing continuous monitoring tools to track performance metrics, ensuring quick identification and resolution of any potential issues.

## Detailed Analysis of Data Handling and Processing

### Data Collection, Processing, and Storage

BotaniqScape employs robust data handling processes, ensuring efficient collection, processing, and secure storage.

Our system carefully collects botanical information, processes it through optimized algorithms, and securely stores the data to maintain integrity and confidentiality.

### Data Validation and Sanitization

Stringent data validation and sanitization protocols are implemented to maintain data accuracy and integrity.

BotaniqScape validates incoming data to ensure it adheres to predefined standards, and thorough sanitization procedures are in place to prevent security vulnerabilities and maintain the quality of stored information.

### Error Handling and Exceptions

BotaniqScape incorporates robust error handling mechanisms to ensure a seamless user experience even in unforeseen circumstances.

Our application is equipped to handle errors and exceptions gracefully, providing users with informative feedback and maintaining the overall stability and reliability of the system.

## Authors

### Alex Amarandei

![Alex Amarandei](images/circle-image-alex.jpeg)

I am keen on lifelong learning and I try to expand my field of knowledge with every occasion. I am a hard worker and a proficient Team Player ready to tackle any kind of interesting challenges!

**Socials:** [GitHub](https://github.com/Alex-Amarandei), [LinkedIn](https://linkedin.com/in/alex-amarandei)

### Andrei Zaharia

![Andrei Zaharia](images/circle-image-andrei.jpeg)

Devoted software engineer with a passion for problem-solving. Coding enthusiast, always up for a coding challenge, and forever curious about the next big thing in tech.

**Socials:** [GitHub](https://github.com/Naclyy), [LinkedIn](https://www.linkedin.com/in/andrei-zaharia-a34aa217a/)

## Acknowledgements

We extend our heartfelt gratitude to [our instructor](https://profs.info.uaic.ro/~busaco/profile.html) whose expertise illuminated our path during the master's degree [Web Application Development Course](https://profs.info.uaic.ro/~busaco/teach/courses/wade/).

Special thanks to our fellow students for their collaborative spirit and innovative ideas that shaped BotaniqScape.

Our families and friends provided unwavering support, and to the lines of code and bugs conquered - you are the unsung heroes.

**BotaniqScape** is a testament to collective effort, passion, and resilience, reflecting our shared journey in the world of software engineering.

## References

Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam hendrerit justo vel tortor venenatis, ac cursus tortor facilisis...

## License

[The MIT License](https://opensource.org/license/mit/)
