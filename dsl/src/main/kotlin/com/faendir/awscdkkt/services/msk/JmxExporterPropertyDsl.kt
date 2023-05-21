package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public fun jmxExporterProperty(initializer: CfnCluster.JmxExporterProperty.Builder.() -> Unit = {}):
    CfnCluster.JmxExporterProperty =
    CfnCluster.JmxExporterProperty.builder().apply(initializer).build()
