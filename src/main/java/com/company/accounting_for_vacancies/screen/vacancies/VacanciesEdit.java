package com.company.accounting_for_vacancies.screen.vacancies;

import io.jmix.ui.screen.*;
import com.company.accounting_for_vacancies.entity.Vacancies;

@UiController("Vacancies.edit")
@UiDescriptor("vacancies-edit.xml")
@EditedEntityContainer("vacanciesDc")
public class VacanciesEdit extends StandardEditor<Vacancies> {
}