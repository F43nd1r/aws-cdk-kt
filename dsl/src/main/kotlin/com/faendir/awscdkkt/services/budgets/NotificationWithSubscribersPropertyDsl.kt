@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudget

public
    fun notificationWithSubscribersProperty(initializer: CfnBudget.NotificationWithSubscribersProperty.Builder.() -> Unit):
    CfnBudget.NotificationWithSubscribersProperty =
    CfnBudget.NotificationWithSubscribersProperty.builder().apply(initializer).build()
