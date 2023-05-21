package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun metricsSourceProperty(initializer: CfnModelPackage.MetricsSourceProperty.Builder.() -> Unit
    = {}): CfnModelPackage.MetricsSourceProperty =
    CfnModelPackage.MetricsSourceProperty.builder().apply(initializer).build()
