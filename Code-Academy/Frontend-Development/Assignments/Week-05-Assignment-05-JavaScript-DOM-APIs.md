# Assignment 05 (Week 05): Interactive JavaScript (ES6+, DOM, LocalStorage & Fetch API)

- **Difficulty Level:** Level 5 — Advanced
- **Estimated Time:** 10–12 Hours
- **Core Topics Covered:** ES6+ Syntax (`let`/`const`, arrow functions, template literals, destructuring, spread/rest), Array Methods (`map`, `filter`, `reduce`, `find`, `sort`), DOM Selection & Creation, Event Delegation, Form Handling, `localStorage` Persistence, `async`/`await` + `fetch()` REST API calls, and Loading/Error UI states.

---

## Objective

Build a **2-in-1 Interactive Productivity & Developer Dashboard Web App** powered by vanilla **JavaScript (ES6+)** and styled with **Tailwind CSS** (or your custom CSS):
- **Part A (State & LocalStorage):** A **Smart Task & Expense Tracker** with live search, category filtering, summary calculations (`reduce()`), and `localStorage` persistence.
- **Part B (Async Fetch API):** A **Live GitHub Developer Finder** that queries the public GitHub REST API (`https://api.github.com/users/{username}`) and renders profile details and top repositories with proper loading skeletons and error handling.

---

## Step-by-Step Tasks

### Step 1: Project Architecture
1. Create `Assignment-05-JavaScript-DOM-APIs` with:
   - `index.html`
   - `js/app.js` (or modular `js/tracker.js` and `js/github.js` loaded with `<script type="module">`)
   - Styled with Tailwind CSS or clean custom CSS.

### Step 2: Part A — Smart Task & Expense Tracker (CRUD + Array Methods)
1. **Add Item Form:** Build a form with Title (`text`), Amount in PKR/USD (`number`), Type (`Income` or `Expense`), Priority/Category (`Work`, `Study`, `Bills`, `Project`), and Due Date (`date`).
2. **Validation:** Prevent empty titles or zero/negative amounts; show an inline validation message instead of `alert()`.
3. **Render List Dynamically:** Store items as an array of objects (`{ id, title, amount, type, category, date, completed }`) and render them into the DOM using `.map()`.
4. **Live Summary Cards (using `.filter()` & `.reduce()`):**
   - **Total Income**
   - **Total Expenses**
   - **Net Balance**
   - **Completed Tasks Count**
5. **Event Delegation:** Attach a single click listener on the list container to handle:
   - **Toggle Complete** (checkbox / button)
   - **Delete Item** (removes item from state array and re-renders)
   - **Edit Item** (populates form to update existing item)
6. **Search, Filter & Sort Controls:**
   - Live search input (`input` event) filtering by title.
   - Category filter dropdown (`All`, `Income`, `Expense`, `Completed`).
   - Sort dropdown (`Newest`, `Amount: High to Low`, `Amount: Low to High`).
7. **LocalStorage Persistence:** Save the array to `localStorage` on every change and load it automatically on `DOMContentLoaded`. Include a `"Clear All"` button with confirmation.

### Step 3: Part B — Live GitHub Developer Finder (`async/await` + `fetch()`)
1. Add a section/tab where the user can type a GitHub username (e.g., `torvalds`, `gaearon`, or your own GitHub username) and submit.
2. Write an `async function fetchGitHubProfile(username)` using `try / catch`:
   - Show a **Loading Spinner / Skeleton** while fetching.
   - Fetch user data from `https://api.github.com/users/${encodeURIComponent(username)}`.
   - Fetch the user's latest 6 repositories from `https://api.github.com/users/${encodeURIComponent(username)}/repos?sort=updated&per_page=6`.
   - Check `if (!response.ok)` and display a friendly `"User not found (404)"` or rate-limit message in the UI.
3. Render the user's avatar, name, bio, follower/following/repo counts, and a grid of their 6 latest repositories (name, stars, language, link).

---

## Grading Rubric (100 Points)

| Criteria | Points |
| :--- | :---: |
| ES6+ Usage (`const`/`let`, destructuring, template literals, `map`/`filter`/`reduce`) | 20 |
| CRUD Operations (Add, Toggle, Edit, Delete) & Event Delegation | 25 |
| Live Search, Category Filtering, Sorting & `localStorage` Persistence | 20 |
| Async `fetch()` GitHub API Integration with Loading & Error (`404`) Handling | 25 |
| Clean UI, Form Validation (no `alert()`) & Modular Code Organization | 10 |

---

## Bonus Challenge (+10 Points)
- Add a **300ms Debounce** function to the search bar and export/import the tracker data as a downloadable `.json` or `.csv` file!
