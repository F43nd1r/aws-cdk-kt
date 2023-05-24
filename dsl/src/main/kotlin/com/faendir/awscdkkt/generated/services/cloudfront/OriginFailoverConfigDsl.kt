package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.OriginFailoverConfig

@Generated
public fun buildOriginFailoverConfig(initializer: @AwsCdkDsl
    OriginFailoverConfig.Builder.() -> Unit): OriginFailoverConfig =
    OriginFailoverConfig.Builder().apply(initializer).build()
