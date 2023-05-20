@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

public
    fun readProvisionedThroughputSettingsProperty(initializer: CfnGlobalTable.ReadProvisionedThroughputSettingsProperty.Builder.() -> Unit):
    CfnGlobalTable.ReadProvisionedThroughputSettingsProperty =
    CfnGlobalTable.ReadProvisionedThroughputSettingsProperty.builder().apply(initializer).build()
