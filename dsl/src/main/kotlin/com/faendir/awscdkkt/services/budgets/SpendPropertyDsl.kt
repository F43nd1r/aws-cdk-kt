package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudget

@Generated
public fun spendProperty(initializer: CfnBudget.SpendProperty.Builder.() -> Unit = {}):
    CfnBudget.SpendProperty = CfnBudget.SpendProperty.builder().apply(initializer).build()
