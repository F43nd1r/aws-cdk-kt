package com.faendir.awscdkkt.generated.services.sns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.DeliveryPolicy

@Generated
public fun buildDeliveryPolicy(initializer: @AwsCdkDsl DeliveryPolicy.Builder.() -> Unit = {}):
    DeliveryPolicy = DeliveryPolicy.Builder().apply(initializer).build()
