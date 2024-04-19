package com.faendir.awscdkkt.generated.services.securitylake

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securitylake.CfnSubscriber
import software.amazon.awscdk.services.securitylake.CfnSubscriberProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubscriber(
  id: String,
  props: CfnSubscriberProps,
  initializer: @AwsCdkDsl CfnSubscriber.() -> Unit = {},
): CfnSubscriber = CfnSubscriber(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSubscriber(id: String, initializer: @AwsCdkDsl
    CfnSubscriber.Builder.() -> Unit = {}): CfnSubscriber = CfnSubscriber.Builder.create(this,
    id).apply(initializer).build()
