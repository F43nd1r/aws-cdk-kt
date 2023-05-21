package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudgetsAction

@Generated
public
    fun ssmActionDefinitionProperty(initializer: CfnBudgetsAction.SsmActionDefinitionProperty.Builder.() -> Unit
    = {}): CfnBudgetsAction.SsmActionDefinitionProperty =
    CfnBudgetsAction.SsmActionDefinitionProperty.builder().apply(initializer).build()
