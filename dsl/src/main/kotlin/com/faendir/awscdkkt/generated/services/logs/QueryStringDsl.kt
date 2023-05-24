package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.QueryString
import software.amazon.awscdk.services.logs.QueryStringProps

@Generated
public fun queryString(): QueryString = QueryString()

@Generated
public fun queryString(props: QueryStringProps): QueryString = QueryString(props)

@Generated
public fun buildQueryString(initializer: @AwsCdkDsl QueryString.Builder.() -> Unit): QueryString =
    QueryString.Builder.create().apply(initializer).build()
