# Assignment 06 (Week 06 — Capstone): React.js Modern Frontend Application

- **Difficulty Level:** Level 6 — Advanced+ (Course Capstone Project)
- **Estimated Time:** 12–15 Hours
- **Core Topics Covered:** React.js (Vite Setup), JSX, Reusable Components & Props, State Management (`useState`), Side Effects & API Fetching (`useEffect`), Derived State, Custom Hooks (`useLocalStorage` / `useDebounce`), Controlled Forms, Component Composition, and Styling with **Tailwind CSS** (or Bootstrap 5).

---

## Objective

Build a complete **Interactive Course & Tech Store Single-Page Application (SPA) in React.js** (`TeachLab Academy & Store Portal`) where students can browse courses/products fetched from an API (or rich dataset), filter by category and price, search in real time, bookmark favorites, manage a live enrollment/shopping cart with persisted state, and submit a custom course proposal form.

---

## Step-by-Step Tasks

### Step 1: Vite + React.js + Tailwind CSS Project Setup
1. Scaffold a new React project using Vite:
   ```bash
   npm create vite@latest assignment-06-react-capstone -- --template react
   ```
2. Configure **Tailwind CSS** (or Bootstrap 5) and organize `src/` cleanly:
   ```text
   src/
   ├── components/
   │   ├── Navbar.jsx
   │   ├── HeroBanner.jsx
   │   ├── FilterBar.jsx
   │   ├── CourseCard.jsx
   │   ├── CartDrawer.jsx
   │   ├── AddCourseModal.jsx
   │   └── Footer.jsx
   ├── hooks/
   │   └── useLocalStorage.js
   ├── data/
   │   └── coursesData.js
   ├── App.jsx
   └── main.jsx
   ```

### Step 2: Component Architecture & Props
1. **`Navbar.jsx`:** Receives `cartCount`, `favoritesCount`, `darkMode`, `onToggleDarkMode`, and `onOpenCart` as props. Displays live badge counters.
2. **`CourseCard.jsx`:** Receives a `course` object (`id`, `title`, `instructor`, `category`, `level`, `price`, `rating`, `duration`, `thumbnail`) plus callback props (`onAddToCart`, `onToggleFavorite`, `isFavorite`).
   - Display a `"Beginner" / "Intermediate" / "Advanced"` badge with conditional Tailwind classes.

### Step 3: Interactive Filtering, Searching & Sorting (`useState` + Derived State)
1. In `App.jsx` (or a custom hook), manage state for:
   - `searchQuery` (live search by title or instructor)
   - `selectedCategory` (`All`, `Frontend`, `Backend`, `React.js`, `UI/UX`, `Full-Stack`)
   - `selectedLevel` (`All`, `Beginner`, `Intermediate`, `Advanced`)
   - `sortBy` (`popular`, `price-low`, `price-high`, `rating`)
2. Compute `filteredCourses` as **derived state** (do not duplicate the course array in state!) and render an `"Empty State"` component with a `"Reset Filters"` button when no courses match.

### Step 4: Side Effects & API Integration (`useEffect`) + Custom Hook (`useLocalStorage`)
1. Write a reusable custom hook `useLocalStorage(key, initialValue)` that synchronizes React state with `window.localStorage`.
2. Use `useLocalStorage` to persist:
   - `cartItems` (array of enrolled courses with quantities)
   - `favoriteIds` (bookmarked course IDs)
   - `darkMode` (`true` / `false`)
3. Use `useEffect` to either fetch external data (e.g., from `https://fakestoreapi.com/products` or a local JSON endpoint) with `isLoading` and `error` states, and update `document.title` dynamically with the number of items in the cart.

### Step 5: Interactive Cart Drawer & Controlled "Add New Course" Form
1. **`CartDrawer.jsx`:** Slide-over drawer showing selected courses, remove item button, subtotal calculation, 10% promo code input (`TEACHLAB10`), and a `"Complete Enrollment"` button that shows a confirmation state.
2. **`AddCourseModal.jsx` (Controlled Form):** Allow an instructor to add a new course card dynamically into the state list with controlled inputs (`value` + `onChange`) and validation errors.

---

## Grading Rubric (100 Points)

| Criteria | Points |
| :--- | :---: |
| Clean Component Decomposition & Props Flow (minimum 6 reusable components) | 25 |
| `useState` & Derived State (Search, Category/Level Filters, Sort, Empty State) | 25 |
| `useEffect` Lifecycle & Custom `useLocalStorage` Hook (Cart, Favorites, Dark Mode) | 20 |
| Interactive Cart Drawer (Add/Remove, Promo Code, Total Calculation) & Controlled Form | 20 |
| Responsive Tailwind CSS / Bootstrap 5 UI, Dark Mode & Clean React Keys/Conventions | 10 |

---

## Bonus Challenge (+15 Points)
- Add **React Router (`react-router-dom`)** with 3 routes: `/` (Catalog), `/course/:id` (Dynamic Course Detail Page), and `/favorites` (Saved Courses Page), or deploy your app live to **Vercel / Netlify** and include the live URL in your `README.md`!
