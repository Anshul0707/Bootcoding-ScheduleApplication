# API Contract for Daily Schedules 

### Get All Daily Schedules

- **Method:** GET
- **Path:** `/api/daily-schedule`
- **Response:** List of `DailySchedule` objects

### Get Daily Schedule by ID

- **Method:** GET
- **Path:** `/api/daily-schedule/{id}`
- **Response:** `DailySchedule` object

### Create Daily Schedule

- **Method:** POST
- **Path:** `/api/daily-schedule`
- **Request Body:** `DailySchedule` object
- **Response:** Created `DailySchedule` object

### Update Daily Schedule

- **Method:** PUT
- **Path:** `/api/daily-schedule/{id}`
- **Request Body:** Updated `DailySchedule` object
- **Response:** Updated `DailySchedule` object

### Delete Daily Schedule

- **Method:** DELETE
- **Path:** `/api/daily-schedule/{id}`
- **Response:** No content
