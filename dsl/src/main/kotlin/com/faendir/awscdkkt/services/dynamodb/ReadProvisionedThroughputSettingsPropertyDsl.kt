@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

public
    fun readProvisionedThroughputSettingsProperty(initializer: CfnGlobalTable.ReadProvisionedThroughputSettingsProperty.Builder.() -> Unit):
    CfnGlobalTable.ReadProvisionedThroughputSettingsProperty =
    CfnGlobalTable.ReadProvisionedThroughputSettingsProperty.builder().apply(initializer).build()
