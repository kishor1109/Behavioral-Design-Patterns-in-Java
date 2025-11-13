class WebDashBoard implements Observer {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Web Dashboard: Temp = " + temperature + "°C, Humidity = " + humidity + "%");


    }
}