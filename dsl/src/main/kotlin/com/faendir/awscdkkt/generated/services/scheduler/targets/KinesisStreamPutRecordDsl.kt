package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.IStream
import software.amazon.awscdk.services.scheduler.targets.KinesisStreamPutRecord

@Generated
public fun buildKinesisStreamPutRecord(stream: IStream, initializer: @AwsCdkDsl
    KinesisStreamPutRecord.Builder.() -> Unit = {}): KinesisStreamPutRecord =
    KinesisStreamPutRecord.Builder.create(stream).apply(initializer).build()
