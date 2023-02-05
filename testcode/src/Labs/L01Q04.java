package Labs;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class L01Q04 {
   public static void main(String[] args) {
      DefaultCategoryDataset data = createDataset();
      JFreeChart chart = ChartFactory.createLineChart("Monthly Sales", "Month", "Amount", data);
      ChartFrame frame = new ChartFrame("L01Q04", chart);
      frame.pack();
      frame.setVisible(true);
   }

   private static DefaultCategoryDataset createDataset() {
      DefaultCategoryDataset dataset = new DefaultCategoryDataset();
      dataset.addValue(2500, "Amount", "Jan 2016");
      dataset.addValue(1600, "Amount", "Feb 2016");
      dataset.addValue(2000, "Amount", "Mar 2016");
      dataset.addValue(2700, "Amount", "Apr 2016");
      dataset.addValue(3200, "Amount", "May 2016");
      dataset.addValue(800, "Amount", "Jun 2016");
      return dataset;
   }
}