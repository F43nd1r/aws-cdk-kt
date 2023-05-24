package com.faendir.awscdkkt.generated.services.globalaccelerator

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.RawEndpoint
import software.amazon.awscdk.services.globalaccelerator.RawEndpointProps

@Generated
public fun rawEndpoint(props: RawEndpointProps): RawEndpoint = RawEndpoint(props)

@Generated
public fun buildRawEndpoint(initializer: @AwsCdkDsl RawEndpoint.Builder.() -> Unit): RawEndpoint =
    RawEndpoint.Builder.create().apply(initializer).build()
