package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun emptyDirProperty(initializer: CfnJobDefinition.EmptyDirProperty.Builder.() -> Unit = {}):
    CfnJobDefinition.EmptyDirProperty =
    CfnJobDefinition.EmptyDirProperty.builder().apply(initializer).build()
