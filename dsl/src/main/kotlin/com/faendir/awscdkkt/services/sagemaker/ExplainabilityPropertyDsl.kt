@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

public
    fun explainabilityProperty(initializer: CfnModelPackage.ExplainabilityProperty.Builder.() -> Unit):
    CfnModelPackage.ExplainabilityProperty =
    CfnModelPackage.ExplainabilityProperty.builder().apply(initializer).build()
