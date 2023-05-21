package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.OriginBindOptions

@Generated
public fun originBindOptions(initializer: OriginBindOptions.Builder.() -> Unit = {}):
    OriginBindOptions = OriginBindOptions.builder().apply(initializer).build()
