@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

public
    fun metricsSourceProperty(initializer: CfnModelPackage.MetricsSourceProperty.Builder.() -> Unit):
    CfnModelPackage.MetricsSourceProperty =
    CfnModelPackage.MetricsSourceProperty.builder().apply(initializer).build()
