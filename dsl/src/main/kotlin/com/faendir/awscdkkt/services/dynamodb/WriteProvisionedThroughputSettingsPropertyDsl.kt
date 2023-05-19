@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

public
    fun writeProvisionedThroughputSettingsProperty(initializer: CfnGlobalTable.WriteProvisionedThroughputSettingsProperty.Builder.() -> Unit):
    CfnGlobalTable.WriteProvisionedThroughputSettingsProperty =
    CfnGlobalTable.WriteProvisionedThroughputSettingsProperty.builder().apply(initializer).build()
