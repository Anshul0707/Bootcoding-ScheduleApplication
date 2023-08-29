# API Contract for Weekly Schedules


### Get All Weekly Schedules

- **Method:** GET
- **Path:** `/api/weekly-schedule`
- **Response:** List of `WeeklySchedule` objects

### Get Weekly Schedule by ID

- **Method:** GET
- **Path:** `/api/weekly-schedule/{id}`
- **Response:** `WeeklySchedule` object

### Create Weekly Schedule

- **Method:** POST
- **Path:** `/api/weekly-schedule`
- **Request Body:** `WeeklySchedule` object
- **Response:** Created `WeeklySchedule` object

### Update Weekly Schedule

- **Method:** PUT
- **Path:** `/api/weekly-schedule/{id}`
- **Request Body:** Updated `WeeklySchedule` object
- **Response:** Updated `WeeklySchedule` object

### Delete Weekly Schedule

- **Method:** DELETE
- **Path:** `/api/weekly-schedule/{id}`
- **Response:** No content
