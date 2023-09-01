package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.HelmChartOptions

@Generated
public fun buildHelmChartOptions(initializer: @AwsCdkDsl HelmChartOptions.Builder.() -> Unit = {}):
    HelmChartOptions = HelmChartOptions.Builder().apply(initializer).build()
