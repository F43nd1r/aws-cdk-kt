package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

@Generated
public
    fun modelBiasAppSpecificationProperty(initializer: CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty.Builder.() -> Unit
    = {}): CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty =
    CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty.builder().apply(initializer).build()
