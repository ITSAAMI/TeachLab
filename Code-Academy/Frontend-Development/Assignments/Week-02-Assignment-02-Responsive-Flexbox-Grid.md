# Assignment 02 (Week 02): Modern Responsive Layouts (Flexbox & CSS Grid)

- **Difficulty Level:** Level 2 — Basic to Intermediate
- **Estimated Time:** 6–8 Hours
- **Core Topics Covered:** CSS Custom Properties (`:root` variables), Flexbox (`display: flex`, `justify-content`, `align-items`, `flex-wrap`, `gap`), CSS Grid (`display: grid`, `grid-template-columns`, `repeat(auto-fit, minmax(...))`), Sticky Frosted-Glass Navbar (`position: sticky`, `backdrop-filter`), Fluid Typography (`clamp()`), and Responsive Media Queries (`@media`).
- **Reference Classwork:** Inspect [../Classwork/layout.html](../Classwork/layout.html) before starting!

---

## Objective

Expand the classwork landing page ([layout.html](../Classwork/layout.html)) into a **Complete 5-Section Responsive Software House Website (`ZainDarkLabs Pro`)** that adapts smoothly across Desktop (`1280px+`), Tablet (`768px`), and Mobile (`375px`) screens using **CSS Flexbox** and **CSS Grid**.

---

## Step-by-Step Tasks

### Step 1: Design Tokens & Global Wrapper
1. Define a `:root` block with CSS variables for your brand palette (`--primary`, `--primary-dark`, `--dark`, `--soft`, `--text`, `--muted`), border-radius tokens, and shadow tokens.
2. Create a reusable `.wrapper` class (`inline-size: min(1200px, 100% - 3rem); margin-inline: auto;`) to keep all sections aligned.

### Step 2: Sticky Navbar with Flexbox (`<header>`)
1. Build a sticky top header (`position: sticky; top: 0; z-index: 100;`) with a frosted-glass backdrop (`backdrop-filter: blur(14px)`).
2. Use **Flexbox** (`display: flex; align-items: center; justify-content: space-between;`) to lay out:
   - Brand logo mark + brand name on the left.
   - Navigation pill links (`Home`, `Services`, `Portfolio`, `Pricing`, `Contact`) in the center/right, with `aria-current="page"` on the active link.
   - A primary `"Book a Call"` CTA button on the far right.

### Step 3: Two-Column Hero Section with CSS Grid (`#hero`)
1. Create a two-column hero grid (`grid-template-columns: 1.15fr 0.85fr; gap: 3rem; align-items: center;`).
2. **Left Column:** Pill badge, fluid `<h1>` heading using `clamp()`, lead paragraph, primary + secondary buttons (`display: flex; gap: 1rem;`), and a 3-column stats bar (`120+ Projects`, `8+ Years`, `98% Retention`).
3. **Right Column:** A dark showcase card (`<aside>`) with decorative background circles and a checklist of studio capabilities.

### Step 4: Services Grid Section (`#services`) — *New Section!*
1. Add a `<section id="services">` below the hero with a section badge, `<h2>` title, and subtitle.
2. Create a responsive 3-column card grid using CSS Grid:
   ```css
   .services-grid {
       display: grid;
       grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
       gap: 1.5rem;
   }
   ```
3. Build **6 Service Cards** (UI/UX Design, Web App Development, Mobile Apps, Cloud & DevOps, AI Integration, QA & Security). Each card should use `display: flex; flex-direction: column;` so its `"Learn more →"` link sits neatly at the bottom (`margin-top: auto`) regardless of text length.

### Step 5: Featured Projects / Portfolio Grid (`#work`) & Pricing Cards (`#pricing`) — *New Sections!*
1. **Featured Work (`#work`):** Display 3 project cards in a responsive grid, each with an `aspect-ratio: 16 / 9` preview banner, category tag, project title, short description, and technology pills (`HTML`, `CSS Grid`, `JS`).
2. **Pricing Plans (`#pricing`):** Create 3 pricing tier cards (**Starter**, **Growth — Popular**, **Enterprise**). Highlight the middle card with a primary border, subtle scale/elevation, and a `"Most Popular"` badge.

### Step 6: Multi-Column Footer & Media Queries (`<footer>`, `@media`)
1. Build a dark 4-column footer (`grid-template-columns: 2fr 1fr 1fr 1fr`) with brand summary, quick links, services links, and contact details, plus a bottom copyright bar.
2. Add responsive breakpoints at `@media (max-width: 960px)`, `@media (max-width: 760px)`, and `@media (max-width: 480px)`:
   - Collapse the 2-column hero into 1 column on tablets/phones.
   - Wrap the header navigation cleanly on mobile without horizontal overflow.
   - Stack buttons full-width (`width: 100%`) on narrow phones (`<= 480px`).

---

## Grading Rubric (100 Points)

| Criteria | Points |
| :--- | :---: |
| CSS Variables (`:root`) & consistent spacing/typography system (`clamp()`) | 15 |
| Sticky Flexbox Header & Two-Column CSS Grid Hero | 25 |
| Services (6 cards) & Portfolio/Pricing Grids with equal-height cards | 25 |
| Full Responsiveness at `1280px`, `768px`, and `375px` (zero horizontal scrollbar) | 25 |
| Accessibility (`:focus-visible`, `prefers-reduced-motion`, semantic headings) | 10 |

---

## Bonus Challenge (+10 Points)
- Use CSS **Subgrid** (`grid-template-rows: subgrid`) or `container-type: inline-size` on the Pricing or Service cards so card headers, descriptions, and action buttons align across every card in a row.
