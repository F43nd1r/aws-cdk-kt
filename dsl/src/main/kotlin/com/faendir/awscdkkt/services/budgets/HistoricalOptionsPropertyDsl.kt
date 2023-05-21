package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudget

@Generated
public
    fun historicalOptionsProperty(initializer: CfnBudget.HistoricalOptionsProperty.Builder.() -> Unit
    = {}): CfnBudget.HistoricalOptionsProperty =
    CfnBudget.HistoricalOptionsProperty.builder().apply(initializer).build()
