package com.faendir.awscdkkt.generated.services.sns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.CfnTopic

@Generated
public fun buildSubscriptionProperty(initializer: @AwsCdkDsl
    CfnTopic.SubscriptionProperty.Builder.() -> Unit): CfnTopic.SubscriptionProperty =
    CfnTopic.SubscriptionProperty.Builder().apply(initializer).build()
