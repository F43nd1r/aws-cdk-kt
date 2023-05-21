package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun modelPackageStatusItemProperty(initializer: CfnModelPackage.ModelPackageStatusItemProperty.Builder.() -> Unit
    = {}): CfnModelPackage.ModelPackageStatusItemProperty =
    CfnModelPackage.ModelPackageStatusItemProperty.builder().apply(initializer).build()
