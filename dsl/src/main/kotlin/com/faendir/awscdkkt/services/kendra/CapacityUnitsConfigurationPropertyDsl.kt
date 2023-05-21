package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnIndex

@Generated
public
    fun capacityUnitsConfigurationProperty(initializer: CfnIndex.CapacityUnitsConfigurationProperty.Builder.() -> Unit
    = {}): CfnIndex.CapacityUnitsConfigurationProperty =
    CfnIndex.CapacityUnitsConfigurationProperty.builder().apply(initializer).build()
