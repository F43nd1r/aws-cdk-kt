@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CustomOriginConfig

public fun customOriginConfig(initializer: CustomOriginConfig.Builder.() -> Unit):
    CustomOriginConfig = CustomOriginConfig.builder().apply(initializer).build()
