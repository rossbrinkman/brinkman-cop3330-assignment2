package ex25;

public final class Password {
    private String password;

    public Password()
    {
        password = "";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int passwordValidator()
    {
        int weakPasswordLength = 8;
        boolean hasNumbers = false, hasLetters = false, hasSpecialCharacters = false;

        password = password.trim();
        char[] passwordArray = password.toCharArray();

        for(char c: passwordArray)
        {
            if(!hasNumbers && Character.isDigit(c)) hasNumbers = true;
            if(!hasLetters && Character.isLetter(c)) hasLetters = true;
            if(!hasSpecialCharacters && !Character.isDigit(c) && !Character.isLetter(c)) hasSpecialCharacters = true;
        }

        if(password.length() >= weakPasswordLength)
        {
            if(hasLetters && hasNumbers && !hasSpecialCharacters)
                return 4;
            else if(hasLetters && hasNumbers)
                return 5;
            else return 3;
        }
        else
        {
            if(hasNumbers && !hasLetters && !hasSpecialCharacters)
                return 1;
            else if(!hasNumbers && hasLetters && !hasSpecialCharacters)
                return 2;
            else
                return 3;
        }

    }
}
