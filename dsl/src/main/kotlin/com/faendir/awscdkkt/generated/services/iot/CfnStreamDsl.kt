package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnStream
import software.amazon.awscdk.services.iot.CfnStreamProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStream(
  id: String,
  props: CfnStreamProps,
  initializer: @AwsCdkDsl CfnStream.() -> Unit = {},
): CfnStream = CfnStream(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStream(id: String, initializer: @AwsCdkDsl CfnStream.Builder.() -> Unit = {}): CfnStream = CfnStream.Builder.create(this, id).apply(initializer).build()
