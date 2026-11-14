# Assignment 01 (Week 01): HTML5 & Core CSS3 Foundations

- **Difficulty Level:** Level 1 — Basic (Beginner Friendly)
- **Estimated Time:** 4–6 Hours
- **Core Topics Covered:** HTML5 Document Boilerplate, Semantic Landmarks, Headings, Lists, Links, Images, HTML Tables, Accessible Forms, External CSS, Selectors, Typography, Color Palette, and the CSS Box Model (`margin`, `padding`, `border`, `box-sizing: border-box`).

---

## Objective

Build a clean, well-structured **Personal Developer Profile & Student Admission Portal** (`index.html` + `style.css`) using pure HTML5 and foundational CSS3—without Flexbox/Grid frameworks yet—so you master semantic markup, forms, tables, and the CSS Box Model first.

---

## Step-by-Step Tasks

### Step 1: Project Setup & Semantic Skeleton
1. Create a folder named `Assignment-01-HTML-CSS-Basics`.
2. Inside it, create two files: `index.html` and `style.css`, and link `style.css` inside `<head>`.
3. Add the proper HTML5 boilerplate (`<!DOCTYPE html>`, `<html lang="en">`, `<meta charset="UTF-8">`, `<meta name="viewport" ...>`, and a `<title>`).
4. Structure the `<body>` using semantic HTML5 landmarks:
   - `<header>` — Site title, tagline, and profile avatar image (`<img>` with proper `alt` text and `width`/`height`).
   - `<nav>` — Unordered list (`<ul>`) of internal anchor links (`#about`, `#skills`, `#schedule`, `#register`, `#contact`).
   - `<main>` — Contains the 4 main `<section>` blocks below.
   - `<footer>` — Copyright notice, email link (`mailto:`), and social profile links (`target="_blank" rel="noopener"`).

### Step 2: Section 1 & 2 — About Me & Technical Skills (`#about`, `#skills`)
1. In `#about`, write a short bio using `<h2>`, two `<p>` paragraphs, and a `<blockquote>` with your favorite quote about coding.
2. In `#skills`, include:
   - An unordered list (`<ul>`) of **Frontend Technologies** you are learning (HTML5, CSS3, Bootstrap 5, Tailwind CSS, JavaScript, React.js).
   - An ordered list (`<ol>`) of your **Top 3 Learning Goals** for this course.

### Step 3: Section 3 — Weekly Course Schedule Table (`#schedule`)
1. Create a semantic `<table>` showing a 6-week Frontend Bootcamp schedule.
2. Use `<caption>`, `<thead>`, `<tbody>`, and `<tfoot>`.
3. Include columns for: **Week**, **Topic**, **Lab Activity**, **Days/Timings**, and **Difficulty Level**.
4. Use `colspan` in `<tfoot>` to display a summary row (e.g., *"Total Duration: 6 Weeks / 36 Hours of Live Labs"*).

### Step 4: Section 4 — Student Course Registration Form (`#register`)
1. Build an accessible `<form action="#" method="post">`.
2. Group related fields with `<fieldset>` and `<legend>`:
   - **Personal Info:** Full Name (`type="text"`, `required`), Email (`type="email"`, `required`), Phone (`type="tel"`), Date of Birth (`type="date"`).
   - **Course Track:** `<select>` dropdown (Frontend Basics, CSS Frameworks, JavaScript Mastery, Full React Track).
   - **Preferred Batch Timing:** Radio buttons (`type="radio"`, shared `name="batch"`) for Morning, Evening, or Weekend.
   - **Prior Knowledge:** Checkboxes (`type="checkbox"`) for HTML, CSS, JS, Git.
   - **Why do you want to join?** `<textarea rows="4">`.
   - **Buttons:** Submit (`<button type="submit">`) and Reset (`<button type="reset">`).
3. **Important:** Every input must have a matching `<label for="id">`.

### Step 5: Core CSS Styling (`style.css`)
1. Add a universal box-sizing reset at the top:
   ```css
   *, *::before, *::after {
       margin: 0;
       padding: 0;
       box-sizing: border-box;
   }
   ```
2. Set a clean font family (`system-ui` or Google Font `Inter`), `line-height: 1.6`, and a soft page background color (`#f4f8f9`).
3. Center the page content inside a `.container` class using `max-width: 960px; margin: 0 auto; padding: 2rem;`.
4. Style each `<section>` as a clean white card with `background: #ffffff`, `padding: 2rem`, `margin-bottom: 1.5rem`, `border-radius: 14px`, and a subtle `box-shadow`.
5. Style the `<table>` with `border-collapse: collapse`, padded cells, a colored header row, and alternating row striping (`tbody tr:nth-child(even)`).
6. Style form inputs with full width (`width: 100%`), comfortable padding (`0.75rem`), rounded borders, and a visible `:focus` border/outline color.
7. Style the Submit button with a `:hover` effect.

---

## Grading Rubric (100 Points)

| Criteria | Points |
| :--- | :---: |
| Semantic HTML5 tags (`header`, `nav`, `main`, `section`, `footer`) & valid boilerplate | 20 |
| Accessible Table (`thead`, `tbody`, `tfoot`, `th`, zebra striping) | 20 |
| Accessible Form (`fieldset`, `legend`, `<label for>`, validation attributes) | 25 |
| CSS Box Model, Typography, Colors & Card Spacing (`margin`, `padding`, `border-radius`) | 25 |
| Code formatting, indentation & descriptive comments | 10 |

---

## Bonus Challenge (+10 Points)
- Add `:user-invalid` or `:focus-visible` styling to the form inputs so invalid fields show a red border only after the user interacts with them.
