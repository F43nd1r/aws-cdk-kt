package com.faendir.awscdkkt.generated.services.kinesisfirehose

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeliveryStream(id: String, initializer: @AwsCdkDsl CfnDeliveryStream.() -> Unit = {}): CfnDeliveryStream = CfnDeliveryStream(this, id).apply(initializer)

@Generated
public fun Construct.cfnDeliveryStream(
  id: String,
  props: CfnDeliveryStreamProps,
  initializer: @AwsCdkDsl CfnDeliveryStream.() -> Unit = {},
): CfnDeliveryStream = CfnDeliveryStream(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDeliveryStream(id: String, initializer: @AwsCdkDsl CfnDeliveryStream.Builder.() -> Unit = {}): CfnDeliveryStream = CfnDeliveryStream.Builder.create(this, id).apply(initializer).build()
