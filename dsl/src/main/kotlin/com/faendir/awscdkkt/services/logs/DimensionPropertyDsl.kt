@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnMetricFilter

public fun dimensionProperty(initializer: CfnMetricFilter.DimensionProperty.Builder.() -> Unit):
    CfnMetricFilter.DimensionProperty =
    CfnMetricFilter.DimensionProperty.builder().apply(initializer).build()
