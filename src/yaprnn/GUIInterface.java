package yaprnn;

import java.util.Collection;
import java.util.List;

import yaprnn.dvv.Data;

public interface GUIInterface {

	/**
	 * Updates the data points in the Training-Error graph.
	 * 
	 * @param errorData
	 *            the training error data points
	 */
	public void setTrainingError(List<Double> errorData);

	/**
	 * Updates the data points in the TestError-Graph.
	 * 
	 * @param errorData
	 *            the test error data points
	 */
	public void setTestError(List<Double> errorData);

	/**
	 * Updates the DataSet-List.
	 * 
	 * @param dataset
	 *            the dataset
	 */
	public void setDataSet(Collection<Data> dataset);

}
