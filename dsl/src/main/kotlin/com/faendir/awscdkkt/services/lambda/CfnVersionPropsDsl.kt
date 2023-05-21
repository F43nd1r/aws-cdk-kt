package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnVersionProps

@Generated
public fun cfnVersionProps(initializer: CfnVersionProps.Builder.() -> Unit = {}): CfnVersionProps =
    CfnVersionProps.builder().apply(initializer).build()
