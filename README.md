# WritersRoom

WritersRoom focuses on facilitating collaborative idea generation and development within troupes and public settings while maintaining user anonymity where necessary. It emphasizes a user-friendly interface, secure user management, real-time collaboration, and a structured workflow that guides users from idea submission to development.

# Writers Room MVP Feature List

Below is a comprehensive list of features that the WritersRoom application should have in its **Minimum Viable Product (MVP)**. This list reflects all defined features, incorporating the latest revisions and excluding any features that were revised away.

---

## **1. User Management**

### **1.1 User Registration and Authentication**

- **Secure Registration:**
  - Users can create an account by providing:
    - **Username**
    - **Password**
    - **Profile Description**

- **Secure Login:**
  - Users can log in using their credentials.
  - Passwords are securely stored and handled.

### **1.2 User Profiles**

- **Profile Management:**
  - Users can view and edit their profile descriptions.
  - Users can update their account information.

### **1.3 Automatic Enrollment in Default Troupe**

- **Default "Public" Troupe:**
  - Upon registration, users are automatically added to a default troupe named **"Public"**.
  - All users are members of the "Public" troupe by default.
  - The "Public" troupe allows open collaboration and access to public meetings.

---

## **2. Troupe Management**

### **2.1 Creating and Managing Troupes**

- **Create New Troupe:**
  - Users can create new troupes by providing:
    - **Troupe Name**
    - **Description**
    - **Visibility Settings** (invite-only or open to join requests)

- **Troupe Roles:**
  - The user who creates the troupe is assigned the **Leader** role within that troupe.
  - Troupe Leaders can:
    - Invite users to join the troupe.
    - Assign the Leader role to other members.
    - Manage troupe membership.

### **2.2 Joining Troupes**

- **Request to Join:**
  - Users can request to join existing troupes if allowed by troupe settings.
  - Troupe Leaders can approve or deny join requests.

- **Invitations:**
  - Troupe Leaders can send invitations to users to join their troupe.
  - Users receive notifications of invitations and can accept or decline.

---

## **3. Meeting Management**

### **3.1 Creating Meetings**

- **Meeting Setup:**
  - Users can create meetings by providing:
    - **Project Title**
    - **Project Description**
    - **Selection of a Troupe** they are part of or choose to make the meeting **Public**.
    - **Minimum Number of Users** required to submit ideas.
    - **Minimum Number of Ideas per User** needed before the meeting can progress.

- **Meeting Initialization:**
  - Upon creation, the meeting enters the **Clown-Mode** phase.
  - Meeting becomes visible to the selected troupe or publicly if set.

### **3.2 Clown-Mode Phase**

- **Idea Submission:**
  - Users submit their ideas anonymously.
  - Each user must meet the minimum idea submission requirement.
  - The main meeting page displays progress indicators:
    - Number of users who have submitted ideas.
    - Total number of ideas submitted.
    - Remaining number of users/ideas needed to start the meeting.

- **Progress Monitoring:**
  - Real-time updates of submission progress.
  - Notifications can be sent to users who haven't submitted ideas.

### **3.3 Idea Presentation and Voting**

- **Randomized Idea Presentation:**
  - Once minimum requirements are met, the system randomizes and presents ideas anonymously.
  - Ideas are displayed one at a time to all meeting participants.

- **Voting Mechanism:**
  - All participants must **vote** on each idea (e.g., like or dislike).
  - Votes are anonymous.
  - The system requires all participants to cast their votes before proceeding to the next idea.

- **Results Display:**
  - After all ideas have been presented and voted on, aggregated voting results are displayed.
  - Authors remain anonymous at this stage.

### **3.4 Idea Discussion Phase**

- **Replies and Tagging:**
  - Participants can add **replies** to any idea.
  - When replying, users can add **tags** to categorize their input, such as:
    - **joke-beat-idea**
    - **premise-idea**
    - **format-idea**
    - Etc.

- **Threaded Discussions:**
  - Support for nested replies to facilitate in-depth discussions.

### **3.5 Idea Selection**

- **Selection by Meeting Leader:**
  - The meeting leader reviews ideas and discussions.
  - Selects ideas for further development.

- **Role Assignment:**
  - Authors of selected ideas are assigned the **Leader** role for their respective ideas.
  - Anonymity of these authors is lifted.

- **Transition to Edit Meetings:**
  - Each selected idea transitions into a separate **Edit Meeting**.
  - Participants can collaborate further on these ideas.

### **3.6 Edit Meetings**

- **Separate Development Spaces:**
  - Each selected idea has its own dedicated page.
  - Authors (now leaders) and participants can collaborate in developing the idea.

- **Collaboration Tools:**
  - Shared workspace for:
    - Document editing.
    - Brainstorming.
    - Version control (basic).

- **Discussion Threads:**
  - Similar to the main meeting discussion but focused on the specific idea.

- **Status Tracking:**
  - Edit Meetings have their own statuses (e.g., **Editing**, **Completed**).

---

## **4. Public Meetings Page**

### **4.1 Landing Page**

- **Default View:**
  - Upon logging in, users land on the **Public Meetings** page.
  - Displays all public meetings as posts.

### **4.2 Meeting Listings**

- **Meeting Information:**
  - Each meeting post displays:
    - **Project Title**
    - **Project Description**
    - **Creation Date**
    - **Meeting Status** (e.g., Clown-Mode, Voting, etc.)

- **Sorting and Navigation:**
  - Meetings are sorted by **creation date** in descending order.
  - Users can click on a meeting to view details and participate.

### **4.3 Participation in Public Meetings**

- **Joining Meetings:**
  - Users can join public meetings directly from the listings.
  - Upon joining, they become participants and can submit ideas.

- **Access Control:**
  - Only authenticated users can join and participate in meetings.
  - Guest users may view meeting listings but cannot interact.

---

## **5. Anonymity and Bias Reduction**

### **5.1 Anonymous Idea Submission**

- **Anonymity During Idea Submission:**
  - Users submit ideas without revealing their identity.
  - Author identity is hidden until after idea selection.

### **5.2 Anonymous Voting**

- **Confidential Voting:**
  - Votes are anonymous to prevent bias.
  - Individual votes are not displayed, only aggregated results.

### **5.3 Lifting Anonymity**

- **Post-Selection:**
  - Authors of selected ideas are revealed.
  - This allows them to lead the development of their ideas.

---

## **6. Real-Time Features**

### **6.1 WebSocket Integration**

- **Real-Time Updates:**
  - Use of WebSockets to provide real-time communication for:
    - Submission progress in Clown-Mode.
    - Coordinating voting results.
    - Live discussions during meetings.

- **Immediate Feedback:**
  - Participants receive instant updates without refreshing the page.

---

## **7. User Interface and Experience**

### **7.1 Responsive Design**

- **Device Compatibility:**
  - Application is optimized for desktop and mobile devices.
  - Responsive layouts adapt to various screen sizes.

### **7.2 Key UI Components**

- **Login and Registration Forms**

- **Dashboard:**
  - Overview of:
    - Active meetings.
    - Troupes the user is part of.
    - Notifications.

- **Meeting Pages:**
  - **Clown-Mode Interface:**
    - Idea submission form.
    - Progress indicators.
  - **Voting Interface:**
    - Idea display.
    - Voting buttons.
  - **Idea Discussion Interface:**
    - Threaded replies.
    - Tagging system.

- **Edit Meeting Pages:**
  - Dedicated space for selected ideas.
  - Collaboration tools and discussion threads.

### **7.3 Navigation**

- **Menu and Routing:**
  - Clear navigation bar with links to:
    - Public Meetings
    - My Meetings
    - Troupes
    - Profile
    - Notifications

- **Breadcrumbs and Links:**
  - Easy navigation between main meetings and edit meetings.

---

## **8. Security and Privacy**

### **8.1 Secure Authentication and Authorization**

- **Password Security:**
  - Passwords are encrypted and stored securely.

- **Session Management:**
  - Use of JWT tokens for managing user sessions.

### **8.2 Role-Based Access Control**

- **Troupe Roles:**
  - Roles defined at the troupe level (Leader, Member).
  - Permissions assigned based on roles.

- **Meeting Permissions:**
  - Access to meetings and actions within meetings are controlled.

### **8.3 Data Protection**

- **Privacy Compliance:**
  - Adherence to data protection regulations.
  - Users' personal data is handled responsibly.

- **Anonymity Assurance:**
  - Systems in place to maintain anonymity where required.

---

## **9. Notifications and Communication**

### **9.1 In-App Notifications**

- **Event-Based Notifications:**
  - Users receive notifications for:
    - Troupe invitations or join requests.
    - Meeting invitations.
    - Changes in meeting status.
    - Idea selections.

### **9.2 Real-Time Alerts**

- **Live Updates:**
  - Notifications appear in real-time within the application.

---

## **10. Record Keeping and History**

### **10.1 Meeting Records**

- **Data Persistence:**
  - All meetings, ideas, votes, and discussions are recorded.

- **Access to Past Meetings:**
  - Users can view previous meetings and their content.

### **10.2 Idea and Discussion History**

- **Version Tracking:**
  - Changes in ideas and edits during edit meetings are tracked.

- **Archiving:**
  - Completed meetings and edit sessions are archived for future reference.

---

## **11. Testing and Quality Assurance**

### **11.1 Automated Testing**

- **Unit Testing:**
  - Tests for individual components and services on both front-end and back-end.

- **Integration Testing:**
  - Ensuring that different parts of the application work together seamlessly.

### **11.2 Performance Testing**

- **Load Testing:**
  - Assessing application performance under expected load conditions.

### **11.3 Usability Testing**

- **User Feedback:**
  - Gathering feedback to improve user experience and interface design.

---

## **12. Deployment and Scalability**

### **12.1 Deployment Setup**

- **Server Configuration:**
  - Application is deployed on a server configured to handle WebSocket connections.

- **Environment Management:**
  - Separate environments for development, testing, and production.

### **12.2 Scalability Considerations**

- **Efficient Resource Usage:**
  - Application designed to handle increasing numbers of users and data.

- **Database Optimization:**
  - Efficient queries and indexing to ensure quick data retrieval.

---

## **13. Additional Considerations**

### **13.1 User Experience Enhancements**

- **Intuitive Design:**
  - User interfaces are designed for ease of use and clarity.

- **Feedback Mechanisms:**
  - Users receive confirmation messages after actions (e.g., idea submission).

### **13.2 Continuous Improvement**

- **Agile Development:**
  - Application development follows agile methodologies, allowing iterative improvements.

- **Future Features Planning:**
  - MVP lays the groundwork for adding more advanced features in future updates.

---