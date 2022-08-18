package com.company.accounting_for_vacancies.screen.structural_unit;

import io.jmix.ui.screen.*;
import com.company.accounting_for_vacancies.entity.Structural_unit;

@UiController("Structural_unit.browse")
@UiDescriptor("structural_unit-browse.xml")
@LookupComponent("structural_unitsTable")
public class Structural_unitBrowse extends StandardLookup<Structural_unit> {
}