@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.OriginFailoverConfig

public fun originFailoverConfig(initializer: OriginFailoverConfig.Builder.() -> Unit):
    OriginFailoverConfig = OriginFailoverConfig.builder().apply(initializer).build()
