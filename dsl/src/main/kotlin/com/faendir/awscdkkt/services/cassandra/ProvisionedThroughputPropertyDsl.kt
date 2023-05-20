@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cassandra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnTable

public
    fun provisionedThroughputProperty(initializer: CfnTable.ProvisionedThroughputProperty.Builder.() -> Unit):
    CfnTable.ProvisionedThroughputProperty =
    CfnTable.ProvisionedThroughputProperty.builder().apply(initializer).build()
