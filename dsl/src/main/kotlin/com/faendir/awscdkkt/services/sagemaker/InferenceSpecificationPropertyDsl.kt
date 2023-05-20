@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

public
    fun inferenceSpecificationProperty(initializer: CfnModelPackage.InferenceSpecificationProperty.Builder.() -> Unit):
    CfnModelPackage.InferenceSpecificationProperty =
    CfnModelPackage.InferenceSpecificationProperty.builder().apply(initializer).build()
