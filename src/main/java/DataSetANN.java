/**
 * Created by Windows on 08/03/2016.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;

/**
 *
 * @author Windows
 */
public abstract class DataSetANN
{
    private int inputs;
    private int outputs;
    //private DataSet dataSet;

    /*
    public DataSetANN()
    {
        this.inputs = 0;
        this.outputs = 0;
    }
    */


    public DataSetANN(int inputs, int outputs)
    {
        this.inputs = inputs;
        this.outputs = outputs;

        //setNumberOfInputs(inputs);
        //setNumberOfOutputs(outputs);

        //dataSet = new DataSet(getNumberOfInputs(), getNumberOfOutputs());
    }

    public void setNumberOfInputs(int inputs){this.inputs = inputs;}

    public void setNumberOfOutputs(int outputs){this.outputs = outputs;}

    public int getNumberOfInputs(){return inputs;}

    public int getNumberOfOutputs(){return outputs;}

    public void addTrainingDataSetRow(double[] inputs, double[] outputs){};

    public void addTestingDataSetRow(double[] inputs, double[] outputs){};

    public void addDataSetRow(DataSetRow dataSetRow){};

    //public DataSet getDataSet(){return dataSet;}

    public int getTotalNeurons(){return inputs + outputs;}

}
