# Assignment 03 (Week 03): Bootstrap 5 Rapid UI Engineering

- **Difficulty Level:** Level 3 — Intermediate
- **Estimated Time:** 6–8 Hours
- **Core Topics Covered:** Bootstrap 5 CDN setup, 12-Column Responsive Grid (`.container`, `.row`, `.col-12`, `.col-md-6`, `.col-lg-4`), Responsive Navbar & Offcanvas Drawer, Cards, Badges, Carousel/Hero, Accordion FAQ, Modal Dialogs, Nav Tabs, Toast/Alert components, and Bootstrap Form Validation (`.needs-validation`, `.form-floating`).

---

## Objective

Build a **2-Page Responsive Tech Store & Course Admin Interface** using **Bootstrap 5.3** with minimal custom CSS—learning how to compose production-ready layouts, interactive modals, offcanvas drawers, accordions, and validated forms using Bootstrap's grid, components, and utility classes.

---

## Step-by-Step Tasks

### Step 1: Bootstrap 5 Setup & Responsive Navbar + Offcanvas Cart
1. Create `index.html` (Storefront) and `dashboard.html` (Admin Panel) and include the **Bootstrap 5.3 CSS & JS Bundle CDN** (plus Bootstrap Icons CDN).
2. Build a sticky `.navbar.navbar-expand-lg` with:
   - Brand logo, collapsible navigation links, search input group (`.input-group`), and a `"Cart (3)"` button that triggers a Bootstrap **Offcanvas right drawer** (`data-bs-toggle="offcanvas"`).
3. Inside the Offcanvas drawer, display 3 sample cart items using `.list-group`, a total price row, and a `"Proceed to Checkout"` button that opens a Checkout Modal.

### Step 2: Hero Banner & Category Filter Pills
1. Create a hero section using `.container.py-5`, `.row.align-items-center.g-5`, and two `.col-lg-6` columns.
2. Add category filter tabs using Bootstrap **Nav Pills** (`All Products`, `Laptops`, `Accessories`, `Monitors`, `Courses`).

### Step 3: 12-Column Responsive Product Grid (8 Product Cards)
1. Use `.row.row-cols-1.row-cols-sm-2.row-cols-lg-4.g-4` to display **8 Product Cards** (`.card.h-100.shadow-sm`).
2. Each card must include:
   - Top badge (`.badge.text-bg-success` for `"New"` or `.text-bg-danger` for `"-20%"`), product image/placeholder, title, star rating, price, and two buttons: `"Quick View"` (opens a Bootstrap **Modal** `#quickViewModal`) and `"Add to Cart"`.

### Step 4: Interactive Modal, Accordion FAQ & Pricing Table
1. **Quick View Modal (`.modal.fade`):** Shows product details, specification table, quantity selector, and `"Add to Cart"`.
2. **FAQ Section (`.accordion`):** Create a 5-question FAQ using Bootstrap's Accordion component (`data-bs-toggle="collapse"`).

### Step 5: Admin Dashboard Page (`dashboard.html`) & Validated Form
1. Build `dashboard.html` with a sidebar + main content layout:
   - **4 KPI Summary Cards** (`.col-sm-6.col-xl-3`) showing Total Revenue, Active Orders, New Students, and Conversion Rate with `.progress` bars.
   - **Recent Orders Table** using `.table.table-hover.table-striped.align-middle` wrapped in `.table-responsive`, with status badges (`Paid`, `Pending`, `Shipped`).
   - **"Add New Product" Form** using Bootstrap Floating Labels (`.form-floating`), `.input-group`, and client-side Bootstrap validation classes (`.needs-validation`, `.valid-feedback`, `.invalid-feedback`).

---

## Grading Rubric (100 Points)

| Criteria | Points |
| :--- | :---: |
| Proper Bootstrap 5 Grid usage (`container`, `row`, `col-*`, `g-*` gutters) | 25 |
| Interactive Components (Navbar, Offcanvas Cart, Quick-View Modal, Accordion FAQ) | 30 |
| Admin Dashboard (`dashboard.html`) KPI Cards & `.table-responsive` Orders Table | 20 |
| Floating-Label Form with Bootstrap Validation states | 15 |
| Minimal custom CSS (proper use of Bootstrap spacing, flex, and color utilities) | 10 |

---

## Bonus Challenge (+10 Points)
- Add a Dark/Light theme toggle switch in the Navbar that switches `data-bs-theme="dark"` and `data-bs-theme="light"` on the `<html>` element!
