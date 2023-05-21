package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudgetsAction

@Generated
public
    fun iamActionDefinitionProperty(initializer: CfnBudgetsAction.IamActionDefinitionProperty.Builder.() -> Unit
    = {}): CfnBudgetsAction.IamActionDefinitionProperty =
    CfnBudgetsAction.IamActionDefinitionProperty.builder().apply(initializer).build()
