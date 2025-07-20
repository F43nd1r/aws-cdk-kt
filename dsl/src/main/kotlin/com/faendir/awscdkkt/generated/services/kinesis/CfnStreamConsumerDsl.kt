package com.faendir.awscdkkt.generated.services.kinesis

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.CfnStreamConsumer
import software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStreamConsumer(
  id: String,
  props: CfnStreamConsumerProps,
  initializer: @AwsCdkDsl CfnStreamConsumer.() -> Unit = {},
): CfnStreamConsumer = CfnStreamConsumer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStreamConsumer(id: String, initializer: @AwsCdkDsl CfnStreamConsumer.Builder.() -> Unit = {}): CfnStreamConsumer = CfnStreamConsumer.Builder.create(this, id).apply(initializer).build()
