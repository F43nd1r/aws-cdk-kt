package com.faendir.awscdkkt.generated.services.servicediscovery

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.ServiceProps

@Generated
public fun buildServiceProps(initializer: @AwsCdkDsl ServiceProps.Builder.() -> Unit): ServiceProps
    = ServiceProps.Builder().apply(initializer).build()
