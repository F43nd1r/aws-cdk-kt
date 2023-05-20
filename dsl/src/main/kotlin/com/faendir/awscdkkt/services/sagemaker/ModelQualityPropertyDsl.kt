@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

public
    fun modelQualityProperty(initializer: CfnModelPackage.ModelQualityProperty.Builder.() -> Unit):
    CfnModelPackage.ModelQualityProperty =
    CfnModelPackage.ModelQualityProperty.builder().apply(initializer).build()
