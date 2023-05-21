package com.faendir.awscdkkt.services.sns.subscriptions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.subscriptions.SmsSubscriptionProps

@Generated
public fun smsSubscriptionProps(initializer: SmsSubscriptionProps.Builder.() -> Unit = {}):
    SmsSubscriptionProps = SmsSubscriptionProps.builder().apply(initializer).build()
