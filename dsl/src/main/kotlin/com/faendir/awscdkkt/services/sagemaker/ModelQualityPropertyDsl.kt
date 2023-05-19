@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

public
    fun modelQualityProperty(initializer: CfnModelPackage.ModelQualityProperty.Builder.() -> Unit):
    CfnModelPackage.ModelQualityProperty =
    CfnModelPackage.ModelQualityProperty.builder().apply(initializer).build()
