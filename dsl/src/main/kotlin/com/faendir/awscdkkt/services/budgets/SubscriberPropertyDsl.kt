package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudgetsAction

@Generated
public fun subscriberProperty(initializer: CfnBudgetsAction.SubscriberProperty.Builder.() -> Unit =
    {}): CfnBudgetsAction.SubscriberProperty =
    CfnBudgetsAction.SubscriberProperty.builder().apply(initializer).build()
