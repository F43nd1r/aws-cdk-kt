package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public fun userContextProperty(initializer: CfnModelPackage.UserContextProperty.Builder.() -> Unit =
    {}): CfnModelPackage.UserContextProperty =
    CfnModelPackage.UserContextProperty.builder().apply(initializer).build()
