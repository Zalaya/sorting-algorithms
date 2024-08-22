# Contributing to the Project

Thank you for considering contributing to our project! To maintain a high-quality and organized codebase, please follow these guidelines for committing changes and creating pull requests.

## Table of Contents

- [Commit Messages](#commit-messages)
    - [Commit Message Format](#commit-message-format)
    - [Commit Types](#commit-types)
    - [Examples](#examples)

## Commit Messages

To keep the project history clear and useful, commit messages must follow the conventional commit format, there are a few rules to follow besides the format itself:

- **Lowercase only:** Keep the entire commit message in lowercase (No capital letters).
- **No period:** Do not end the commit message with a period.
- **No body or footer:** Do not include a body or footer in the commit message.
- **Imperative mood:** Write commit messages in the imperative mood (E.g., "add feature" instead of "added feature").
- **Short and clear:** Keep commit messages short and to the point.

### Commit Message Format

Each commit message should adhere to the following format:

```
<type>(<scope>): <description>
```

- **type**: The type of change being made.
- **scope**: The area of the codebase affected by the change. (Scope is optional but recommended for clarity.)
- **description**: A short, imperative description of the change.

### Commit Types

Use one of the following types to categorize your commit:

| Type         | Description                                                              |
|--------------|--------------------------------------------------------------------------|
| **feat**     | A new feature or enhancement.                                            |
| **fix**      | A bug fix.                                                               |
| **docs**     | Documentation-only changes (e.g., markdown, comments).                   |
| **style**    | Formatting and code style changes (no functional impact).                |
| **refactor** | Code changes that neither fix a bug nor add a feature (e.g., cleanup).   |
| **test**     | Adding or updating tests.                                                |
| **build**    | Changes to the build process or dependencies.                            |
| **ci**       | Changes to CI configuration files or scripts.                            |
| **chore**    | Miscellaneous tasks that do not fit into the other categories.           |

### Examples

- **feat(bubble): add new bubble sorting algorithm with descriptive method names**
- **refactor(algorithms): reorganize sorting algorithms for better clarity**
- **docs(readme): update readme with new setup instructions**
- **fix(bubble): fix edge case in bubble sort algorithm**
- **test(bubble): add test cases for bubble sort algorithm**
- **style(bubble): format bubble sort algorithm code**
- **build(dependencies): update dependencies to latest versions**
