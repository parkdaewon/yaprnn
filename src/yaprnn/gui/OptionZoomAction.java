package yaprnn.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

class OptionZoomAction implements ActionListener {

	private GUI gui;

	OptionZoomAction(GUI gui) {
		this.gui = gui;
		gui.getView().getOptionZoom().addActionListener(this);
		gui.getView().getOptionZoom().addKeyListener(
				new OnlyNumbersKeyAdapter());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object item = gui.getView().getOptionZoom().getSelectedItem();
		if (item instanceof String) {
			try {
				gui.setZoom(Double.parseDouble((String) item));
			} catch (Exception ex) {
				JOptionPane
						.showMessageDialog(
								gui.getView(),
								"The value you have entered cannot be parsed to floating point value. Please enter a correct zoom value.",
								"Parsing error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

}
