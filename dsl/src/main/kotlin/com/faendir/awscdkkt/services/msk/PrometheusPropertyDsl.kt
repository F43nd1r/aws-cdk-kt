package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public fun prometheusProperty(initializer: CfnCluster.PrometheusProperty.Builder.() -> Unit = {}):
    CfnCluster.PrometheusProperty =
    CfnCluster.PrometheusProperty.builder().apply(initializer).build()
