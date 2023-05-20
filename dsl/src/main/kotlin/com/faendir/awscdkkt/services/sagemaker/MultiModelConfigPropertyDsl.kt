@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModel

public
    fun multiModelConfigProperty(initializer: CfnModel.MultiModelConfigProperty.Builder.() -> Unit):
    CfnModel.MultiModelConfigProperty =
    CfnModel.MultiModelConfigProperty.builder().apply(initializer).build()
