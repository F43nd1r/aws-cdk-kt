package com.faendir.awscdkkt.generated.services.sns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.SubscriptionOptions

@Generated
public fun buildSubscriptionOptions(initializer: @AwsCdkDsl SubscriptionOptions.Builder.() -> Unit):
    SubscriptionOptions = SubscriptionOptions.Builder().apply(initializer).build()
