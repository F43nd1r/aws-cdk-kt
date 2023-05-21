package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public fun modelQualityProperty(initializer: CfnModelPackage.ModelQualityProperty.Builder.() -> Unit
    = {}): CfnModelPackage.ModelQualityProperty =
    CfnModelPackage.ModelQualityProperty.builder().apply(initializer).build()
