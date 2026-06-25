package Lab5;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import javax.swing.*;
import java.awt.*;

public class BigOAnalysisGraph extends ApplicationFrame {

    public BigOAnalysisGraph(String title) {
        super(title);
        JFreeChart combinedChart = createChartFromOriginalCode();
        ChartPanel panel = new ChartPanel(combinedChart);
        panel.setPreferredSize(new Dimension(1400, 600));
        setContentPane(panel);
    }

    private JFreeChart createChartFromOriginalCode() {
        int maxN = 15; // ทดสอบขนาด n ตั้งแต่ 1 ถึง 15 เพื่อดูจุดหักเหที่ n = 5

        XYSeries seriesQ1 = new XYSeries("Q1: O(n^2)");
        XYSeries seriesQ2 = new XYSeries("Q2: O(1)");
        XYSeries seriesQ3 = new XYSeries("Q3: O(n^2)");

        // วนลูปเพื่อทดสอบ Varying the size (n) ของ Array
        for (int n = 1; n <= maxN; n++) {
            int[] array = new int[n];
            int[] newArray = new int[n];

            // รันโค้ดต้นฉบับแต่ละข้อและเก็บจำนวนรอบการทำงานมาพล็อตกราฟ
            seriesQ1.add(n, runQuestion1(array, newArray));
            seriesQ2.add(n, runQuestion2(array, newArray));
            seriesQ3.add(n, runQuestion3(array, newArray));
        }

        // รวมกราฟย่อยทั้ง 3 ข้อเข้าด้วยกัน
        XYPlot plot1 = createSubPlot(seriesQ1, "Operations (Q1)", Color.BLUE);
        XYPlot plot2 = createSubPlot(seriesQ2, "Operations (Q2)", Color.ORANGE);
        XYPlot plot3 = createSubPlot(seriesQ3, "Operations (Q3)", Color.GREEN);

        CombinedDomainXYPlot parentPlot = new CombinedDomainXYPlot(new NumberAxis("Array Length (n)"));
        parentPlot.setGap(30.0);
        parentPlot.add(plot1, 1);
        parentPlot.add(plot2, 1);
        parentPlot.add(plot3, 1);
        parentPlot.setOrientation(PlotOrientation.VERTICAL);

        JFreeChart chart = new JFreeChart("Computational Performance Analysis (From Assignment Code)",
                JFreeChart.DEFAULT_TITLE_FONT, parentPlot, true);
        ChartFactory.getChartTheme().apply(chart);
        return chart;
    }

    // ==========================================
    // Question 1: โค้ดต้นฉบับตัวเต็มของข้อ 1
    // ==========================================
    private static int runQuestion1(int[] array, int[] newArray) {
        int opCount = 0; // ตัวนับรอบการทำงานจริงของคอมพิวเตอร์

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
            opCount++;
        }
        for (int i = 0; i < array.length; i++) {
            newArray[i] = 0;
            opCount++;
            for (int j = 0; j < array.length; j++) {
                newArray[i] += array[i];
                newArray[i] += array[j];
                opCount += 2; // มีการบวกสะสม 2 บรรทัด
            }
        }
        return opCount;
    }

    // ==========================================
    // Question 2: โค้ดต้นฉบับที่มีเงื่อนไข  <= 5
    // ==========================================
    private static int runQuestion2(int[] array, int[] newArray) {
        int opCount = 0;

        if (array.length <= 5) {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] * 2;
                opCount++;
            }
            for (int i = 0; i < array.length; i++) {
                newArray[i] = 0;
                opCount++;
                for (int j = 0; j < array.length; j++) {
                    newArray[i] += array[i];
                    newArray[i] += array[j];
                    opCount += 2;
                }
            }
        } else {
            newArray = array;
            opCount++; // ทำงานคงที่ 1 ครั้งเมื่อตกเข้า else
        }
        return opCount;
    }

    // ==========================================
    // Question 3: โค้ดต้นฉบับที่มีเงื่อนไข >= 5
    // ==========================================
    private static int runQuestion3(int[] array, int[] newArray) {
        int opCount = 0;

        if (array.length >= 5) {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] * 2;
                opCount++;
            }
            for (int i = 0; i < array.length; i++) {
                newArray[i] = 0;
                opCount++;
                for (int j = 0; j < array.length; j++) {
                    newArray[i] += array[i];
                    newArray[i] += array[j];
                    opCount += 2;
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i] * 2;
                opCount++;
            }
        }
        return opCount;
    }

    // Method สร้างกราฟย่อย
    private XYPlot createSubPlot(XYSeries series, String yLabel, Color color) {
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        NumberAxis rangeAxis = new NumberAxis(yLabel);
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, color);
        renderer.setSeriesShapesVisible(0, true);

        XYPlot subplot = new XYPlot(dataset, null, rangeAxis, renderer);
        subplot.setDomainGridlinesVisible(true);
        subplot.setRangeGridlinesVisible(true);
        return subplot;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BigOAnalysisGraph demo = new BigOAnalysisGraph("Big O Assignment Report");
            demo.pack();
            RefineryUtilities.centerFrameOnScreen(demo);
            demo.setVisible(true);
            demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}