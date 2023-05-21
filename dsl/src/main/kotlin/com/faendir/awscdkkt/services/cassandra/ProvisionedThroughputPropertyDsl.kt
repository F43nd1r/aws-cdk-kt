package com.faendir.awscdkkt.services.cassandra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnTable

@Generated
public
    fun provisionedThroughputProperty(initializer: CfnTable.ProvisionedThroughputProperty.Builder.() -> Unit
    = {}): CfnTable.ProvisionedThroughputProperty =
    CfnTable.ProvisionedThroughputProperty.builder().apply(initializer).build()
