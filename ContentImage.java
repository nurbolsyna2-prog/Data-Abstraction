public abstract class ContentImage {

        private int id;
        private static int idGen=1;
        private String title;
        private int year;
        private int durationMinutes;
        public ContentImage(String title, int year, int durationMinutes) {
            this.id = idGen++;
            setTitle(title);
            setYear(year);
            setDurationMinutes(durationMinutes);
        }
    public void setTitle(String title) {
        if (title == null || title.isBlank()) throw new IllegalArgumentException();
        this.title = title;
    }
        public void setYear(int year) {
        if (year < 1990|| year > 2026) throw new IllegalArgumentException();
        this.year = year;
        }
        public void setDurationMinutes(int durationMinutes) {
            if(durationMinutes <= 0)throw new IllegalArgumentException();
            this.durationMinutes = durationMinutes;

            }
        public abstract double getLicenseCost(int currentYear);
    public int getYear() {
        return year;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Year: " + year;
    }
    }




