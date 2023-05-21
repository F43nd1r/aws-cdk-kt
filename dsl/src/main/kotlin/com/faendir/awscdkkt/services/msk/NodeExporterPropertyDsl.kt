package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public fun nodeExporterProperty(initializer: CfnCluster.NodeExporterProperty.Builder.() -> Unit =
    {}): CfnCluster.NodeExporterProperty =
    CfnCluster.NodeExporterProperty.builder().apply(initializer).build()
