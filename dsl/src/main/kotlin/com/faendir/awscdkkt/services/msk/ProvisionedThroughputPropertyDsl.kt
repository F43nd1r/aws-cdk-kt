@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

public
    fun provisionedThroughputProperty(initializer: CfnCluster.ProvisionedThroughputProperty.Builder.() -> Unit):
    CfnCluster.ProvisionedThroughputProperty =
    CfnCluster.ProvisionedThroughputProperty.builder().apply(initializer).build()
