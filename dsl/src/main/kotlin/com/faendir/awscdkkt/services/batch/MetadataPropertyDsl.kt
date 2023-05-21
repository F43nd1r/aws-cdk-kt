package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun metadataProperty(initializer: CfnJobDefinition.MetadataProperty.Builder.() -> Unit = {}):
    CfnJobDefinition.MetadataProperty =
    CfnJobDefinition.MetadataProperty.builder().apply(initializer).build()
