package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.StreamOptions

@Generated
public fun buildStreamOptions(initializer: @AwsCdkDsl StreamOptions.Builder.() -> Unit):
    StreamOptions = StreamOptions.Builder().apply(initializer).build()
