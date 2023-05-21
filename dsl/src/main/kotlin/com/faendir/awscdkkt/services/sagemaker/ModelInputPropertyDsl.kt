package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public fun modelInputProperty(initializer: CfnModelPackage.ModelInputProperty.Builder.() -> Unit =
    {}): CfnModelPackage.ModelInputProperty =
    CfnModelPackage.ModelInputProperty.builder().apply(initializer).build()
