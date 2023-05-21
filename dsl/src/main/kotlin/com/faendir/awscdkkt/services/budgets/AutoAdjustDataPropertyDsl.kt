package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudget

@Generated
public fun autoAdjustDataProperty(initializer: CfnBudget.AutoAdjustDataProperty.Builder.() -> Unit =
    {}): CfnBudget.AutoAdjustDataProperty =
    CfnBudget.AutoAdjustDataProperty.builder().apply(initializer).build()
