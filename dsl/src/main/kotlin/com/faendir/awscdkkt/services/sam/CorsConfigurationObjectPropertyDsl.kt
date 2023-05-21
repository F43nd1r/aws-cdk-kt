package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

@Generated
public
    fun corsConfigurationObjectProperty(initializer: CfnHttpApi.CorsConfigurationObjectProperty.Builder.() -> Unit
    = {}): CfnHttpApi.CorsConfigurationObjectProperty =
    CfnHttpApi.CorsConfigurationObjectProperty.builder().apply(initializer).build()
