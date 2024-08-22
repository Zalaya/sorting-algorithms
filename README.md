# Sorting Algorithms in Java

This project is a collection of classic sorting algorithms implemented in Java, aimed at providing an educational resource for understanding the importance and mechanics of sorting in computer science.

## Table of Contents

- [Introduction](#introduction)
- [Algorithms Included](#algorithms-included)
- [Project Structure](#project-structure)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Sorting algorithms are a key concept in computer science due to their role in optimizing the performance of other algorithms, which require sorted data for efficient operation. Understanding different sorting algorithms helps in selecting the right algorithm for a given problem based on its time complexity and use case.

This project showcases different sorting techniques with clear and concise Java implementations. It is a great starting point for learners who want to dive deeper into algorithm design and analysis.

## Algorithms Included

- **Bubble Sort:** A basic comparison-based sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
- **Selection Sort:** An algorithm that divides the input list into two parts: the sorted part at the beginning and the unsorted part at the end, and repeatedly selects the smallest (or largest) element from the unsorted part.

More algorithms will be added over time to expand this educational resource.

## Project Structure

The project is organized into several key directories:

- `src/main/java/xyz/zalaya/sorting/algorithms`: Contains the core implementations of the sorting algorithms.
- `src/test/java/xyz/zalaya/sorting/algorithms`: Contains unit tests to validate the correctness of the algorithms.
- `.editorconfig`: Provides configuration for consistent code style across different IDEs and text editors.

The project is designed to be modular and easy to navigate, with all implementations and tests neatly organized for clarity and learning purposes.

## Testing

Testing is a critical part of understanding and validating algorithms. This project includes unit tests in the `src/test/java/xyz/zalaya/sorting/algorithms/implementations` directory to verify the correctness and performance of the sorting algorithms.

To run the tests, simply execute:

```bash
mvn test
```

This will ensure that all algorithms behave as expected under various conditions.

## Contributing

Contributions are welcome! Whether you want to add new sorting algorithms, optimize existing ones, or improve the documentation, your input is valuable.

For more information on how to contribute, please check the [CONTRIBUTING.md](.github/CONTRIBUTING.md) file.

## License

This project is licensed under the [GNU General Public License v3.0](.github/LICENSE). For more details, please refer to the [LICENSE.md](.github/LICENSE) file.
