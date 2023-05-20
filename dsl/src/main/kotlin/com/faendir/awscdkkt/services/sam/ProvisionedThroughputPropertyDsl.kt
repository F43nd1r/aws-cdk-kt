@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnSimpleTable

public
    fun provisionedThroughputProperty(initializer: CfnSimpleTable.ProvisionedThroughputProperty.Builder.() -> Unit):
    CfnSimpleTable.ProvisionedThroughputProperty =
    CfnSimpleTable.ProvisionedThroughputProperty.builder().apply(initializer).build()
