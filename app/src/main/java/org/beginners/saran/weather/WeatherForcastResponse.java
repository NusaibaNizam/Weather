package org.beginners.saran.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by saran on 1/2/2018.
 */

public class WeatherForcastResponse implements Serializable {
    @SerializedName("city")
    @Expose
    private City city;
    @SerializedName("cod")
    @Expose
    private String cod;
    @SerializedName("message")
    @Expose
    private Double message;
    @SerializedName("cnt")
    @Expose
    private Integer cnt;
    @SerializedName("list")
    @Expose
    private java.util.List<ForecastList> list = null;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Double getMessage() {
        return message;
    }

    public void setMessage(Double message) {
        this.message = message;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public java.util.List<ForecastList> getList() {
        return list;
    }

    public void setList(java.util.List<ForecastList> list) {
        this.list = list;
    }
    public class City implements Serializable{

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("coord")
        @Expose
        private Coord coord;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("population")
        @Expose
        private Integer population;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Coord getCoord() {
            return coord;
        }

        public void setCoord(Coord coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Integer getPopulation() {
            return population;
        }

        public void setPopulation(Integer population) {
            this.population = population;
        }

    }
    public class Coord implements Serializable{

        @SerializedName("lon")
        @Expose
        private Double lon;
        @SerializedName("lat")
        @Expose
        private Double lat;

        public Double getLon() {
            return lon;
        }

        public void setLon(Double lon) {
            this.lon = lon;
        }

        public Double getLat() {
            return lat;
        }

        public void setLat(Double lat) {
            this.lat = lat;
        }

    }
    public class ForecastList implements Serializable{

        @SerializedName("dt")
        @Expose
        private Integer dt;
        @SerializedName("temp")
        @Expose
        private Temp temp;
        @SerializedName("pressure")
        @Expose
        private Double pressure;
        @SerializedName("humidity")
        @Expose
        private Integer humidity;
        @SerializedName("weather")
        @Expose
        private java.util.List<Weather> weather = null;
        @SerializedName("speed")
        @Expose
        private Double speed;
        @SerializedName("deg")
        @Expose
        private Integer deg;
        @SerializedName("clouds")
        @Expose
        private Integer clouds;
        @SerializedName("snow")
        @Expose
        private Double snow;
        @SerializedName("rain")
        @Expose
        private Double rain;

        public String getDt() {
            long seconds = dt;
            long millis = seconds * 1000;
            Date date = new Date(millis);
            SimpleDateFormat sdf = new SimpleDateFormat("EE,dd MMM,yy", Locale.getDefault());
            sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
            String formattedDate = sdf.format(date);
            return formattedDate;

        }

        public void setDt(Integer dt) {
            this.dt = dt;
        }

        public Temp getTemp() {
            return temp;
        }

        public void setTemp(Temp temp) {
            this.temp = temp;
        }

        public Double getPressure() {
            return pressure;
        }

        public void setPressure(Double pressure) {
            this.pressure = pressure;
        }

        public Integer getHumidity() {
            return humidity;
        }

        public void setHumidity(Integer humidity) {
            this.humidity = humidity;
        }

        public java.util.List<Weather> getWeather() {
            return weather;
        }

        public void setWeather(java.util.List<Weather> weather) {
            this.weather = weather;
        }

        public Double getSpeed() {
            return speed;
        }

        public void setSpeed(Double speed) {
            this.speed = speed;
        }

        public Integer getDeg() {
            return deg;
        }

        public void setDeg(Integer deg) {
            this.deg = deg;
        }

        public Integer getClouds() {
            return clouds;
        }

        public void setClouds(Integer clouds) {
            this.clouds = clouds;
        }

        public Double getSnow() {
            return snow;
        }

        public void setSnow(Double snow) {
            this.snow = snow;
        }

        public Double getRain() {
            return rain;
        }

        public void setRain(Double rain) {
            this.rain = rain;
        }

    }
    public class Temp implements Serializable{

        @SerializedName("day")
        @Expose
        private Double day;
        @SerializedName("min")
        @Expose
        private Double min;
        @SerializedName("max")
        @Expose
        private Double max;
        @SerializedName("night")
        @Expose
        private Double night;
        @SerializedName("eve")
        @Expose
        private Double eve;
        @SerializedName("morn")
        @Expose
        private Double morn;

        public Double getDay() {
            return day;
        }

        public void setDay(Double day) {
            this.day = day;
        }

        public Double getMin() {
            return min;
        }
        public Double getMinInCel() {
            return ((min-32)*(5.0/9.0));
        }
        public Double getMinInFarren() {
            return (min*(9.0/5.0)+32);
        }


        public void setMin(Double min) {
            this.min = min;
        }

        public Double getMax() {
            return max;
        }
        public Double getMaxInCel() {
            return ((max-32)*(5.0/9.0));
        }
        public Double getMaxInFarren() {
            return (max*(9.0/5.0)+32);
        }

        public void setMax(Double max) {
            this.max = max;
        }
        public Double getAvg() {
            return (min+max)/2;
        }
        public Double getNight() {
            return night;
        }

        public void setNight(Double night) {
            this.night = night;
        }

        public Double getEve() {
            return eve;
        }

        public void setEve(Double eve) {
            this.eve = eve;
        }

        public Double getMorn() {
            return morn;
        }

        public void setMorn(Double morn) {
            this.morn = morn;
        }

    }
    public class Weather implements Serializable{

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("main")
        @Expose
        private String main;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("icon")
        @Expose
        private String icon;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

    }
}
