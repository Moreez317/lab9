package ru.mirea.lab9;

final class StudentNotFoundException extends RuntimeException
{
    StudentNotFoundException(final String errorMessage)
    {
        super(errorMessage);
    }
}