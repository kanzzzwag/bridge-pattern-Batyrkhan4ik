# Assignment 3 — Bridge Pattern

**Author:** Batyrkhan Kanapiya
**Course:** Software Design Patterns, Astana IT University

## About

This project shows the **Bridge** structural design pattern in Java.

Bridge splits a class into two separate hierarchies that can change independently:

- **Abstraction** - *what* we draw (shapes)
- **Implementor** - *how* we draw (renderers)

The two sides are connected by **composition**: every `Shape` holds a `Renderer` as a field.
Because of this, we can add a new shape or a new renderer without changing the other side.

## Topic: Shape – Renderer

| Role | Classes |
|---|---|
| Abstraction | `Shape` (abstract class) |
| Refined Abstraction | `Circle`, `Square` |
| Implementor | `Renderer` (interface) |
| Concrete Implementor | `VectorRenderer`, `RasterRenderer` |
| Client | `Client` |

## Project structure

```
src/main/java/
├── abstraction/    # Shape, Circle, Square
├── implementor/    # Renderer, VectorRenderer, RasterRenderer
└── client/         # Client (main method)
```

## How to run

1. Open the project in IntelliJ IDEA (JDK 17).
2. Run the `main` method in `Client`.

The program draws shapes with one renderer, then switches to the other renderer at runtime.
The shapes stay the same — only the output changes.

