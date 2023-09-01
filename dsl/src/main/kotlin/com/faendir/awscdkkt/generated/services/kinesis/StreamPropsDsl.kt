package com.faendir.awscdkkt.generated.services.kinesis

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.StreamProps

@Generated
public fun buildStreamProps(initializer: @AwsCdkDsl StreamProps.Builder.() -> Unit = {}):
    StreamProps = StreamProps.Builder().apply(initializer).build()
