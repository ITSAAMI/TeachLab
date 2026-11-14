# Assignment 04 (Week 04): Tailwind CSS Utility-First Design System & Dark Mode

- **Difficulty Level:** Level 4 — Intermediate to Advanced
- **Estimated Time:** 8–10 Hours
- **Core Topics Covered:** Tailwind CSS Utility-First Workflow, Responsive Prefixes (`sm:`, `md:`, `lg:`, `xl:`), State Modifiers (`hover:`, `focus-visible:`, `group-hover:`), Gradient & Glassmorphism Utilities (`backdrop-blur`, `bg-gradient-to-r`, `bg-clip-text`), Bento Grid Layouts (`col-span-2`, `row-span-2`), and Dark Mode (`dark:` classes + theme toggle).

---

## Objective

Design and build a **Modern AI / SaaS Startup Landing Page (`PulseAI`)** using **Tailwind CSS**—without writing custom CSS selectors—featuring a Bento feature grid, interactive hover groups, responsive pricing cards, testimonials, and full **Light / Dark Mode** support.

---

## Step-by-Step Tasks

### Step 1: Tailwind CSS Setup & Custom Theme Tokens
1. Create a folder `Assignment-04-Tailwind-CSS` with `index.html`.
2. Load Tailwind CSS (via Play CDN or Vite CLI setup) and configure `darkMode: 'class'` along with a custom brand color palette (`brand-50` through `brand-900`) and font family (`Inter`).

### Step 2: Sticky Glass Navbar with Dark Mode Toggle
1. Build a sticky header (`sticky top-0 z-50 backdrop-blur-md bg-white/75 dark:bg-slate-900/80 border-b border-slate-200 dark:border-slate-800`).
2. Include the brand logo, navigation links with `hover:text-teal-600 dark:hover:text-teal-400 transition-colors`, a Dark/Light theme toggle button (that toggles the `dark` class on `document.documentElement`), and a gradient CTA button.

### Step 3: Hero Section with Gradient Headline & App Preview Mockup
1. Build a centered or split hero section using responsive spacing (`py-16 md:py-24`) and typography (`text-4xl sm:text-5xl lg:text-6xl font-extrabold tracking-tight`).
2. Highlight key words with gradient text (`bg-gradient-to-r from-teal-500 to-cyan-600 bg-clip-text text-transparent`).
3. Below or beside the hero text, build a stylized **Browser / Dashboard Mockup Card** using pure Tailwind utilities (`rounded-3xl border shadow-2xl p-6 bg-slate-900 text-white`).

### Step 4: Asymmetric "Bento Grid" Features Section
1. Build a 4-column Bento Grid on desktop (`grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6`):
   - **Card 1 (Large — `lg:col-span-2 lg:row-span-2`):** Real-Time Analytics showcase with mini stat bars built using Tailwind heights (`h-12`, `h-20`, `h-28`).
   - **Card 2 (Wide — `lg:col-span-2`):** Team Collaboration card with overlapping user avatar circles (`flex -space-x-3`).
   - **Card 3 (`lg:col-span-1`):** Instant Cloud Sync card with `group` and `group-hover:translate-x-1` icon animation.
   - **Card 4 (`lg:col-span-1`):** Enterprise Security badge card.

### Step 5: Interactive Pricing Section (Monthly / Yearly Billing Pill) & Testimonials
1. Create a 3-tier Pricing Grid (`grid-cols-1 lg:grid-cols-3 gap-8 items-stretch`).
2. Highlight the **Pro Plan** card with `ring-2 ring-teal-500 shadow-xl lg:-translate-y-2` and a floating `"Most Popular"` pill (`-top-4`).
3. Build a 3-column **Customer Testimonials** grid (`bg-slate-50 dark:bg-slate-800/60`) with avatar, name, role, star rating, and quote.

### Step 6: Newsletter CTA Banner & Dark-Mode Audit
1. Add a full-width rounded CTA banner (`rounded-3xl bg-gradient-to-br from-slate-900 to-teal-900 p-8 md:p-14 text-white`) with an inline email input + `"Get Early Access"` button (`flex flex-col sm:flex-row gap-3`).
2. Test every section in **both Light Mode and Dark Mode** across `375px`, `768px`, and `1280px` widths.

---

## Grading Rubric (100 Points)

| Criteria | Points |
| :--- | :---: |
| Tailwind Utility Mastery (spacing, typography, gradients, rings, shadows) | 25 |
| Asymmetric Bento Grid (`col-span-*`, `row-span-*`) & `group-hover:` micro-interactions | 25 |
| Complete Dark Mode (`dark:` classes across background, cards, borders & text) | 20 |
| Responsive Design (`sm:`, `md:`, `lg:` breakpoints on mobile/tablet/desktop) | 20 |
| Keyboard Focus (`focus-visible:ring-2`) & Clean HTML structure | 10 |
