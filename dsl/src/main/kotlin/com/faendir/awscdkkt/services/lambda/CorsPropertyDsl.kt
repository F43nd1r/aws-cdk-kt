package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnUrl

@Generated
public fun corsProperty(initializer: CfnUrl.CorsProperty.Builder.() -> Unit = {}):
    CfnUrl.CorsProperty = CfnUrl.CorsProperty.builder().apply(initializer).build()
