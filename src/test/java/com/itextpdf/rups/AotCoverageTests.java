package com.itextpdf.rups;

import com.itextpdf.rups.view.icons.IconFetcher;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;

public class AotCoverageTests {
    @Test
    public void launcherTest() {
        Rups.setLookandFeel();
        Rups.initApplication(new JFrame());
    }

    @Test
    public void filePickerTest() {
        new JFileChooser();
    }

    @Test
    public void iconTest() {
        IconFetcher.getIcon("add.png");
        IconFetcher.getIcon("array.png");
        IconFetcher.getIcon("array.png");
        IconFetcher.getIcon("attribute.png");
        IconFetcher.getIcon("boolean.png");
        IconFetcher.getIcon("bullet_go.png");
        IconFetcher.getIcon("chart_organisation.png");
        IconFetcher.getIcon("cross.png");
        IconFetcher.getIcon("dictionary.png");
        IconFetcher.getIcon("form.png");
        IconFetcher.getIcon("name.png");
        IconFetcher.getIcon("navigation_first.png");
        IconFetcher.getIcon("navigation_last.png");
        IconFetcher.getIcon("navigation_next.png");
        IconFetcher.getIcon("navigation_previous.png");
        IconFetcher.getIcon("null.png");
        IconFetcher.getIcon("number.png");
        IconFetcher.getIcon("outline.png");
        IconFetcher.getIcon("page.png");
        IconFetcher.getIcon("pages.png");
        IconFetcher.getIcon("pdf.png");
        IconFetcher.getIcon("pi.png");
        IconFetcher.getIcon("ref.png");
        IconFetcher.getIcon("ref_recursive.png");
        IconFetcher.getIcon("stream.png");
        IconFetcher.getIcon("string.png");
        IconFetcher.getIcon("tag.png");
        IconFetcher.getIcon("text.png");
        IconFetcher.getIcon("xfa.png");
    }

    @Test
    public void resourceBundleTest() {
        ResourceBundle.getBundle("bundles/rups-lang", Locale.forLanguageTag("en-US"));
        ResourceBundle.getBundle("bundles/rups-lang", Locale.forLanguageTag("nl-NL"));
    }
}
