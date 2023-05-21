package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun transformJobDefinitionProperty(initializer: CfnModelPackage.TransformJobDefinitionProperty.Builder.() -> Unit
    = {}): CfnModelPackage.TransformJobDefinitionProperty =
    CfnModelPackage.TransformJobDefinitionProperty.builder().apply(initializer).build()
