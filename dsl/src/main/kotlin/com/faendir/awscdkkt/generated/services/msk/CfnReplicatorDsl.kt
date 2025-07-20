package com.faendir.awscdkkt.generated.services.msk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnReplicator
import software.amazon.awscdk.services.msk.CfnReplicatorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReplicator(
  id: String,
  props: CfnReplicatorProps,
  initializer: @AwsCdkDsl CfnReplicator.() -> Unit = {},
): CfnReplicator = CfnReplicator(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReplicator(id: String, initializer: @AwsCdkDsl CfnReplicator.Builder.() -> Unit = {}): CfnReplicator = CfnReplicator.Builder.create(this, id).apply(initializer).build()
