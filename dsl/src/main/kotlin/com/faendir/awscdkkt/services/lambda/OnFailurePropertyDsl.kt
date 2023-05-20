@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

public
    fun onFailureProperty(initializer: CfnEventSourceMapping.OnFailureProperty.Builder.() -> Unit):
    CfnEventSourceMapping.OnFailureProperty =
    CfnEventSourceMapping.OnFailureProperty.builder().apply(initializer).build()
