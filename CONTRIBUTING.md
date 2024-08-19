# Contributing to the Project

Thank you for considering contributing to our project! To maintain a high-quality and organized codebase, please follow these guidelines for committing changes and creating pull requests.

## Table of Contents

- [Commit Messages](#commit-messages)
    - [Commit Message Format](#commit-message-format)
    - [Commit Types](#commit-types)
    - [Examples](#examples)
- [Pull Requests](#pull-requests)
    - [Creating a Pull Request](#creating-a-pull-request)
- [Issue Reporting](#issue-reporting)
    - [Reporting an Issue](#reporting-an-issue)
- [Templates](#templates)

## Commit Messages

To keep the project history clear and useful, commit messages must follow the conventional commit format.

### Commit Message Format

Each commit message should adhere to the following format:

```
<type>(<scope>): <description>
```

- **type**: The type of change being made.
- **scope**: The area of the codebase affected by the change. (Scope is optional but recommended for clarity.)
- **description**: A short, imperative description of the change.

### Commit Types

- **feat**: A new feature or enhancement.
- **fix**: A bug fix.
- **docs**: Documentation changes only.
- **style**: Formatting and code style changes (no functional changes).
- **refactor**: Code changes that neither fix a bug nor add a feature.
- **test**: Adding or modifying tests.
- **build**: Changes related to the build process or dependencies.
- **ci**: Changes to CI configuration files and scripts.
- **chore**: Miscellaneous changes that don’t fit into other categories.

### Examples

- **feat(bubble): add new bubble sorting algorithm with descriptive method names**
- **refactor(algorithms): reorganize sorting algorithms for better clarity**
- **docs(readme): update readme with new setup instructions**

**Note**: Commits must be in lowercase. The `body` and `footer` sections are prohibited for commits to ensure concise commit messages.

## Pull Requests

When creating a pull request (PR), please adhere to the following guidelines:

### Creating a Pull Request

1. **Title**: Use a clear and descriptive title for your PR, following the same format as commit messages.
    - Example: `refactor(structure): change the structure and enhance some dependencies`

2. **Description**: Provide a detailed description of the changes introduced by your PR. This should explain what was changed, why it was changed, and any relevant context. **Do not use body and footer sections in the description**.
    - Example: `This pull request addresses several issues to improve the project structure and code quality. The changes include transitioning from a multi-module Maven project to a single-module Maven structure, refactoring sorting algorithms for better educational alignment, improving variable naming conventions, and optimizing dependency management.`

3. **Fixes**: Include references to any related issues that your PR addresses using the `Fixes: #<issue_number>` format.
    - Example: `Fixes: #7, #4, #3, #2`

## Issue Reporting

If you find a bug or have a feature request, please open an issue with the following details:

### Reporting an Issue

1. **Title**: Use a brief and descriptive title for the issue.
    - Example: `Migrate from a multi-module structure to a single-module Maven project`

2. **Description**: Provide a detailed explanation of the issue or feature request. Include steps to reproduce the bug if applicable. **Do not use body and footer sections in the description**.
    - Example: `We currently have a multi-module Maven project structure, but we want to simplify the project organization by transitioning to a single-module Maven structure. This change will help streamline the development process and improve overall project management.`

## Templates

We provide templates for common tasks to help streamline contributions:

- **Pull Request Template**: Located in `.github/PULL_REQUEST_TEMPLATE.md`
- **Issue Template**: Located in `.github/ISSUE_TEMPLATE.md`

Please use these templates to ensure consistency and clarity in your contributions.

Thank you for contributing to the project!
