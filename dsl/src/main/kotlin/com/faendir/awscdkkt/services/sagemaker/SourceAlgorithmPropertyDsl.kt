package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun sourceAlgorithmProperty(initializer: CfnModelPackage.SourceAlgorithmProperty.Builder.() -> Unit
    = {}): CfnModelPackage.SourceAlgorithmProperty =
    CfnModelPackage.SourceAlgorithmProperty.builder().apply(initializer).build()
