package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.CfnStackProps

@Generated
public fun cfnStackProps(initializer: CfnStackProps.Builder.() -> Unit = {}): CfnStackProps =
    CfnStackProps.builder().apply(initializer).build()
