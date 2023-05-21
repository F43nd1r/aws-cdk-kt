package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun validationProfileProperty(initializer: CfnModelPackage.ValidationProfileProperty.Builder.() -> Unit
    = {}): CfnModelPackage.ValidationProfileProperty =
    CfnModelPackage.ValidationProfileProperty.builder().apply(initializer).build()
