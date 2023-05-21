package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun transformInputProperty(initializer: CfnModelPackage.TransformInputProperty.Builder.() -> Unit
    = {}): CfnModelPackage.TransformInputProperty =
    CfnModelPackage.TransformInputProperty.builder().apply(initializer).build()
