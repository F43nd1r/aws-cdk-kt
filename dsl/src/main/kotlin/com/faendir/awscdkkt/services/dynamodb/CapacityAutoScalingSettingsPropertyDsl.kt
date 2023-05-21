package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@Generated
public
    fun capacityAutoScalingSettingsProperty(initializer: CfnGlobalTable.CapacityAutoScalingSettingsProperty.Builder.() -> Unit
    = {}): CfnGlobalTable.CapacityAutoScalingSettingsProperty =
    CfnGlobalTable.CapacityAutoScalingSettingsProperty.builder().apply(initializer).build()
