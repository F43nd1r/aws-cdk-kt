package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun transformOutputProperty(initializer: CfnModelPackage.TransformOutputProperty.Builder.() -> Unit
    = {}): CfnModelPackage.TransformOutputProperty =
    CfnModelPackage.TransformOutputProperty.builder().apply(initializer).build()
