package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnApiProps

@Generated
public fun cfnApiProps(initializer: CfnApiProps.Builder.() -> Unit = {}): CfnApiProps =
    CfnApiProps.builder().apply(initializer).build()
