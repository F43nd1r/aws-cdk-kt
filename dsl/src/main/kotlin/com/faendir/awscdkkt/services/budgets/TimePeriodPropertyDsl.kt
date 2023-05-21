package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudget

@Generated
public fun timePeriodProperty(initializer: CfnBudget.TimePeriodProperty.Builder.() -> Unit = {}):
    CfnBudget.TimePeriodProperty = CfnBudget.TimePeriodProperty.builder().apply(initializer).build()
