package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun sourceAlgorithmSpecificationProperty(initializer: CfnModelPackage.SourceAlgorithmSpecificationProperty.Builder.() -> Unit
    = {}): CfnModelPackage.SourceAlgorithmSpecificationProperty =
    CfnModelPackage.SourceAlgorithmSpecificationProperty.builder().apply(initializer).build()
