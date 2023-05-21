package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun nodeRangePropertyProperty(initializer: CfnJobDefinition.NodeRangePropertyProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.NodeRangePropertyProperty =
    CfnJobDefinition.NodeRangePropertyProperty.builder().apply(initializer).build()
