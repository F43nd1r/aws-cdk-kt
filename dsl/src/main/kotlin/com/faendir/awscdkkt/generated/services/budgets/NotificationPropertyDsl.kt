package com.faendir.awscdkkt.generated.services.budgets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudget

@Generated
public fun buildNotificationProperty(initializer: @AwsCdkDsl
    CfnBudget.NotificationProperty.Builder.() -> Unit = {}): CfnBudget.NotificationProperty =
    CfnBudget.NotificationProperty.Builder().apply(initializer).build()
