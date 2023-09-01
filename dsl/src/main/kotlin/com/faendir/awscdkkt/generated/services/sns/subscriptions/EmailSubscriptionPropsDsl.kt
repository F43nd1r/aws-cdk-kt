package com.faendir.awscdkkt.generated.services.sns.subscriptions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.subscriptions.EmailSubscriptionProps

@Generated
public fun buildEmailSubscriptionProps(initializer: @AwsCdkDsl
    EmailSubscriptionProps.Builder.() -> Unit = {}): EmailSubscriptionProps =
    EmailSubscriptionProps.Builder().apply(initializer).build()
