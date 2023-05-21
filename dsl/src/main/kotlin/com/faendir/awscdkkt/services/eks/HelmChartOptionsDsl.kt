package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.HelmChartOptions

@Generated
public fun helmChartOptions(initializer: HelmChartOptions.Builder.() -> Unit = {}): HelmChartOptions
    = HelmChartOptions.builder().apply(initializer).build()
