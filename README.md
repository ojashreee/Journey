# Journey system
# 🧳 Journey — Your All-in-One Travel Booking Platform

> Plan a trip. Book a hotel. Grab a package deal. Lock in your tickets. All without leaving one tab.

Journey is a full-stack travel management system that brings together everything a traveler needs to plan a getaway — flights and trip bookings, hotel reservations, curated travel packages, and ticketing — in a single, role-aware platform. Behind the scenes, it's built with the same discipline you'd expect from a production travel app: clean MVC architecture, secure authentication, and a database designed to scale.

---

## ✈️ Why Journey?

Most people planning a trip end up with eight browser tabs open — one for flights, one for hotels, one for activities, one for "is this a scam" research. Journey collapses all of that into one system, so a user can go from "I want to go somewhere" to "I'm booked" without the tab chaos.

And for the people running the show behind the scenes, Journey gives admins a dedicated control panel to manage listings, monitor bookings, and keep the whole system running smoothly — without touching a line of code.

---

## 🌟 Features

### For travelers
- 🗺️ **Trip booking** — search and book trips end-to-end
- 🏨 **Hotel reservations** — browse and reserve stays alongside your trip
- 📦 **Travel packages** — bundle flights, hotels, and activities into one curated booking
- 🎫 **Ticketing** — secure your tickets as part of the same flow
- 🔐 **Personal accounts** — sign up, log in, and manage your own bookings safely

### For admins
- 🛠️ **Role-based access** — a dedicated admin view, separate from the traveler experience
- 📊 **Real-time record management** — see bookings as they happen
- ✅ **Booking automation** — less manual processing, fewer human errors

---

## 🏗️ How it's built

Journey isn't just a CRUD app bolted together — the system architecture was designed first, then built:

- **Use-case, class, and sequence diagrams** mapped out the system before a single endpoint was written, following proper SDLC and requirements analysis principles
- **Modular MVC design** keeps booking logic, data access, and presentation cleanly separated
- **JWT-style authentication** protects every booking endpoint and enforces the Admin/User boundary
- **Code reviews and structured testing** were part of the workflow, not an afterthought

---

## 🧰 Tech stack

| Layer | Technology |
|---|---|
| Backend | Java, Spring Boot |
| Data | SQL (relational database) |
| Architecture & design | UML (use-case, class, sequence diagrams) |
| Auth | JWT-style token authentication |
| Pattern | MVC |

---

## 🚀 Getting started

### Prerequisites
- Java JDK (11+ recommended)
- Maven
- A SQL database (MySQL/PostgreSQL — update connection details in your config)

### Run it locally

```bash
# Clone the repo
git clone https://github.com/ojashreee/Journey.git
cd Journey

# Build the project
mvn clean install

# Run it
mvn spring-boot:run
```

The app should now be running locally — check your console output for the exact port (commonly `localhost:8080`).

> 💡 Don't forget to configure your database connection in `application.properties` (or `application.yml`) before your first run.

---

## 👥 Who does what

| Role | Can do |
|---|---|
| **User** | Browse trips, hotels, and packages · Book and manage their own reservations · View booking history |
| **Admin** | Manage listings (trips, hotels, packages) · View and oversee all bookings system-wide · Maintain platform data integrity |

---

## 🗺️ Roadmap

A few directions this project could grow in next:

- [ ] Payment gateway integration
- [ ] Email/SMS booking confirmations
- [ ] Search filters (price range, dates, ratings)
- [ ] Reviews and ratings for hotels and packages
- [ ] A polished front-end UI to match the backend

---

## 🤝 Contributing

This started as a learning project, but suggestions and pull requests are always welcome. If you spot a bug, have an idea, or just want to say hi, feel free to open an issue.

---

## 📄 License

This project is open for educational and portfolio purposes. Feel free to explore, fork, and learn from it.

---

<p align="center">
Built with ☕, late nights, and a genuine love for travel. ✈️
</p>
