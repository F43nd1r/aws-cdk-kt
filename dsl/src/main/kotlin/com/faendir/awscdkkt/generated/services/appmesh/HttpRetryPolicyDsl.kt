package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.HttpRetryPolicy

@Generated
public fun buildHttpRetryPolicy(initializer: @AwsCdkDsl HttpRetryPolicy.Builder.() -> Unit = {}): HttpRetryPolicy = HttpRetryPolicy.Builder().apply(initializer).build()
