package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.HelmChartProps

@Generated
public fun helmChartProps(initializer: HelmChartProps.Builder.() -> Unit = {}): HelmChartProps =
    HelmChartProps.builder().apply(initializer).build()
