@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ce

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ce.CfnAnomalySubscription

public
    fun subscriberProperty(initializer: CfnAnomalySubscription.SubscriberProperty.Builder.() -> Unit):
    CfnAnomalySubscription.SubscriberProperty =
    CfnAnomalySubscription.SubscriberProperty.builder().apply(initializer).build()
