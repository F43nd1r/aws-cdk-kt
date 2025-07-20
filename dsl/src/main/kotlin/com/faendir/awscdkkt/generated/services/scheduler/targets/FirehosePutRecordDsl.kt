package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.IDeliveryStream
import software.amazon.awscdk.services.scheduler.targets.FirehosePutRecord

@Generated
public fun buildFirehosePutRecord(deliveryStream: IDeliveryStream, initializer: @AwsCdkDsl FirehosePutRecord.Builder.() -> Unit = {}): FirehosePutRecord = FirehosePutRecord.Builder.create(deliveryStream).apply(initializer).build()
