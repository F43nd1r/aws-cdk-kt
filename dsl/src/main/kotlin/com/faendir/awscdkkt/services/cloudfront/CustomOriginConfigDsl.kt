package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CustomOriginConfig

@Generated
public fun customOriginConfig(initializer: CustomOriginConfig.Builder.() -> Unit = {}):
    CustomOriginConfig = CustomOriginConfig.builder().apply(initializer).build()
