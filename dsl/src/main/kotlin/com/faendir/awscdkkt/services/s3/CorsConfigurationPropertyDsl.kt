package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun corsConfigurationProperty(initializer: CfnBucket.CorsConfigurationProperty.Builder.() -> Unit
    = {}): CfnBucket.CorsConfigurationProperty =
    CfnBucket.CorsConfigurationProperty.builder().apply(initializer).build()
