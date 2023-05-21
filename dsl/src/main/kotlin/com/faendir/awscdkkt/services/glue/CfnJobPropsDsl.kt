package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnJobProps

@Generated
public fun cfnJobProps(initializer: CfnJobProps.Builder.() -> Unit = {}): CfnJobProps =
    CfnJobProps.builder().apply(initializer).build()
