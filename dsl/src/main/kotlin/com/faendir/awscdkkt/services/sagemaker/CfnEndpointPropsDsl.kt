package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointProps

@Generated
public fun cfnEndpointProps(initializer: CfnEndpointProps.Builder.() -> Unit = {}): CfnEndpointProps
    = CfnEndpointProps.builder().apply(initializer).build()
