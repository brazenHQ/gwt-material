/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.client.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.CssName;
import gwt.material.design.client.ui.html.Div;

import static gwt.material.design.client.js.JsMaterialElement.$;

//@formatter:off

/**
 * Material Parallax is an effect where the background content or image in this case, is moved at a different speed than the foreground content while scrolling. Check out the demo to get a better idea of it.
 * <p>
 * <h3>UiBinder Usage:</h3>
 * <pre>
 * {@code
 *
 * <m:MaterialParallax>
 *     <m:MaterialImage url="http://i.imgur.com/CiPPh6h.jpg" />
 * </m:MaterialParallax>
 *
 * <m:MaterialTitle title="Sample" description="SADASD ASD DAS "/>
 *
 * <m:MaterialParallax>
 *    <m:MaterialImage url="http://i.imgur.com/CiPPh6h.jpg" />
 * </m:MaterialParallax>
 *
 * <m:MaterialTitle title="Sample" description="SADASD ASD DAS "/>
 *
 * <m:MaterialParallax>
 *    <m:MaterialImage url="http://i.imgur.com/CiPPh6h.jpg" />
 * </m:MaterialParallax>
 *
 * <m:MaterialTitle title="Sample" description="SADASD ASD DAS "/>
 * }
 * <pre>
 * @author kevzlou7979
 * @author Ben Dol
 * @see <a href="http://gwtmaterialdesign.github.io/gwt-material-demo/#showcase">Material Parallax</a>
 */
//@formatter:on
public class MaterialParallax extends MaterialWidget {

    private Div container = new Div();

    public MaterialParallax() {
        super(Document.get().createDivElement(), CssName.PARALLAX_CONTAINER);
        build();
    }

    @Override
    protected void build() {
        super.add(container);
        container.setStyleName(CssName.PARALLAX);
    }

    @Override
    public void add(Widget child) {
        container.add(child);
    }

    @Override
    protected void onLoad() {
        super.onLoad();

        $(container.getElement()).parallax();
    }

    public Div getContainer() {
        return container;
    }
}
