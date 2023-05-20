@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

public
    fun autoRollbackConfigProperty(initializer: CfnEndpoint.AutoRollbackConfigProperty.Builder.() -> Unit):
    CfnEndpoint.AutoRollbackConfigProperty =
    CfnEndpoint.AutoRollbackConfigProperty.builder().apply(initializer).build()
