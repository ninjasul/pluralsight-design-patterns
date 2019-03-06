package creational._02_builder;

import lombok.ToString;

@ToString
public class Lunch {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    private Lunch() {}

    private Lunch( LunchBuilder builder ) {
        bread = builder.bread;
        condiments = builder.condiments;
        dressing = builder.dressing;
        meat = builder.meat;
    }

    public static LunchBuilder builder() {
        return new LunchBuilder();
    }

    public static class LunchBuilder {

        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public LunchBuilder() {}

        public LunchBuilder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public LunchBuilder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public LunchBuilder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public LunchBuilder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Lunch build() {
            return new Lunch(this);
        }
    }
}