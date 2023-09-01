package com.faendir.awscdkkt.generated.services.servicediscovery

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.ServiceAttributes

@Generated
public fun buildServiceAttributes(initializer: @AwsCdkDsl ServiceAttributes.Builder.() -> Unit =
    {}): ServiceAttributes = ServiceAttributes.Builder().apply(initializer).build()
