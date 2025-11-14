package com.faendir.awscdkkt.generated.interfaces.kinesis

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.interfaces.kinesis.StreamReference

@Generated
public fun buildStreamReference(initializer: @AwsCdkDsl StreamReference.Builder.() -> Unit = {}): StreamReference = StreamReference.Builder().apply(initializer).build()
