@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.OriginOptions

public fun originOptions(initializer: OriginOptions.Builder.() -> Unit): OriginOptions =
    OriginOptions.builder().apply(initializer).build()
