@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

public
    fun modelMetricsProperty(initializer: CfnModelPackage.ModelMetricsProperty.Builder.() -> Unit):
    CfnModelPackage.ModelMetricsProperty =
    CfnModelPackage.ModelMetricsProperty.builder().apply(initializer).build()
