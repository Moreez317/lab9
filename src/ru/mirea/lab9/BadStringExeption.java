package ru.mirea.lab9;

final class BadStringException extends RuntimeException
{
    public BadStringException(final String errorMessage)
    {
        super(errorMessage);
    }
}
