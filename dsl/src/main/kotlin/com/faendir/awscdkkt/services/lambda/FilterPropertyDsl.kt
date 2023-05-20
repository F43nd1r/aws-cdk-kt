@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

public fun filterProperty(initializer: CfnEventSourceMapping.FilterProperty.Builder.() -> Unit):
    CfnEventSourceMapping.FilterProperty =
    CfnEventSourceMapping.FilterProperty.builder().apply(initializer).build()
