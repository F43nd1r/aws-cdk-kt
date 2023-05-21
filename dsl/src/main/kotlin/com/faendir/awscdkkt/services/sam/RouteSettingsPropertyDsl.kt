package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

@Generated
public fun routeSettingsProperty(initializer: CfnHttpApi.RouteSettingsProperty.Builder.() -> Unit =
    {}): CfnHttpApi.RouteSettingsProperty =
    CfnHttpApi.RouteSettingsProperty.builder().apply(initializer).build()
