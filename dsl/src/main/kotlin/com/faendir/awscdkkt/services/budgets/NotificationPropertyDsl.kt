package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudget

@Generated
public fun notificationProperty(initializer: CfnBudget.NotificationProperty.Builder.() -> Unit =
    {}): CfnBudget.NotificationProperty =
    CfnBudget.NotificationProperty.builder().apply(initializer).build()
