## To-Do List Web Application
This repository contains both Manual and Automation testing assets for a sample To-Do List web application. It shows structured QA practices, covering test strategy, functional/UI/boundary test cases, bug reports, and Selenium-based test automation.

## Expected Deliverables:
- PDF of Manual test cases, bug report, and strategy.
- A short video demo (screen recording) of the automation script in action.
- Automation scripts file.

## Tools Used
- Manual Testing: Excel word.
- Automation: Selenium WebDriver, Java
- Reporting: Terminal logs, Screenshots

## Steps to Run Automation
1. Clone this repo
2. Run: `pip install -r requirements.txt`
3. Run test: `pytest tests/test_todo.py`

## Assumptions Made
- App allows adding, editing, mark as completed and deleting to-do items with login.
- App loads within 5 seconds.
