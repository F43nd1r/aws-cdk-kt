package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.QueryString

@Generated
public fun buildQueryString(initializer: @AwsCdkDsl QueryString.Builder.() -> Unit = {}): QueryString = QueryString.Builder.create().apply(initializer).build()
