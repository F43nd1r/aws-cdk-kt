package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy

@Generated
public
    fun parametersInCacheKeyAndForwardedToOriginProperty(initializer: CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty.Builder.() -> Unit
    = {}): CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty =
    CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty.builder().apply(initializer).build()
