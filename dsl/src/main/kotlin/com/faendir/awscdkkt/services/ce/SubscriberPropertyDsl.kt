@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ce

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ce.CfnAnomalySubscription

public
    fun subscriberProperty(initializer: CfnAnomalySubscription.SubscriberProperty.Builder.() -> Unit):
    CfnAnomalySubscription.SubscriberProperty =
    CfnAnomalySubscription.SubscriberProperty.builder().apply(initializer).build()
