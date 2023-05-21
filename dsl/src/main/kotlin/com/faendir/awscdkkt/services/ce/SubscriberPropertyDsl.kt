package com.faendir.awscdkkt.services.ce

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ce.CfnAnomalySubscription

@Generated
public
    fun subscriberProperty(initializer: CfnAnomalySubscription.SubscriberProperty.Builder.() -> Unit
    = {}): CfnAnomalySubscription.SubscriberProperty =
    CfnAnomalySubscription.SubscriberProperty.builder().apply(initializer).build()
