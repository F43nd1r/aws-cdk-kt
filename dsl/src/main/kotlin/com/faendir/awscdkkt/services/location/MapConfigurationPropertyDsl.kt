package com.faendir.awscdkkt.services.location

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnMap

@Generated
public fun mapConfigurationProperty(initializer: CfnMap.MapConfigurationProperty.Builder.() -> Unit
    = {}): CfnMap.MapConfigurationProperty =
    CfnMap.MapConfigurationProperty.builder().apply(initializer).build()
