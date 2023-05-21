package com.faendir.awscdkkt.services.eventschemas

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eventschemas.CfnSchemaProps

@Generated
public fun cfnSchemaProps(initializer: CfnSchemaProps.Builder.() -> Unit = {}): CfnSchemaProps =
    CfnSchemaProps.builder().apply(initializer).build()
