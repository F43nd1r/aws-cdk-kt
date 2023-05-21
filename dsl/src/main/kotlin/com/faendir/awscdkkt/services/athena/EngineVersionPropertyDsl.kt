package com.faendir.awscdkkt.services.athena

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnWorkGroup

@Generated
public fun engineVersionProperty(initializer: CfnWorkGroup.EngineVersionProperty.Builder.() -> Unit
    = {}): CfnWorkGroup.EngineVersionProperty =
    CfnWorkGroup.EngineVersionProperty.builder().apply(initializer).build()
