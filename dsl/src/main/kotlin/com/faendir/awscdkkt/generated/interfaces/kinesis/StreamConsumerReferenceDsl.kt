package com.faendir.awscdkkt.generated.interfaces.kinesis

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.interfaces.kinesis.StreamConsumerReference

@Generated
public fun buildStreamConsumerReference(initializer: @AwsCdkDsl StreamConsumerReference.Builder.() -> Unit = {}): StreamConsumerReference = StreamConsumerReference.Builder().apply(initializer).build()
