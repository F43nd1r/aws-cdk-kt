package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

@Generated
public
    fun modelBiasBaselineConfigProperty(initializer: CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty.Builder.() -> Unit
    = {}): CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty =
    CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty.builder().apply(initializer).build()
