package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnApi

@Generated
public
    fun corsConfigurationProperty(initializer: CfnApi.CorsConfigurationProperty.Builder.() -> Unit =
    {}): CfnApi.CorsConfigurationProperty =
    CfnApi.CorsConfigurationProperty.builder().apply(initializer).build()
