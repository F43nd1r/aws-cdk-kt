package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnSchemaProps

@Generated
public fun cfnSchemaProps(initializer: CfnSchemaProps.Builder.() -> Unit = {}): CfnSchemaProps =
    CfnSchemaProps.builder().apply(initializer).build()
