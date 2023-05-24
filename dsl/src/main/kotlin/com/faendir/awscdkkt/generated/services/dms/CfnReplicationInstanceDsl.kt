package com.faendir.awscdkkt.generated.services.dms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnReplicationInstance
import software.amazon.awscdk.services.dms.CfnReplicationInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReplicationInstance(id: String, props: CfnReplicationInstanceProps):
    CfnReplicationInstance = CfnReplicationInstance(this, id, props)

@Generated
public fun Construct.cfnReplicationInstance(
  id: String,
  props: CfnReplicationInstanceProps,
  initializer: @AwsCdkDsl CfnReplicationInstance.() -> Unit,
): CfnReplicationInstance = CfnReplicationInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReplicationInstance(id: String, initializer: @AwsCdkDsl
    CfnReplicationInstance.Builder.() -> Unit): CfnReplicationInstance =
    CfnReplicationInstance.Builder.create(this, id).apply(initializer).build()
