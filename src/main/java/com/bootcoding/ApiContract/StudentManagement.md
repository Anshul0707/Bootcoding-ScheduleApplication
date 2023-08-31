# Student Management REST API Contract

## Get All Students

- **Endpoint:** `GET /students`
- **Description:** Get a list of all students.
- **Response:**
    - HTTP Status: 200 OK
    - Response Body: List of `Student` objects
    - Example Response Body:
      ```json
      [
        {
          "id": 1,
          "firstName": "John",
          "lastName": "Doe"
        },
        {
          "id": 2,
          "firstName": "Jane",
          "lastName": "Smith"
        }
      ]
      ```

## Get Student by ID

- **Endpoint:** `GET /students/{id}`
- **Description:** Get a student by their ID.
- **Response:**
    - HTTP Status:
        - 200 OK if student found
        - 404 Not Found if student not found
    - Response Body (if student found): `Student` object
    - Example Response Body (if student found):
      ```json
      {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe"
      }
      ```

## Create Student

- **Endpoint:** `POST /students`
- **Description:** Create a new student.
- **Request Body:** `Student` object (without ID)
- **Response:**
    - HTTP Status: 201 Created
    - Response Body: Created `Student` object
    - Example Request Body:
      ```json
      {
        "firstName": "Alice",
        "lastName": "Johnson"
      }
      ```
    - Example Response Body:
      ```json
      {
        "id": 3,
        "firstName": "Alice",
        "lastName": "Johnson"
      }
      ```

## Update Student by ID

- **Endpoint:** `PUT /students/{id}`
- **Description:** Update an existing student by their ID.
- **Request Body:** Updated `Student` object
- **Response:**
    - HTTP Status:
        - 200 OK if student updated
        - 404 Not Found if student not found
    - Response Body (if student updated): Updated `Student` object
    - Example Request Body:
      ```json
      {
        "firstName": "Robert",
        "lastName": "Brown"
      }
      ```
    - Example Response Body (if student updated):
      ```json
      {
        "id": 1,
        "firstName": "Robert",
        "lastName": "Brown"
      }
      ```

## Delete Student by ID

- **Endpoint:** `DELETE /students/{id}`
- **Description:** Delete a student by their ID.
- **Response:**
    - HTTP Status:
        - 204 No Content if student deleted
        - 404 Not Found if student not found
