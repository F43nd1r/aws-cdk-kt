package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.QueryStringProps

@Generated
public fun queryStringProps(initializer: QueryStringProps.Builder.() -> Unit = {}): QueryStringProps
    = QueryStringProps.builder().apply(initializer).build()
