@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

public fun prometheusProperty(initializer: CfnCluster.PrometheusProperty.Builder.() -> Unit):
    CfnCluster.PrometheusProperty =
    CfnCluster.PrometheusProperty.builder().apply(initializer).build()
