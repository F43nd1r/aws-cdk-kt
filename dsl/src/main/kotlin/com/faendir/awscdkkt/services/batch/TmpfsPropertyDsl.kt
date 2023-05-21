package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun tmpfsProperty(initializer: CfnJobDefinition.TmpfsProperty.Builder.() -> Unit = {}):
    CfnJobDefinition.TmpfsProperty =
    CfnJobDefinition.TmpfsProperty.builder().apply(initializer).build()
