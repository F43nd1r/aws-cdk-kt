package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnMLTransform

@Generated
public fun glueTablesProperty(initializer: CfnMLTransform.GlueTablesProperty.Builder.() -> Unit =
    {}): CfnMLTransform.GlueTablesProperty =
    CfnMLTransform.GlueTablesProperty.builder().apply(initializer).build()
