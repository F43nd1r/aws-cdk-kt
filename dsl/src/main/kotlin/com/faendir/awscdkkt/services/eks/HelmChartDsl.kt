@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.HelmChart
import software.amazon.awscdk.services.eks.HelmChartProps
import software.constructs.Construct

public fun Construct.helmChart(
  id: String,
  props: HelmChartProps,
  initializer: HelmChart.() -> Unit = {},
): HelmChart = HelmChart(this, id, props).apply(initializer)
