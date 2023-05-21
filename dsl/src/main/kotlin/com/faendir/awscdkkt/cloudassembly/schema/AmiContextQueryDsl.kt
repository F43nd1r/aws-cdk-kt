package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.AmiContextQuery

@Generated
public fun amiContextQuery(initializer: AmiContextQuery.Builder.() -> Unit = {}): AmiContextQuery =
    AmiContextQuery.builder().apply(initializer).build()
