package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.HelmChart
import software.amazon.awscdk.services.eks.HelmChartProps
import software.constructs.Construct

@Generated
public fun Construct.helmChart(
  id: String,
  props: HelmChartProps,
  initializer: @AwsCdkDsl HelmChart.() -> Unit = {},
): HelmChart = HelmChart(this, id, props).apply(initializer)

@Generated
public fun Construct.buildHelmChart(id: String, initializer: @AwsCdkDsl HelmChart.Builder.() -> Unit = {}): HelmChart = HelmChart.Builder.create(this, id).apply(initializer).build()
