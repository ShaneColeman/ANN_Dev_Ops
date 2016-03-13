/**
 * Created by Windows on 08/03/2016.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;

/**
 *
 * @author Windows
 */
public class ANNDriver {

    public static void main(String[] args) throws FileNotFoundException
    {

        ANNDataSetSetup nNC = new ANNDataSetSetup();

        //nNC.trainedMLPDataSetTrain();
        //nNC.savedMLPDataSetTest();

        //nNC.trainedMLPDSTrainFile();
        //nNC.savedMLPDSTestFile();

        nNC.trainedMLPBDSTrainFile();
        //nNC.savedMLPBDSTestFile();



        //Test Code - Can Remove
        /*
        DataSetTrain dataTrain;
        DataSetTest dataTest;

        //private BackPropagation bP;
        MomentumBackpropagation mBP;

        //Training Data Set
        //dataSetTrainingCreation();

        dataTrain = new DataSetTrain(8,4);

        dataTrain.addTrainingDataSetRow(new double[]{0.160931174, 0.486666667, 0.2, 0, 0, 0.35, 0.363636364, 0},
                new double[]{0, 0, 1, 0});
        dataTrain.addTrainingDataSetRow(new double[]{0.237854251, 0.733333333, 0.6, 0, 1, 0.025, 0.818181818, 0.428571429},
                new double[]{0, 0, 0, 1});
        dataTrain.addTrainingDataSetRow(new double[]{0.208502024, 0.466666667, 0.3, 0, 1, 0.3, 1, 0},
                new double[]{0, 0, 1, 0});
        dataTrain.addTrainingDataSetRow(new double[]{0.19534413, 0.6, 0.3, 0, 1, 0.3, 0.727272727, 0},
                new double[]{0, 0, 1, 0});

        //Set Data Set Attribute Column Names
        //setColumnNames(dataTrain.getTrainingDataSet());
        //System.out.println(Arrays.toString(dataTrain.getTrainingColumnNames()));

        //Multi-Layer Perceptron Artificial Neural Network  - User Defined
        MultiLayerPerceptronANN mlp1 = new MultiLayerPerceptronANN();
        mlp1.multiLayerPerceptron(TransferFunctionType.SIGMOID, 8, 6, 4);

        //BackPropagation
        //bP = new BackPropagation();
        //bP.setMaxError(0.04);
        //bP.setLearningRate(0.2);

        //Momentum BackPropagation
        mBP = new MomentumBackpropagation();
        mBP.setMaxError(0.04);
        mBP.setLearningRate(0.2);
        mBP.setMomentum(0.7);

        //Learning the Data Set using BackPropagation Learning Rule Algorithm
        //mlp1.learnDataSetWithBackP(dataTrain.getTrainingDataSet(),bP);

        //Learning the Data Set using Momentum BackPropagation Learning Rule Algorithm
        mlp1.learnDataSetWithMBackP(dataTrain.getTrainingDataSet(),mBP);

        //Total Network Error of Current Iteration - Momentum BackPropagation
        System.out.println("\nTotal Network Error of Current Iteration: " + mBP.getTotalNetworkError());

        //Input / Output (Desired) Values - Train Data Set
        //System.out.println("\nTraining - Input / Output Values (Desired): " + dataTrain.getTrainingDataSet().getRows());

        //Test Neural Network - Multi Layer Perceptron Sigmoid 8 6 4
        System.out.println("\nTesting Trained Neural Network");
        testANN(mlp1.getMultiLayerPerceptron(),dataTrain.getTrainingDataSet());

        //Current Iteration - BackPropagation
        //System.out.println("\nCurrent Iteration: " + bP.getCurrentIteration());

        //Current Iteration - Momentum BackPropagation
        System.out.println("\nCurrent Iteration: " + mBP.getCurrentIteration());

        //Max Error - BackPropagation
        //System.out.println("\nMax Error: " + bP.getTotalNetworkError());

        //Save Neural Network
        mlp1.saveNeuralNetwork("mlp1_sig_8_6_4.nnet");
        System.out.println("\nMulti-Layer Perceptron A.N.N. (Sigmoid, 8, 6, 4) saved");
        */
    }

        //Test Method - Can Remove
        /*
        public static void testANN(NeuralNetwork aNN, DataSet dataSet)
        {
            Iterator<DataSetRow> it = dataSet.getRows().iterator();
            double[] aNNOutput;
            DataSetRow dataRow;
            //MeanSquaredError mSE = new MeanSquaredError(0.00);

            while(it.hasNext())
            {
                dataRow = it.next();
                aNN.setInput(dataRow.getInput());
                aNN.calculate();
                aNNOutput = aNN.getOutput();
                System.out.println("\nInput: " + Arrays.toString(dataRow.getInput()));
                System.out.println("Output: " + Arrays.toString(aNNOutput));
                System.out.println("Desired Output: " + Arrays.toString(dataRow.getDesiredOutput()));
                //mSE.calculatePatternError(aNNOutput, dataRow.getDesiredOutput();
            }

            //System.out.println("\nTotal Network Error: " + mSE.getTotalError());
        }
        */
    }

