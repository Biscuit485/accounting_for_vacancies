package com.company.accounting_for_vacancies.screen.vacancies;

import io.jmix.ui.screen.*;
import com.company.accounting_for_vacancies.entity.Vacancies;

@UiController("Vacancies.browse")
@UiDescriptor("vacancies-browse.xml")
@LookupComponent("vacanciesesTable")
public class VacanciesBrowse extends StandardLookup<Vacancies> {
}