@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
