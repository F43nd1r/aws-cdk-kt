package com.faendir.awscdkkt.generated.services.amazonmq

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amazonmq.CfnBroker
import software.amazon.awscdk.services.amazonmq.CfnBrokerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBroker(
  id: String,
  props: CfnBrokerProps,
  initializer: @AwsCdkDsl CfnBroker.() -> Unit = {},
): CfnBroker = CfnBroker(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBroker(id: String, initializer: @AwsCdkDsl CfnBroker.Builder.() -> Unit
    = {}): CfnBroker = CfnBroker.Builder.create(this, id).apply(initializer).build()
