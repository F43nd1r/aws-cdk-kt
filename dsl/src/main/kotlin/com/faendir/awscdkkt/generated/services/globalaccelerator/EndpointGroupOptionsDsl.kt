package com.faendir.awscdkkt.generated.services.globalaccelerator

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions

@Generated
public fun buildEndpointGroupOptions(initializer: @AwsCdkDsl EndpointGroupOptions.Builder.() -> Unit
    = {}): EndpointGroupOptions = EndpointGroupOptions.Builder().apply(initializer).build()
