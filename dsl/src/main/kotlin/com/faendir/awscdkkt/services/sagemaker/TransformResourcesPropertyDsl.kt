package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun transformResourcesProperty(initializer: CfnModelPackage.TransformResourcesProperty.Builder.() -> Unit
    = {}): CfnModelPackage.TransformResourcesProperty =
    CfnModelPackage.TransformResourcesProperty.builder().apply(initializer).build()
