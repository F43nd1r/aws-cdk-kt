package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.OriginOptions

@Generated
public fun buildOriginOptions(initializer: @AwsCdkDsl OriginOptions.Builder.() -> Unit = {}):
    OriginOptions = OriginOptions.Builder().apply(initializer).build()
