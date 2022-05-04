class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passegenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
        
    }

    void printDataCar() {
        if(passegenger != null){
        System.out.println("License: " + license + " Driver: " + driver.name);
        }
    }

    public Integer getPassenger(){
        return passegenger;
    }

    public void setPassenger(Integer passegenger) {
        if(passegenger == 4){
            this.passegenger = passegenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the license
     */
    public String getLicense() {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * @return the driver
     */
    public Account getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Account driver) {
        this.driver = driver;
    }
}