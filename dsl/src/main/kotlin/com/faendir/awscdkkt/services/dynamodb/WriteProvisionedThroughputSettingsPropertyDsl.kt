package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@Generated
public
    fun writeProvisionedThroughputSettingsProperty(initializer: CfnGlobalTable.WriteProvisionedThroughputSettingsProperty.Builder.() -> Unit
    = {}): CfnGlobalTable.WriteProvisionedThroughputSettingsProperty =
    CfnGlobalTable.WriteProvisionedThroughputSettingsProperty.builder().apply(initializer).build()
