package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.AwsApi

@Generated
public fun buildAwsApi(initializer: @AwsCdkDsl AwsApi.Builder.() -> Unit = {}): AwsApi =
    AwsApi.Builder.create().apply(initializer).build()
