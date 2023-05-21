package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnStageProps

@Generated
public fun cfnStageProps(initializer: CfnStageProps.Builder.() -> Unit = {}): CfnStageProps =
    CfnStageProps.builder().apply(initializer).build()
