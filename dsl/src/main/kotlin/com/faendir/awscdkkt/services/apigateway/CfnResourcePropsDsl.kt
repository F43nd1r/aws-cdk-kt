package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnResourceProps

@Generated
public fun cfnResourceProps(initializer: CfnResourceProps.Builder.() -> Unit = {}): CfnResourceProps
    = CfnResourceProps.builder().apply(initializer).build()
