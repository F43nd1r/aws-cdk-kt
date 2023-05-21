package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModel

@Generated
public
    fun multiModelConfigProperty(initializer: CfnModel.MultiModelConfigProperty.Builder.() -> Unit =
    {}): CfnModel.MultiModelConfigProperty =
    CfnModel.MultiModelConfigProperty.builder().apply(initializer).build()
