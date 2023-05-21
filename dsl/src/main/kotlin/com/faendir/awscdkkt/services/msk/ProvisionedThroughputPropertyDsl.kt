package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public
    fun provisionedThroughputProperty(initializer: CfnCluster.ProvisionedThroughputProperty.Builder.() -> Unit
    = {}): CfnCluster.ProvisionedThroughputProperty =
    CfnCluster.ProvisionedThroughputProperty.builder().apply(initializer).build()
