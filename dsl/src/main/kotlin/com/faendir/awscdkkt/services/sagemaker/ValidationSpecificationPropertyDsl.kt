package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun validationSpecificationProperty(initializer: CfnModelPackage.ValidationSpecificationProperty.Builder.() -> Unit
    = {}): CfnModelPackage.ValidationSpecificationProperty =
    CfnModelPackage.ValidationSpecificationProperty.builder().apply(initializer).build()
