package com.company.accounting_for_vacancies.screen.structural_unit;

import io.jmix.ui.screen.*;
import com.company.accounting_for_vacancies.entity.Structural_unit;

@UiController("Structural_unit.edit")
@UiDescriptor("structural_unit-edit.xml")
@EditedEntityContainer("structural_unitDc")
public class Structural_unitEdit extends StandardEditor<Structural_unit> {
}