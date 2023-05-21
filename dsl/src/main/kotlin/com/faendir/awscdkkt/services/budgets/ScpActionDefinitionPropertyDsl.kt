package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudgetsAction

@Generated
public
    fun scpActionDefinitionProperty(initializer: CfnBudgetsAction.ScpActionDefinitionProperty.Builder.() -> Unit
    = {}): CfnBudgetsAction.ScpActionDefinitionProperty =
    CfnBudgetsAction.ScpActionDefinitionProperty.builder().apply(initializer).build()
