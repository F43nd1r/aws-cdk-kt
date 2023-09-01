package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public fun buildBiasProperty(initializer: @AwsCdkDsl CfnModelPackage.BiasProperty.Builder.() -> Unit
    = {}): CfnModelPackage.BiasProperty =
    CfnModelPackage.BiasProperty.Builder().apply(initializer).build()
