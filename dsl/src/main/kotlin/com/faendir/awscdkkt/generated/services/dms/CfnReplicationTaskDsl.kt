package com.faendir.awscdkkt.generated.services.dms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnReplicationTask
import software.amazon.awscdk.services.dms.CfnReplicationTaskProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReplicationTask(
  id: String,
  props: CfnReplicationTaskProps,
  initializer: @AwsCdkDsl CfnReplicationTask.() -> Unit = {},
): CfnReplicationTask = CfnReplicationTask(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReplicationTask(id: String, initializer: @AwsCdkDsl CfnReplicationTask.Builder.() -> Unit = {}): CfnReplicationTask = CfnReplicationTask.Builder.create(this, id).apply(initializer).build()
