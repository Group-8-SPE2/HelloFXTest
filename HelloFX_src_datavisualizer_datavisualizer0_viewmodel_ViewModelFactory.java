package datavisualizer.datavisualizer0.viewmodel;

import datavisualizer.datavisualizer0.model.ModelFactory;
import datavisualizer.datavisualizer0.viewmodel.piechart.PieChartViewModel;

public class ViewModelFactory {

    private PieChartViewModel pieChartViewModel;

    public ViewModelFactory(ModelFactory modelFactory) {
        pieChartViewModel = new PieChartViewModel(modelFactory.getDataModel());
    }

    public PieChartViewModel getPieChartViewModel() {
        return pieChartViewModel;
    }
}
