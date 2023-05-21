package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@Generated
public
    fun readProvisionedThroughputSettingsProperty(initializer: CfnGlobalTable.ReadProvisionedThroughputSettingsProperty.Builder.() -> Unit
    = {}): CfnGlobalTable.ReadProvisionedThroughputSettingsProperty =
    CfnGlobalTable.ReadProvisionedThroughputSettingsProperty.builder().apply(initializer).build()
