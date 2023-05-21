package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun modelPackageStatusDetailsProperty(initializer: CfnModelPackage.ModelPackageStatusDetailsProperty.Builder.() -> Unit
    = {}): CfnModelPackage.ModelPackageStatusDetailsProperty =
    CfnModelPackage.ModelPackageStatusDetailsProperty.builder().apply(initializer).build()
