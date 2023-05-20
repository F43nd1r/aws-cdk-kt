@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.OriginFailoverConfig

public fun originFailoverConfig(initializer: OriginFailoverConfig.Builder.() -> Unit):
    OriginFailoverConfig = OriginFailoverConfig.builder().apply(initializer).build()
