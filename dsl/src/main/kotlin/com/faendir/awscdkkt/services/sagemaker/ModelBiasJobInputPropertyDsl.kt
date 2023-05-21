package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

@Generated
public
    fun modelBiasJobInputProperty(initializer: CfnModelBiasJobDefinition.ModelBiasJobInputProperty.Builder.() -> Unit
    = {}): CfnModelBiasJobDefinition.ModelBiasJobInputProperty =
    CfnModelBiasJobDefinition.ModelBiasJobInputProperty.builder().apply(initializer).build()
