package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnRestApiProps

@Generated
public fun cfnRestApiProps(initializer: CfnRestApiProps.Builder.() -> Unit = {}): CfnRestApiProps =
    CfnRestApiProps.builder().apply(initializer).build()
