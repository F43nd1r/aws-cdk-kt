package com.faendir.awscdkkt.generated.services.ssmincidents

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSet
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReplicationSet(
  id: String,
  props: CfnReplicationSetProps,
  initializer: @AwsCdkDsl CfnReplicationSet.() -> Unit = {},
): CfnReplicationSet = CfnReplicationSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReplicationSet(id: String, initializer: @AwsCdkDsl
    CfnReplicationSet.Builder.() -> Unit = {}): CfnReplicationSet =
    CfnReplicationSet.Builder.create(this, id).apply(initializer).build()
