package com.year20.day4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final List<String[]> PASSPORTS = Input.getListSplitPassports();

        // Part 1
        int validPassportsCount = 0;

        for (String[] passport : PASSPORTS) {
            if (passport.length == 8) {
                validPassportsCount++;
            } else if (passport.length == 7) {
                boolean cidFound = false;

                for (String line : passport) {
                    if (line.contains("cid")) {
                        cidFound = true;
                        break;
                    }
                }

                if (!cidFound) {
                    validPassportsCount++;
                }
            }
        }

        System.out.println("====PART 1====");
        System.out.println("Valid passports: " + validPassportsCount);

        // Part 2

    }

    class PassportPolicy {
        public boolean validatePassportPolicy(String[] passport) {
            boolean valid = true;

            while (valid) {
                for (String line : passport) {
                    if (line.contains("byr"))
                        valid = validateBirthYear(line);
                    else if (line.contains("iyr"))
                        valid = validateIssueYear(line);
                    else if (line.contains("eyr"))
                        valid = validateExpirationYear(line);
                    else if (line.contains("hgt"))
                        valid = validateHeight(line);
                    else if (line.contains("hcl"))
                        valid = validateHairColor(line);
                    else if (line.contains("ecl"))
                        valid = validateEyeColor(line);
                    else if (line.contains("pid"))
                        valid = validatePassportId(line);
                    else if (line.contains("cid"))
                        valid = validateCountryid(line);
                    else
                        valid = false;
                }
            }

            return valid;
        }


        public boolean validateBirthYear(String stringParam) {
            String[] lines = stringParam.split(":");
            int year = Integer.valueOf(lines[1]);

            return year >= 1920 && year <= 2002;
        }

        public boolean validateIssueYear(String stringParam) {
            String[] lines = stringParam.split(":");
            int year = Integer.parseInt(lines[1]);

            return year >= 2010 && year <= 2020;
        }

        public boolean validateExpirationYear(String stringParam) {
            String[] lines = stringParam.split(":");
            int year = Integer.parseInt(lines[1]);

            return year >= 2020 && year <= 2030;
        }

        public boolean validateHeight(String stringParam) {
            boolean valid = false;

            if (!(stringParam.contains("cm") || (stringParam.contains("in"))))
                return false;

            Pattern pattern = Pattern.compile(stringParam);
            Matcher matcher = pattern.matcher("\\d+");

            int height = Integer.parseInt(matcher.group());

            if (stringParam.contains("cm")) {
                return height >= 150 && height <= 193;
            } else {
                return height >= 59 && height <= 76;
            }
        }

        public boolean validateHairColor(String stringParam) {
            boolean valid = false;

            return valid;
        }

        public boolean validateEyeColor(String stringParam) {
            boolean valid = false;

            return valid;
        }

        public boolean validatePassportId(String stringParam) {
            boolean valid = false;

            return valid;
        }

        public boolean validateCountryid(String stringParam) {
            boolean valid = false;

            return valid;
        }
    }
}
