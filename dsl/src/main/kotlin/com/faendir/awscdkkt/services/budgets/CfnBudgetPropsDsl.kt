package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudgetProps

@Generated
public fun cfnBudgetProps(initializer: CfnBudgetProps.Builder.() -> Unit = {}): CfnBudgetProps =
    CfnBudgetProps.builder().apply(initializer).build()
