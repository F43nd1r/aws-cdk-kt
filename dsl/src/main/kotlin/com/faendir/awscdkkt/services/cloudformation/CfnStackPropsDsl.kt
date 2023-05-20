@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnStackProps

public fun cfnStackProps(initializer: CfnStackProps.Builder.() -> Unit): CfnStackProps =
    CfnStackProps.builder().apply(initializer).build()
