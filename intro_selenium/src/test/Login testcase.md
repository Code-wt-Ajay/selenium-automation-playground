# Login Test Cases

---

## TC001 – Positive Login Test
**Module:** Login  
**Type:** Positive  

### Steps
1. Open `https://practicetestautomation.com/practice-test-login/`
2. Enter username `student`
3. Enter password `Password123`
4. Click **Submit**

### Expected
- URL contains `/logged-in-successfully/`
- Page shows success text (`Congratulations` or `successfully logged in`)

### Status
✅ Passed (automated in `Locators.java`)

---

## TC002 – Invalid Username
**Module:** Login  
**Type:** Negative  

### Steps
1. Open `https://practicetestautomation.com/practice-test-login/`
2. Enter username `wrongUser`
3. Enter password `Password123`
4. Click **Submit**

### Expected
- Error message: `"Your username is invalid!"`
- User should remain on login page

### Status
⬜ Pending

---

## TC003 – Invalid Password
**Module:** Login  
**Type:** Negative  

### Steps
1. Open `https://practicetestautomation.com/practice-test-login/`
2. Enter username `student`
3. Enter password `wrongPass`
4. Click **Submit**

### Expected
- Error message: `"Your password is invalid!"`
- User should remain on login page

### Status
⬜ Pending

---

## TC004 – Invalid Username & Password
**Module:** Login  
**Type:** Negative  

### Steps
1. Open `https://practicetestautomation.com/practice-test-login/`
2. Enter username `wrongUser`
3. Enter password `wrongPass`
4. Click **Submit**

### Expected
- Error message: `"Your username is invalid!"` (default system behavior)
- User should remain on login page

### Status
⬜ Pending
