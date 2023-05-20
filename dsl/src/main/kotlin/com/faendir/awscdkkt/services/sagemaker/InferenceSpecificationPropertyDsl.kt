@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

public
    fun inferenceSpecificationProperty(initializer: CfnModelPackage.InferenceSpecificationProperty.Builder.() -> Unit):
    CfnModelPackage.InferenceSpecificationProperty =
    CfnModelPackage.InferenceSpecificationProperty.builder().apply(initializer).build()
