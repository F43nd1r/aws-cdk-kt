package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.LogStreamProps

@Generated
public fun buildLogStreamProps(initializer: @AwsCdkDsl LogStreamProps.Builder.() -> Unit = {}):
    LogStreamProps = LogStreamProps.Builder().apply(initializer).build()
