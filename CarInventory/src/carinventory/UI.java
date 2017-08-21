package carinventory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 * UI for the application
 * @author Sukhjinder
 */
public class UI extends javax.swing.JFrame {

    ArrayList<Car> cars = new ArrayList<Car>();

//  Car Properties  
    String vin;
    String make;
    String model;
    String year;
    String color;
    double price;
    String weight;
    String driveTrain;
    String bodyStyle;
    String mileage;
    String fuelType;
        
//  Engine Properties
    String displacement;
    String numOfCylinders;
    String engineModel;
    String horsepower;
    String torque;
        
//  Transmission Properties
    String type;
    String transModel;
    String numOfGears;
        
    Car car;
    Engine engine;
    Transmission transmission;
       
    String vinUpdate;
        
//    final DefaultComboBoxModel Acura = new DefaultComboBoxModel(new String[]{"CL", "ILX", "Integra", "Legend", "MDX", "NSX", "RDX", "RL", "RLX", "RSX", "SLX", "TL", "TLX", "TSX", "Vigor", "ZDX"});
//    final DefaultComboBoxModel Alfa_Romeo = new DefaultComboBoxModel(new String[]{"164", "4C", "4C Spider", "8C Competizione", "*c Spider", " Giulia", "Spider", "Stelvio"});
//    final DefaultComboBoxModel Aston_Martin = new DefaultComboBoxModel(new String[]{"DB AR1 Zagato", "DB11", "DB7", "DB7 Vantage", "DB9", "DBS", "Rapide", "Rapide S", " V12 Vanquish", "V12 Vantage", " V12 Vantage S", "V8 Vantage", "V8 Vantage S", "Vanquish", "Vantage", "Vantage GT", "Virage"});
//    final DefaultComboBoxModel Audi = new DefaultComboBoxModel(new String[]{"100", "200", "80", "90", "A3", "A3 e-tron", "A4", "A4 allroad", "A5", "A6", "A7", "A8", "allroad", "Cabriolet", "Q3", "Q5", "Q5 hybrid", "Q7", "quattro", "R8", "RS 3", "RS 4", "RS 5", "RS 6", "RS 7", "RS6", "S3", "S4", "S5", "S6", "S7", "S8", "SQ5", "TT", "TT RS", "TTS"});
//    final DefaultComboBoxModel Bentley = new DefaultComboBoxModel(new String[]{"Arnage", "Azure", "Bentayga", "Brooklands", "Continental", "Continental Flying Spur", "Continental GT", "Continental GTC", "Continental Supersports", "Flying Spur", "Mulsanne", "R-Type", "Turbo R", "Turbo RL", "Turbo RT", "Turbo S"});
//    final DefaultComboBoxModel BMW = new DefaultComboBoxModel(new String[]{"1 Series M", "128", "135", "228", "230", "M235", "M240", "318", "320", "323", "325", "328", "328 Gran Turismo", "328d", "330", "330 Gran Turismo", "330e", "335", "335 Gran Turismo", "340", "340", "340 Gran Turismo", "ActiveHybrid 3", "M3", "428", "428 Gran Coupe", "430", "430 Gran Coupe", "435", "435 Gran Coupe", "440", "440 Gran Coupe", "M4", "525", "528", "530", "530e","535", "535 Gran Turismo", "535d", "540", "545", "550", "550 Gran Turismo", "Active Hybrid 5", "M5", "640", "640 Gran Coupe", "640 Gran Turismo", "645", "650", "650 Gran Coupe", "ALPINA B6 Gran Coupe", "M6", "M6 Gran Coupe", "735", "740", "740e", "745", "750", "760", "ActiveHybrid 7", "ActiveHybrid 740", "ActiveHybrid 750", "ALPINA B7", "840", "850", "i3", "i8", "1 Series M", "M", "M2", "M235", "M240", "M3", "M4", "M5", "M550", "M760", "X5 M", "X6 M", "Z4 M", "ActiveHybrid X6", "X1", "X3", "X4", "X5", "X5 eDrive", "X6", "Z3", "Z4", "Z8"});
//    final DefaultComboBoxModel Buick = new DefaultComboBoxModel(new String[]{"Cascada", "Century", "Enclave", "Encore", "Envision", "LaCrosse", "LeSabre", "Lucerne", "Park Avenue", "Rainier", "Reatta", "Regal", "Regal Sportback", "Regal TourX", "Rendezvous", "Riviera", "Roadmaster", "Skylark", "Terraza", "Verano"});
//    final DefaultComboBoxModel Cadillac = new DefaultComboBoxModel(new String[]{"Allante", "ATS", "ATS-V", "Brougham", "Catera", "CT6", "CT6 PLUG-IN", "CTS", "CTS-V", "DeVille", "DTS","Eldorado", "ELR", "Escalade", "Escalade ESV", "Escalade EXT", "Escalade Hybrid", "Fleetwoord", "Seville", "Sixty Special", "SRX", "STS", "XLR", "XT5", "XTS"});
//    final DefaultComboBoxModel Chevrolet = new DefaultComboBoxModel(new String[]{"1500", "2500", "3500", "Astro", "Avalanche", "Aveo", "Beretta", "Blazer", "Bolt EV", "Camaro", "Caprice", "Caprice Classic", "Captiva Sport", "Cavalier", "City Express", "Classic", "Cobalt", "Colorado", "Corsica", "Corvette", "Corvette Stringray", "Cruze", "Cruze Limited", "Equinox", "Express 1500", "Express 2500", "Express 3500", "HHR", " Impala", "Impala Limited", "Lumina", "Lumina APV", "Malibu", "Malibu Classic", "Malibu Hybrid", "Malibu Limited", "Malibu Maxx", "Metro", "Monte Carlo", "Pickup", "Prizm", "S-10", "S-10 Blazer", "Silverado 1500", "Silverado 1500 Hybrid", "Silverado 2500", "Silverado 3500", "Sonic", "Spark", "Spark EV", "Sportvan", "SS", "SSR", "Suburban", "Tahoe", "Tahoe Hybrid", "Tracker", "TrailBlazer", "TrailBlazer EXt", "Traverse", "Trax", "Uplander", "Venture", "Volt",});
//    final DefaultComboBoxModel Chrysler = new DefaultComboBoxModel(new String[]{"200", "300", "300C", "300M", "Apsen", "Aspen Hybrid", "Cirrus", "Concorde", "Crossfire", "Grand Voyager", "Imperial", "LeBaron", "LHS", "New Yorker", "Pacifica", "Pacifica Hybrid", "Prowler", "PT Cruiser", "Sebring", "TC by Maserati", "Town & Country", "Voyager"});
//    final DefaultComboBoxModel Dodge = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel Ferrari = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel Fiat = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel Ford = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel Genesis = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel GMC = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel Honda = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel Hyundai = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel Infiniti = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel Jaguar = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel Jeep = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel Kia = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel Lamborghini = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel Land_Rover = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel Lexus = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel Lincoln = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel Maserati = new DefaultComboBoxModel(new String[]{"Coupe", "Ghibli", "GranSport", "Gran Sport Spyder", "Gran Turismo", "Levante", "Quattroporte", "Spyder",});
//    final DefaultComboBoxModel Mazda = new DefaultComboBoxModel(new String[]{"TL", "TSX", "MDX"});
//    final DefaultComboBoxModel McLaren = new DefaultComboBoxModel(new String[]{"570GT", "570S", "650S", "675LT", "MP4-12C", "P1", "F1"});
//    final DefaultComboBoxModel Mercedes_Benz = new DefaultComboBoxModel(new String[]{"Skyline", "300zx", "350Z"});
//    final DefaultComboBoxModel Mercury = new DefaultComboBoxModel(new String[]{"Skyline", "300zx", "350Z"});
//    final DefaultComboBoxModel MINI = new DefaultComboBoxModel(new String[]{"Clubman", "Cooper Clubman", "Cooper S Clubman", "Cooper", "Cooper S", "Countryman", "Cooper Countryman", "Cooper S Countryman", "Paceman", "Roadster"});
//    final DefaultComboBoxModel Mitsubishi = new DefaultComboBoxModel(new String[]{"Skyline", "300zx", "350Z"});
//    final DefaultComboBoxModel Nissan = new DefaultComboBoxModel(new String[]{"Skyline", "300zx", "350Z"});
//    final DefaultComboBoxModel Pontiac = new DefaultComboBoxModel(new String[]{"Skyline", "300zx", "350Z"});
//    final DefaultComboBoxModel Porsche = new DefaultComboBoxModel(new String[]{"Skyline", "300zx", "350Z"});
//    final DefaultComboBoxModel RAM = new DefaultComboBoxModel(new String[]{"1500", "2500", "3500", "Cargo", "ProMaster 1500", "ProMaster 2500", "Promaster 2500 Window Van", "ProMaster 3500", "ProMaster 3500 Window Van", "ProMaster City",});
//    final DefaultComboBoxModel Rolls_Royce = new DefaultComboBoxModel(new String[]{"40/50 HP Silver Ghost", "Corniche", "Dawn", "Ghost", "Park Ward", "Phantom", "Phantom Coupe", "Phantom Drophead Coupe", "Phantom Vi", "Silver Dawn", "Silver Seraph", "Silver Spur", "Silver Spur II", "Wraith"});
//    final DefaultComboBoxModel Saturn = new DefaultComboBoxModel(new String[]{"Skyline", "300zx", "350Z"});
//    final DefaultComboBoxModel Scion = new DefaultComboBoxModel(new String[]{"FR-S", "iA", "iM", "iQ", "tC", "xA", "xB", "xD",});
//    final DefaultComboBoxModel Smart = new DefaultComboBoxModel(new String[]{"ForTwo", "ForTwo Electric Drive"});
//    final DefaultComboBoxModel Subaru = new DefaultComboBoxModel(new String[]{"Skyline", "300zx", "350Z"});
//    final DefaultComboBoxModel Tesla = new DefaultComboBoxModel(new String[]{"Model S", "Model X", "Model 3", "Roadster",});
//    final DefaultComboBoxModel Toyota = new DefaultComboBoxModel(new String[]{"Skyline", "300zx", "350Z"});
//    final DefaultComboBoxModel Volkswagen = new DefaultComboBoxModel(new String[]{"Skyline", "300zx", "350Z"});
//    final DefaultComboBoxModel Volvo = new DefaultComboBoxModel(new String[]{"Skyline", "300zx", "350Z"});
    
    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
        
             makeComboBox.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String selectedModel = (String) makeComboBox.getSelectedItem();
                
                if("Acura".equals(selectedModel)){ 
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("acura").toArray()));
                }
                
                if("Alfa Romeo".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("alfa romeo").toArray()));
                }
                
                if("Aston Martin".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("aston martin").toArray()));
                }
                
                if("Audi".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("audi").toArray()));
                }
                
                if("Bentley".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("bentley").toArray()));
                }
                
                if("BMW".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("bmw").toArray()));
                }
                
                if("Buick".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("buick").toArray()));
                }
                
                if("Cadillac".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("cadillac").toArray()));
                }
                
                if("Chevrolet".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("chevrolet").toArray()));
                }
                
                if("Chrysler".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("chrysler").toArray()));
                }
                
                if("Dodge".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("dodge").toArray()));
                }
                
                if("Ferrari".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("ferrari").toArray()));
                }
                
                if("Fiat".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("fiat").toArray()));
                }
                
                if("Ford".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("ford").toArray()));
                }
                
                if("Genesis".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("genesis").toArray()));
                }
                
                if("GMC".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("gmc").toArray()));
                }
                
                if("Honda".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("honda").toArray()));
                }
                
                if("Hyundai".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("hyundai").toArray()));
                }
                
                if("Infiniti".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("infiniti").toArray()));
                }
                
                if("Jaguar".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("jaguar").toArray()));
                }
                
                if("Jeep".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("jeep").toArray()));
                }
                
                if("Kia".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("kia").toArray()));
                }
                
                if("Lamborghini".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("lamborghini").toArray()));
                }
                
                if("Land Rover".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("land rover").toArray()));
                }
                
                if("Lexus".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("lexus").toArray()));
                }
                
                if("Lincoln".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("lincoln").toArray()));
                }
                
                if("Maserati".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("maserati").toArray()));
                }
                
                if("Mazda".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("mazda").toArray()));
                }
                
                if("McLaren".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("mclaren").toArray()));
                }
                
                if("Mercedes-Benz".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("mercedes-benz").toArray()));
                }
                
                if("Mercury".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("mercury").toArray()));
                }
                
                if("MINI".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("mini").toArray()));
                }
                
                if("Mitsubishi".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("mitsubishi").toArray()));
                }
                
                if("Nissan".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("nissan").toArray()));
                }
                
                if("Pontiac".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("pontiac").toArray()));
                }
                
                if("Porsche".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("porsche").toArray()));
                }
                
                if("RAM".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("ram").toArray()));
                }
                
                if("Rolls-Royce".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("rolls royce").toArray()));
                }
                
                if("Saturn".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("saturn").toArray()));
                }
                
                if("Scion".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("scion").toArray()));
                }
                
                if("Smart".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("smart").toArray()));
                }
                
                if("Subaru".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("subaru").toArray()));
                }
                
                if("Tesla".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("tesla").toArray()));
                }
                
                if("Toyota".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("toyota").toArray()));
                }
                
                if("Volkswagen".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("volkswagen").toArray()));
                }
                
                if("Volvo".equals(selectedModel)){
                    modelComboBox.setModel(new DefaultComboBoxModel(NHTSA_API.getModels("volvo").toArray()));
                }
            }
        }));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateTabbedPane = new javax.swing.JTabbedPane();
        addCarPanel = new javax.swing.JPanel();
        carLabel = new javax.swing.JLabel();
        engineLabel = new javax.swing.JLabel();
        transmissionLabel = new javax.swing.JLabel();
        vinLabel = new javax.swing.JLabel();
        makeLabel = new javax.swing.JLabel();
        modelLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        colorLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        drivetrainLabel = new javax.swing.JLabel();
        bodystyleLabel = new javax.swing.JLabel();
        mileageLabel = new javax.swing.JLabel();
        fuelTypeLabel = new javax.swing.JLabel();
        displacementLabel = new javax.swing.JLabel();
        numOfCylindersLabel = new javax.swing.JLabel();
        engineModelLabel = new javax.swing.JLabel();
        horsepowerLabel = new javax.swing.JLabel();
        torqueLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        transModelLabel = new javax.swing.JLabel();
        numOfGearsLabel = new javax.swing.JLabel();
        addCarButton = new javax.swing.JButton();
        vinTextField = new javax.swing.JTextField();
        yearTextField = new javax.swing.JTextField();
        colorTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        weightTextField = new javax.swing.JTextField();
        mileageTextField = new javax.swing.JTextField();
        displacementTextField = new javax.swing.JTextField();
        engineModelTextField = new javax.swing.JTextField();
        horsepowerTextField = new javax.swing.JTextField();
        torqueTextField = new javax.swing.JTextField();
        transModelTextField = new javax.swing.JTextField();
        driveTrainComboBox = new javax.swing.JComboBox<>();
        bodyStyleComboBox = new javax.swing.JComboBox<>();
        fuelTypeComboBox = new javax.swing.JComboBox<>();
        numOfCylindersComboBox = new javax.swing.JComboBox<>();
        transTypeComboBox = new javax.swing.JComboBox<>();
        numOfGearsComboBox = new javax.swing.JComboBox<>();
        makeComboBox = new javax.swing.JComboBox<>();
        modelComboBox = new javax.swing.JComboBox<>();
        deleteCarPanel = new javax.swing.JPanel();
        enterVINLabel = new javax.swing.JLabel();
        vinDeleteCarTextField = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        carDetailsTextArea = new javax.swing.JTextArea();
        removeCarButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        vinUpdateTabTextField = new javax.swing.JTextField();
        searchUpdateTabButton = new javax.swing.JButton();
        addCarPanel1 = new javax.swing.JPanel();
        carLabel1 = new javax.swing.JLabel();
        transmissionLabel1 = new javax.swing.JLabel();
        vinLabel1 = new javax.swing.JLabel();
        makeLabel1 = new javax.swing.JLabel();
        modelLabel1 = new javax.swing.JLabel();
        yearLabel1 = new javax.swing.JLabel();
        colorLabel1 = new javax.swing.JLabel();
        priceLabel1 = new javax.swing.JLabel();
        weightLabel1 = new javax.swing.JLabel();
        drivetrainLabel1 = new javax.swing.JLabel();
        bodystyleLabel1 = new javax.swing.JLabel();
        mileageLabel1 = new javax.swing.JLabel();
        fuelTypeLabel1 = new javax.swing.JLabel();
        displacementLabel1 = new javax.swing.JLabel();
        numOfCylindersLabel1 = new javax.swing.JLabel();
        engineModelLabel1 = new javax.swing.JLabel();
        horsepowerLabel1 = new javax.swing.JLabel();
        torqueLabel1 = new javax.swing.JLabel();
        typeLabel1 = new javax.swing.JLabel();
        transModelLabel1 = new javax.swing.JLabel();
        numOfGearsLabel1 = new javax.swing.JLabel();
        updateCarButton = new javax.swing.JButton();
        vinUpdateTextField = new javax.swing.JTextField();
        modelUpdateTextField = new javax.swing.JTextField();
        yearUpdateTextField = new javax.swing.JTextField();
        colorUpdateTextField = new javax.swing.JTextField();
        priceUpdateTextField = new javax.swing.JTextField();
        weightUpdateTextField = new javax.swing.JTextField();
        mileageUpdateTextField = new javax.swing.JTextField();
        displacementUpdateTextField = new javax.swing.JTextField();
        engineModelUpdateTextField = new javax.swing.JTextField();
        horsepowerUpdateTextField = new javax.swing.JTextField();
        torqueUpdateTextField = new javax.swing.JTextField();
        transModelUpdateTextField = new javax.swing.JTextField();
        driveTrainUpdateComboBox = new javax.swing.JComboBox<>();
        bodyStyleUpdateComboBox = new javax.swing.JComboBox<>();
        fuelTypeUpdateComboBox = new javax.swing.JComboBox<>();
        numOfCylindersUpdateComboBox = new javax.swing.JComboBox<>();
        transTypeUpdateComboBox = new javax.swing.JComboBox<>();
        numOfGearsUpdateComboBox = new javax.swing.JComboBox<>();
        makeUpdateComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        listInventoryPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carListTextArea = new javax.swing.JTextArea();
        loadButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        carLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        carLabel.setText("Car");

        engineLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        engineLabel.setText("Engine");

        transmissionLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        transmissionLabel.setText("Transmission");

        vinLabel.setText("VIN");

        makeLabel.setText("Make");

        modelLabel.setText("Model");

        yearLabel.setText("Year");

        colorLabel.setText("Color");

        priceLabel.setText("Price");

        weightLabel.setText("Weight");

        drivetrainLabel.setText("Drivetrain");

        bodystyleLabel.setText("Bodystyle");

        mileageLabel.setText("Mileage");

        fuelTypeLabel.setText("Fuel Type");

        displacementLabel.setText("Displacement");

        numOfCylindersLabel.setText("Number of Cylinders");

        engineModelLabel.setText("Model");

        horsepowerLabel.setText("Horsepower");

        torqueLabel.setText("Torque");

        typeLabel.setText("Type");

        transModelLabel.setText("Model");

        numOfGearsLabel.setText("Number of Gears");

        addCarButton.setText("Add Car");
        addCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarButtonActionPerformed(evt);
            }
        });

        horsepowerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horsepowerTextFieldActionPerformed(evt);
            }
        });

        transModelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transModelTextFieldActionPerformed(evt);
            }
        });

        driveTrainComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RWD", "FWD", "AWD", "4x4", "4WD" }));

        bodyStyleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coupe", "Sedan", "SUV", "Convertible", "Pickup", "Hatchback", "Wagon", "Minivan", "Van" }));

        fuelTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gas", "Diesel", "E85", "Electric", "Natural Gas" }));

        numOfCylindersComboBox.setEditable(true);
        numOfCylindersComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "8", "10", "12" }));

        transTypeComboBox.setEditable(true);
        transTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Automatic", "AutoManual", "CVT" }));

        numOfGearsComboBox.setEditable(true);
        numOfGearsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        makeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acura", "Alfa Romeo", "Aston Martin", "Audi", "Bentley", "BMW", "Buick", "Cadillac", "Chevrolet", "Chrysler", "Dodge", "Ferrari", "Fiat", "Ford", "Genesis", "GMC", "Honda", "Hyundai", "Infiniti", "Jaguar", "Jeep", "Kia", "Lamborghini", "Land Rover", "Lexus", "Lincoln", "Maserati", "Mazda", "McLaren", "Mercedes-Benz", "Mercury", "MINI", "Mitsubishi", "Nissan", "Pontiac", "Porsche", "RAM", "Rolls-Royce", "Saturn", "Scion", "Smart", "Subaru", "Tesla", "Toyota", "Volkswagen", "Volvo" }));
        makeComboBox.setSelectedIndex(-1);
        makeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addCarPanelLayout = new javax.swing.GroupLayout(addCarPanel);
        addCarPanel.setLayout(addCarPanelLayout);
        addCarPanelLayout.setHorizontalGroup(
            addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanelLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(carLabel)
                .addGap(123, 467, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanelLayout.createSequentialGroup()
                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCarPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colorLabel)
                            .addComponent(priceLabel)
                            .addComponent(yearLabel)
                            .addComponent(modelLabel)
                            .addComponent(makeLabel)
                            .addComponent(vinLabel)
                            .addComponent(weightLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drivetrainLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bodystyleLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mileageLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fuelTypeLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vinTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(yearTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(colorTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(priceTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(weightTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(makeComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 184, Short.MAX_VALUE)
                    .addComponent(bodyStyleComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mileageTextField)
                    .addComponent(fuelTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(driveTrainComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modelComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanelLayout.createSequentialGroup()
                                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(engineModelLabel)
                                    .addComponent(horsepowerLabel)
                                    .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(typeLabel)
                                        .addComponent(torqueLabel)
                                        .addComponent(transModelLabel)))
                                .addGap(214, 214, 214))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanelLayout.createSequentialGroup()
                                .addComponent(transmissionLabel)
                                .addGap(71, 71, 71))))
                    .addGroup(addCarPanelLayout.createSequentialGroup()
                        .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(transTypeComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(transModelTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanelLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(numOfGearsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numOfGearsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(addCarPanelLayout.createSequentialGroup()
                                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addCarPanelLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(numOfCylindersLabel))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(displacementLabel)
                                        .addGap(10, 10, 10)))
                                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addCarPanelLayout.createSequentialGroup()
                                        .addComponent(engineLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(displacementTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(engineModelTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(horsepowerTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(torqueTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(numOfCylindersComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        addCarPanelLayout.setVerticalGroup(
            addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCarPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carLabel)
                    .addComponent(engineLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vinLabel)
                    .addComponent(displacementLabel)
                    .addComponent(vinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displacementTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makeLabel)
                    .addComponent(numOfCylindersLabel)
                    .addComponent(numOfCylindersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelLabel)
                    .addComponent(engineModelLabel)
                    .addComponent(engineModelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearLabel)
                    .addComponent(horsepowerLabel)
                    .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horsepowerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorLabel)
                    .addComponent(torqueLabel)
                    .addComponent(colorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(torqueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCarPanelLayout.createSequentialGroup()
                        .addComponent(transmissionLabel)
                        .addGap(18, 18, 18)
                        .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeLabel)
                            .addComponent(transTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addCarPanelLayout.createSequentialGroup()
                        .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drivetrainLabel)
                            .addComponent(driveTrainComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCarPanelLayout.createSequentialGroup()
                        .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(transModelLabel)
                            .addComponent(transModelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numOfGearsLabel)
                            .addComponent(numOfGearsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addCarPanelLayout.createSequentialGroup()
                        .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bodystyleLabel)
                            .addComponent(bodyStyleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mileageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mileageLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuelTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fuelTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        updateTabbedPane.addTab("Add Car", addCarPanel);

        enterVINLabel.setText("Enter VIN");

        carDetailsTextArea.setEditable(false);
        carDetailsTextArea.setColumns(20);
        carDetailsTextArea.setRows(5);
        jScrollPane.setViewportView(carDetailsTextArea);

        removeCarButton.setText("Remove Car");
        removeCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCarButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteCarPanelLayout = new javax.swing.GroupLayout(deleteCarPanel);
        deleteCarPanel.setLayout(deleteCarPanelLayout);
        deleteCarPanelLayout.setHorizontalGroup(
            deleteCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteCarPanelLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(removeCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(deleteCarPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(deleteCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(deleteCarPanelLayout.createSequentialGroup()
                        .addComponent(enterVINLabel)
                        .addGap(18, 18, 18)
                        .addComponent(vinDeleteCarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        deleteCarPanelLayout.setVerticalGroup(
            deleteCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteCarPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(deleteCarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterVINLabel)
                    .addComponent(vinDeleteCarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(removeCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        updateTabbedPane.addTab("Delete Car", deleteCarPanel);

        jLabel1.setText("Enter VIN");

        searchUpdateTabButton.setText("Search");
        searchUpdateTabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUpdateTabButtonActionPerformed(evt);
            }
        });

        carLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        carLabel1.setText("Car");

        transmissionLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        transmissionLabel1.setText("Transmission");

        vinLabel1.setText("VIN");

        makeLabel1.setText("Make");

        modelLabel1.setText("Model");

        yearLabel1.setText("Year");

        colorLabel1.setText("Color");

        priceLabel1.setText("Price");

        weightLabel1.setText("Weight");

        drivetrainLabel1.setText("Drivetrain");

        bodystyleLabel1.setText("Bodystyle");

        mileageLabel1.setText("Mileage");

        fuelTypeLabel1.setText("Fuel Type");

        displacementLabel1.setText("Displacement");

        numOfCylindersLabel1.setText("Number of Cylinders");

        engineModelLabel1.setText("Model");

        horsepowerLabel1.setText("Horsepower");

        torqueLabel1.setText("Torque");

        typeLabel1.setText("Type");

        transModelLabel1.setText("Model");

        numOfGearsLabel1.setText("Number of Gears");

        updateCarButton.setText("Update");
        updateCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCarButtonActionPerformed(evt);
            }
        });

        yearUpdateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearUpdateTextFieldActionPerformed(evt);
            }
        });

        horsepowerUpdateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horsepowerUpdateTextFieldActionPerformed(evt);
            }
        });

        transModelUpdateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transModelUpdateTextFieldActionPerformed(evt);
            }
        });

        driveTrainUpdateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RWD", "FWD", "AWD", "4x4", "4WD" }));

        bodyStyleUpdateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coupe", "Sedan", "SUV", "Convertible", "Pickup", "Hatchback", "Wagon", "Minivan", "Van" }));

        fuelTypeUpdateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gas", "Diesel", "E85", "Electric", "Natural Gas" }));

        numOfCylindersUpdateComboBox.setEditable(true);
        numOfCylindersUpdateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "8", "10", "12" }));

        transTypeUpdateComboBox.setEditable(true);
        transTypeUpdateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Automatic", "AutoManual", "CVT" }));

        numOfGearsUpdateComboBox.setEditable(true);
        numOfGearsUpdateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        makeUpdateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acura", "Alfa Romeo", "Aston Martin", "Audi", "Bentley", "BMW", "Buick", "Cadillac", "Chevrolet", "Chrysler", "Dodge", "Ferrari", "Fiat", "Ford", "Genesis", "GMC", "Honda", "Hyundai", "Infiniti", "Jaguar", "Jeep", "Kia", "Lamborghini", "Land Rover", "Lexus", "Lincoln", "Maserati", "Mazda", "McLaren", "Mercedes-Benz", "Mercury", "MINI", "Mitsubishi", "Nissan", "Pontiac", "Porsche", "RAM", "Rolls-Royce", "Saturn", "Scion", "Smart", "Subaru", "Tesla", "Toyota", "Volkswagen", "Volvo" }));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setText("Engine");

        javax.swing.GroupLayout addCarPanel1Layout = new javax.swing.GroupLayout(addCarPanel1);
        addCarPanel1.setLayout(addCarPanel1Layout);
        addCarPanel1Layout.setHorizontalGroup(
            addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drivetrainLabel1)
                    .addComponent(bodystyleLabel1)
                    .addComponent(mileageLabel1)
                    .addComponent(fuelTypeLabel1)
                    .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(priceLabel1)
                        .addComponent(weightLabel1))
                    .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(yearLabel1)
                        .addComponent(colorLabel1))
                    .addComponent(modelLabel1)
                    .addComponent(makeLabel1)
                    .addComponent(vinLabel1))
                .addGap(18, 18, 18)
                .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vinUpdateTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modelUpdateTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(yearUpdateTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(colorUpdateTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(priceUpdateTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(weightUpdateTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(makeUpdateComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 162, Short.MAX_VALUE)
                    .addComponent(bodyStyleUpdateComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mileageUpdateTextField)
                    .addComponent(fuelTypeUpdateComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(driveTrainUpdateComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addCarPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(carLabel1)))
                .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCarPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanel1Layout.createSequentialGroup()
                                            .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(horsepowerLabel1)
                                                .addComponent(torqueLabel1))
                                            .addGap(214, 214, 214))
                                        .addGroup(addCarPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(typeLabel1)
                                                .addComponent(transModelLabel1))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(transModelUpdateTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(transTypeUpdateComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addContainerGap())
                                        .addGroup(addCarPanel1Layout.createSequentialGroup()
                                            .addComponent(engineModelLabel1)
                                            .addGap(63, 63, 63)
                                            .addComponent(engineModelUpdateTextField)
                                            .addContainerGap()))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanel1Layout.createSequentialGroup()
                                        .addComponent(transmissionLabel1)
                                        .addGap(70, 70, 70))))
                            .addGroup(addCarPanel1Layout.createSequentialGroup()
                                .addComponent(numOfCylindersLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numOfCylindersUpdateComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(addCarPanel1Layout.createSequentialGroup()
                        .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addCarPanel1Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(horsepowerUpdateTextField)
                                    .addComponent(torqueUpdateTextField)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(addCarPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(numOfGearsLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(numOfGearsUpdateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addCarPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(displacementLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addCarPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(displacementUpdateTextField))))
                        .addContainerGap())))
        );
        addCarPanel1Layout.setVerticalGroup(
            addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCarPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vinUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vinLabel1)
                        .addComponent(displacementLabel1))
                    .addComponent(displacementUpdateTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanel1Layout.createSequentialGroup()
                        .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanel1Layout.createSequentialGroup()
                        .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addCarPanel1Layout.createSequentialGroup()
                                .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(makeUpdateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(makeLabel1))
                                .addGap(0, 7, Short.MAX_VALUE))
                            .addGroup(addCarPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(numOfCylindersUpdateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numOfCylindersLabel1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(engineModelLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(engineModelUpdateTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(transmissionLabel1)
                    .addGroup(addCarPanel1Layout.createSequentialGroup()
                        .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearLabel1)
                            .addComponent(horsepowerUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(horsepowerLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colorUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorLabel1)
                            .addComponent(torqueUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(torqueLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bodystyleLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCarPanel1Layout.createSequentialGroup()
                            .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(driveTrainUpdateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(drivetrainLabel1)
                                .addComponent(typeLabel1)
                                .addComponent(transTypeUpdateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bodyStyleUpdateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(transModelLabel1))))
                    .addComponent(transModelUpdateTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mileageLabel1)
                    .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mileageUpdateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numOfGearsLabel1)
                        .addComponent(numOfGearsUpdateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addCarPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fuelTypeLabel1)
                        .addComponent(fuelTypeUpdateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(vinUpdateTabTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchUpdateTabButton)
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addCarPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vinUpdateTabTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(searchUpdateTabButton))
                .addContainerGap(521, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 56, Short.MAX_VALUE)
                    .addComponent(addCarPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 56, Short.MAX_VALUE)))
        );

        updateTabbedPane.addTab("Update", jPanel1);

        carListTextArea.setEditable(false);
        carListTextArea.setColumns(20);
        carListTextArea.setRows(5);
        jScrollPane1.setViewportView(carListTextArea);

        loadButton.setText("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listInventoryPanelLayout = new javax.swing.GroupLayout(listInventoryPanel);
        listInventoryPanel.setLayout(listInventoryPanelLayout);
        listInventoryPanelLayout.setHorizontalGroup(
            listInventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listInventoryPanelLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listInventoryPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        listInventoryPanelLayout.setVerticalGroup(
            listInventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listInventoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        updateTabbedPane.addTab("List Inventory", listInventoryPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(updateTabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(updateTabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarButtonActionPerformed
        
        vin = vinTextField.getText();
        make = makeComboBox.getSelectedItem().toString();
        model = modelComboBox.getSelectedItem().toString();
        year = yearTextField.getText();
        color = colorTextField.getText();
        price = Double.parseDouble(priceTextField.getText());
        weight = weightTextField.getText();
        driveTrain = driveTrainComboBox.getSelectedItem().toString();
        bodyStyle = bodyStyleComboBox.getSelectedItem().toString();
        mileage = mileageTextField.getText();
        fuelType = fuelTypeComboBox.getSelectedItem().toString();
        displacement = displacementTextField.getText();
        numOfCylinders = numOfCylindersComboBox.getSelectedItem().toString();
        engineModel = engineModelTextField.getText();
        horsepower = horsepowerTextField.getText();
        torque = torqueTextField.getText();
        type = transTypeComboBox.getSelectedItem().toString();
        transModel = transModelTextField.getText();
        numOfGears = numOfGearsComboBox.getSelectedItem().toString();
        
        car = new Car();
        engine = new Engine();
        transmission = new Transmission();
                
        car.setVin(vin);
        car.setMake(make);
        car.setModel(model);
        car.setYear(year);
        car.setColor(color);
        car.setPrice(price);
        car.setWeight(weight);
        car.setDriveTrain(driveTrain);
        car.setBodyStyle(bodyStyle);
        car.setMileage(mileage);
        car.setFuelType(fuelType);
                
        engine.setDisplacement(displacement);
        engine.setNumOfCylinders(numOfCylinders);
        engine.setModel(engineModel);
        engine.setHorsepower(horsepower);
        engine.setTorque(torque);
        engine.setVIN(vin);
                
        transmission.setType(type);
        transmission.setModel(transModel);
        transmission.setNumOfGears(numOfGears);
        transmission.setVin(vin);
               
        car.setEngine(engine);
        car.setTransmission(transmission);
               
                
        cars.add(car);
                
        DBAccess.addCar(car);
        DBAccess.addEngine(engine);
        DBAccess.addTransmission(transmission);
        
        clearFields();             
    }//GEN-LAST:event_addCarButtonActionPerformed

    private void horsepowerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horsepowerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horsepowerTextFieldActionPerformed

    private void removeCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCarButtonActionPerformed
        String VIN = vinDeleteCarTextField.getText();
        DBAccess.deleteCar(VIN);
    }//GEN-LAST:event_removeCarButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        String VIN = vinDeleteCarTextField.getText();
        Car car1 = DBAccess.retrieveByVIN(VIN);
        if(car1==null){
            carDetailsTextArea.setText("No Matching VIN Found");
        }
        else{
            carDetailsTextArea.setText(car1.toString());
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        ArrayList<Car> Cars = new ArrayList<>();
        Cars = DBAccess.retrieveCars();
        String output = "";
        double totalPrice = 0.0;

        if(Cars!=null){
            for(int i=0; i<Cars.size(); i++){
                
                output+= Cars.get(i).toString();
                totalPrice += Cars.get(i).getPrice();
            }
            output+= "Number of cars in Inventory: " + Cars.size() + "\n";
            output+= "Total Inventory Price: " + totalPrice;
            carListTextArea.setText(output);
        }
        
        else{
            carListTextArea.setText("No Cars in Inventory");
        }
    }//GEN-LAST:event_loadButtonActionPerformed

    private void transModelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transModelTextFieldActionPerformed
        
    }//GEN-LAST:event_transModelTextFieldActionPerformed

    private void updateCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCarButtonActionPerformed
        
        String newVin = vinUpdateTextField.getText();
        String newMake = makeUpdateComboBox.getSelectedItem().toString();
        String newModel = modelUpdateTextField.getText();
        String newYear = yearUpdateTextField.getText();
        String newColor = colorUpdateTextField.getText();
        double newPrice = Double.parseDouble(priceUpdateTextField.getText());
        String newWeight = weightUpdateTextField.getText();
        String newDriveTrain = driveTrainUpdateComboBox.getSelectedItem().toString();
        String newBodyStyle = bodyStyleUpdateComboBox.getSelectedItem().toString();
        String newMileage = mileageUpdateTextField.getText();
        String newFuelType = fuelTypeUpdateComboBox.getSelectedItem().toString();
        String newDisplacement = displacementUpdateTextField.getText();
        String newNumOfCylinders = numOfCylindersUpdateComboBox.getSelectedItem().toString();
        String newEngineModel = engineModelUpdateTextField.getText();
        String newHorsepower = horsepowerUpdateTextField.getText();
        String newTorque = torqueUpdateTextField.getText();
        String newTransType = transTypeUpdateComboBox.getSelectedItem().toString();
        String newTransModel = transModelUpdateTextField.getText();
        String newNumOfGears = numOfGearsUpdateComboBox.getSelectedItem().toString();
        
        DBAccess.updateCar(vinUpdate, newVin, newMake, newModel, newYear, newColor, newPrice, newWeight, newDriveTrain, newBodyStyle, newMileage, newFuelType, newDisplacement, newNumOfCylinders, newHorsepower, newTorque, newEngineModel, newTransType, newTransModel, newNumOfGears);
    }//GEN-LAST:event_updateCarButtonActionPerformed

    private void horsepowerUpdateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horsepowerUpdateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horsepowerUpdateTextFieldActionPerformed

    private void transModelUpdateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transModelUpdateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transModelUpdateTextFieldActionPerformed

    private void searchUpdateTabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUpdateTabButtonActionPerformed
        
        vinUpdate = vinUpdateTabTextField.getText();
        Car car1 = DBAccess.retrieveByVIN(vinUpdate);
        vinUpdateTextField.setText(car1.getVin());
        makeUpdateComboBox.setSelectedItem(car1.getMake());
        modelUpdateTextField.setText(car1.getModel());
        yearUpdateTextField.setText(car1.getYear());
        colorUpdateTextField.setText(car1.getColor());
        priceUpdateTextField.setText(Double.toString(car1.getPrice()));
        weightUpdateTextField.setText(car1.getWeight());
        driveTrainUpdateComboBox.setSelectedItem(car1.getDriveTrain());
        bodyStyleUpdateComboBox.setSelectedItem(car1.getBodyStyle());
        mileageUpdateTextField.setText(car1.getMileage());
        fuelTypeUpdateComboBox.setSelectedItem(car1.getFuelType());
        displacementUpdateTextField.setText(car1.getEngine().getDisplacement());
        numOfCylindersUpdateComboBox.setSelectedItem(car1.getEngine().getNumOfCylinders());
        engineModelUpdateTextField.setText(car1.getEngine().getModel());
        horsepowerUpdateTextField.setText(car1.getEngine().getHorsepower());
        torqueUpdateTextField.setText(car1.getEngine().getTorque());
        transTypeUpdateComboBox.setSelectedItem(car1.getTransmission().getType());
        transModelUpdateTextField.setText(car1.getTransmission().getModel());
        numOfGearsUpdateComboBox.setSelectedItem(car1.getTransmission().getNumOfGears());
    }//GEN-LAST:event_searchUpdateTabButtonActionPerformed

    private void yearUpdateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearUpdateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearUpdateTextFieldActionPerformed

    private void makeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_makeComboBoxActionPerformed

    public void clearFields(){
        
        vinTextField.setText("");
        yearTextField.setText("");
        colorTextField.setText("");
        priceTextField.setText("");
        weightTextField.setText("");
        mileageTextField.setText("");
        displacementTextField.setText("");
        engineModelTextField.setText("");
        horsepowerTextField.setText("");
        torqueTextField.setText("");
        transModelTextField.setText("");
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCarButton;
    private javax.swing.JPanel addCarPanel;
    private javax.swing.JPanel addCarPanel1;
    private javax.swing.JComboBox<String> bodyStyleComboBox;
    private javax.swing.JComboBox<String> bodyStyleUpdateComboBox;
    private javax.swing.JLabel bodystyleLabel;
    private javax.swing.JLabel bodystyleLabel1;
    private javax.swing.JTextArea carDetailsTextArea;
    private javax.swing.JLabel carLabel;
    private javax.swing.JLabel carLabel1;
    private javax.swing.JTextArea carListTextArea;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JLabel colorLabel1;
    private javax.swing.JTextField colorTextField;
    private javax.swing.JTextField colorUpdateTextField;
    private javax.swing.JPanel deleteCarPanel;
    private javax.swing.JLabel displacementLabel;
    private javax.swing.JLabel displacementLabel1;
    private javax.swing.JTextField displacementTextField;
    private javax.swing.JTextField displacementUpdateTextField;
    private javax.swing.JComboBox<String> driveTrainComboBox;
    private javax.swing.JComboBox<String> driveTrainUpdateComboBox;
    private javax.swing.JLabel drivetrainLabel;
    private javax.swing.JLabel drivetrainLabel1;
    private javax.swing.JLabel engineLabel;
    private javax.swing.JLabel engineModelLabel;
    private javax.swing.JLabel engineModelLabel1;
    private javax.swing.JTextField engineModelTextField;
    private javax.swing.JTextField engineModelUpdateTextField;
    private javax.swing.JLabel enterVINLabel;
    private javax.swing.JComboBox<String> fuelTypeComboBox;
    private javax.swing.JLabel fuelTypeLabel;
    private javax.swing.JLabel fuelTypeLabel1;
    private javax.swing.JComboBox<String> fuelTypeUpdateComboBox;
    private javax.swing.JLabel horsepowerLabel;
    private javax.swing.JLabel horsepowerLabel1;
    private javax.swing.JTextField horsepowerTextField;
    private javax.swing.JTextField horsepowerUpdateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel listInventoryPanel;
    private javax.swing.JButton loadButton;
    private javax.swing.JComboBox<String> makeComboBox;
    private javax.swing.JLabel makeLabel;
    private javax.swing.JLabel makeLabel1;
    private javax.swing.JComboBox<String> makeUpdateComboBox;
    private javax.swing.JLabel mileageLabel;
    private javax.swing.JLabel mileageLabel1;
    private javax.swing.JTextField mileageTextField;
    private javax.swing.JTextField mileageUpdateTextField;
    private javax.swing.JComboBox<String> modelComboBox;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JLabel modelLabel1;
    private javax.swing.JTextField modelUpdateTextField;
    private javax.swing.JComboBox<String> numOfCylindersComboBox;
    private javax.swing.JLabel numOfCylindersLabel;
    private javax.swing.JLabel numOfCylindersLabel1;
    private javax.swing.JComboBox<String> numOfCylindersUpdateComboBox;
    private javax.swing.JComboBox<String> numOfGearsComboBox;
    private javax.swing.JLabel numOfGearsLabel;
    private javax.swing.JLabel numOfGearsLabel1;
    private javax.swing.JComboBox<String> numOfGearsUpdateComboBox;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel priceLabel1;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JTextField priceUpdateTextField;
    private javax.swing.JButton removeCarButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchUpdateTabButton;
    private javax.swing.JLabel torqueLabel;
    private javax.swing.JLabel torqueLabel1;
    private javax.swing.JTextField torqueTextField;
    private javax.swing.JTextField torqueUpdateTextField;
    private javax.swing.JLabel transModelLabel;
    private javax.swing.JLabel transModelLabel1;
    private javax.swing.JTextField transModelTextField;
    private javax.swing.JTextField transModelUpdateTextField;
    private javax.swing.JComboBox<String> transTypeComboBox;
    private javax.swing.JComboBox<String> transTypeUpdateComboBox;
    private javax.swing.JLabel transmissionLabel;
    private javax.swing.JLabel transmissionLabel1;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel typeLabel1;
    private javax.swing.JButton updateCarButton;
    private javax.swing.JTabbedPane updateTabbedPane;
    private javax.swing.JTextField vinDeleteCarTextField;
    private javax.swing.JLabel vinLabel;
    private javax.swing.JLabel vinLabel1;
    private javax.swing.JTextField vinTextField;
    private javax.swing.JTextField vinUpdateTabTextField;
    private javax.swing.JTextField vinUpdateTextField;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JLabel weightLabel1;
    private javax.swing.JTextField weightTextField;
    private javax.swing.JTextField weightUpdateTextField;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JLabel yearLabel1;
    private javax.swing.JTextField yearTextField;
    private javax.swing.JTextField yearUpdateTextField;
    // End of variables declaration//GEN-END:variables
}
