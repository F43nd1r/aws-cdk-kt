@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudget

public fun notificationProperty(initializer: CfnBudget.NotificationProperty.Builder.() -> Unit):
    CfnBudget.NotificationProperty =
    CfnBudget.NotificationProperty.builder().apply(initializer).build()
