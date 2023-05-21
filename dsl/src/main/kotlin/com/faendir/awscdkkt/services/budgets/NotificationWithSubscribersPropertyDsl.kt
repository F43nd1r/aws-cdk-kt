package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudget

@Generated
public
    fun notificationWithSubscribersProperty(initializer: CfnBudget.NotificationWithSubscribersProperty.Builder.() -> Unit
    = {}): CfnBudget.NotificationWithSubscribersProperty =
    CfnBudget.NotificationWithSubscribersProperty.builder().apply(initializer).build()
