package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun secretProperty(initializer: CfnJobDefinition.SecretProperty.Builder.() -> Unit = {}):
    CfnJobDefinition.SecretProperty =
    CfnJobDefinition.SecretProperty.builder().apply(initializer).build()
