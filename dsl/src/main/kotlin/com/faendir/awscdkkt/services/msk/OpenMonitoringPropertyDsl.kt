package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public fun openMonitoringProperty(initializer: CfnCluster.OpenMonitoringProperty.Builder.() -> Unit
    = {}): CfnCluster.OpenMonitoringProperty =
    CfnCluster.OpenMonitoringProperty.builder().apply(initializer).build()
