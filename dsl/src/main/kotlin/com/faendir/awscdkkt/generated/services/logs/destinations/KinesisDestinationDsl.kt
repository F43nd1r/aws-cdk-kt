package com.faendir.awscdkkt.generated.services.logs.destinations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.IStream
import software.amazon.awscdk.services.logs.destinations.KinesisDestination

@Generated
public fun buildKinesisDestination(stream: IStream, initializer: @AwsCdkDsl KinesisDestination.Builder.() -> Unit = {}): KinesisDestination = KinesisDestination.Builder.create(stream).apply(initializer).build()
