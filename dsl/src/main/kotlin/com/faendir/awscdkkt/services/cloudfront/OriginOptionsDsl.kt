@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.OriginOptions

public fun originOptions(initializer: OriginOptions.Builder.() -> Unit): OriginOptions =
    OriginOptions.builder().apply(initializer).build()
