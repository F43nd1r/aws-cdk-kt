@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.HelmChartOptions

public fun helmChartOptions(initializer: HelmChartOptions.Builder.() -> Unit): HelmChartOptions =
    HelmChartOptions.builder().apply(initializer).build()
