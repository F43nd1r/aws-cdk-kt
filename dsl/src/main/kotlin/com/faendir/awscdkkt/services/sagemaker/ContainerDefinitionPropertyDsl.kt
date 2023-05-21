package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModel

@Generated
public
    fun containerDefinitionProperty(initializer: CfnModel.ContainerDefinitionProperty.Builder.() -> Unit
    = {}): CfnModel.ContainerDefinitionProperty =
    CfnModel.ContainerDefinitionProperty.builder().apply(initializer).build()
