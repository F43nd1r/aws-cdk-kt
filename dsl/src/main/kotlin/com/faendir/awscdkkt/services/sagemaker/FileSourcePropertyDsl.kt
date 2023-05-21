package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public fun fileSourceProperty(initializer: CfnModelPackage.FileSourceProperty.Builder.() -> Unit =
    {}): CfnModelPackage.FileSourceProperty =
    CfnModelPackage.FileSourceProperty.builder().apply(initializer).build()
