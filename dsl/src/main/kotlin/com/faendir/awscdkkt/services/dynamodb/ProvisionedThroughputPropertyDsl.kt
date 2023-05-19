@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

public
    fun provisionedThroughputProperty(initializer: CfnTable.ProvisionedThroughputProperty.Builder.() -> Unit):
    CfnTable.ProvisionedThroughputProperty =
    CfnTable.ProvisionedThroughputProperty.builder().apply(initializer).build()
