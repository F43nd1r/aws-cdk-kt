@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudget

public
    fun historicalOptionsProperty(initializer: CfnBudget.HistoricalOptionsProperty.Builder.() -> Unit):
    CfnBudget.HistoricalOptionsProperty =
    CfnBudget.HistoricalOptionsProperty.builder().apply(initializer).build()
