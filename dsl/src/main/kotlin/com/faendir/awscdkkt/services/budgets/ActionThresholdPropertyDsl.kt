package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudgetsAction

@Generated
public
    fun actionThresholdProperty(initializer: CfnBudgetsAction.ActionThresholdProperty.Builder.() -> Unit
    = {}): CfnBudgetsAction.ActionThresholdProperty =
    CfnBudgetsAction.ActionThresholdProperty.builder().apply(initializer).build()
