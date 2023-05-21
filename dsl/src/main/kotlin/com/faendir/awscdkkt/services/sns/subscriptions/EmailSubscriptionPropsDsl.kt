package com.faendir.awscdkkt.services.sns.subscriptions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.subscriptions.EmailSubscriptionProps

@Generated
public fun emailSubscriptionProps(initializer: EmailSubscriptionProps.Builder.() -> Unit = {}):
    EmailSubscriptionProps = EmailSubscriptionProps.builder().apply(initializer).build()
