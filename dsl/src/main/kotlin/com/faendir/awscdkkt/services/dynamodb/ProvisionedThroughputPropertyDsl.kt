package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable

@Generated
public
    fun provisionedThroughputProperty(initializer: CfnTable.ProvisionedThroughputProperty.Builder.() -> Unit
    = {}): CfnTable.ProvisionedThroughputProperty =
    CfnTable.ProvisionedThroughputProperty.builder().apply(initializer).build()
