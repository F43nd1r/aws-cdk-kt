package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@Generated
public
    fun modelPackageContainerDefinitionProperty(initializer: CfnModelPackage.ModelPackageContainerDefinitionProperty.Builder.() -> Unit
    = {}): CfnModelPackage.ModelPackageContainerDefinitionProperty =
    CfnModelPackage.ModelPackageContainerDefinitionProperty.builder().apply(initializer).build()
