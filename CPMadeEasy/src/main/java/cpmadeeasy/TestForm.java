package cpmadeeasy;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 */
public class TestForm
{
	private JList jListContestsList;
	private JPanel jPanelContests;

	{
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
		$$$setupUI$$$();
	}

	/**
	 * Method generated by IntelliJ IDEA GUI Designer
	 * >>> IMPORTANT!! <<<
	 * DO NOT edit this method OR call it in your code!
	 *
	 * @noinspection ALL
	 */
	private void $$$setupUI$$$()
	{
		jPanelContests = new JPanel();
		jPanelContests.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
		final JScrollPane scrollPane1 = new JScrollPane();
		jPanelContests.add(scrollPane1,
				new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
						GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW,
						GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null,
						0, false));
		jListContestsList = new JList();
		jListContestsList.setSelectedIndex(-1);
		jListContestsList.setSelectionMode(0);
		jListContestsList.setVisibleRowCount(20);
		scrollPane1.setViewportView(jListContestsList);
	}

	/**
	 * @noinspection ALL
	 */
	public JComponent $$$getRootComponent$$$()
	{
		return jPanelContests;
	}

	public TestForm()
	{
		jListContestsList.addMouseListener(new MouseAdapter()
		{
			@Override public void mouseClicked(MouseEvent e)
			{
				super.mouseClicked(e);
			}
		});

		jPanelContests.setBackground(new Color(60, 63, 65));
		jPanelContests.setEnabled(true);
	}

}