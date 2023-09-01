package com.faendir.awscdkkt.generated.services.sns.subscriptions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.subscriptions.SmsSubscriptionProps

@Generated
public fun buildSmsSubscriptionProps(initializer: @AwsCdkDsl SmsSubscriptionProps.Builder.() -> Unit
    = {}): SmsSubscriptionProps = SmsSubscriptionProps.Builder().apply(initializer).build()
